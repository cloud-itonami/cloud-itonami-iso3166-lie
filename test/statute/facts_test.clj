(ns statute.facts-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [statute.facts :as facts]))

(deftest lie-has-spec-basis
  (let [sb (facts/spec-basis "LIE")]
    (is (= 5 (count sb)))
    (is (every? #(str/starts-with? (:statute/url %) "https://") sb))
    (is (every? :statute/law-number sb))))

(deftest unknown-jurisdiction-has-no-spec-basis
  (is (nil? (facts/spec-basis "ATL")))
  (is (nil? (facts/spec-basis "ZZZ"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["LIE" "JPN" "ATL"])]
    (is (= 3 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["ATL" "JPN"] (:missing-jurisdictions c)))))

(deftest by-topic-filters
  (is (= ["lie.gdpr-eea-2018"]
         (mapv :statute/id (facts/by-topic "LIE" :privacy))))
  (is (= ["lie.employment-contract-abgb-1173a"]
         (mapv :statute/id (facts/by-topic "LIE" :labor))))
  (is (empty? (facts/by-topic "ATL" :privacy))))
