(ns culture.facts
  "Country-level regional-culture catalog for Liechtenstein (LIE) -- national
  dishes, protected products, beverages, crafts, festivals and heritage
  sites, per ADR-2607171400 addendum 2 (cloud-itonami-municipality-
  culture-catalog Wave 1, in com-junkawasaki/root). Sibling namespace to
  `marketentry.facts` / `statute.facts` (ADR-2607141700); city-level
  counterparts live in the cloud-itonami-municipality-* repos.

  Catalog is keyed by UPPERCASE ISO3 (mirrors `statute.facts`); entries
  carry no :culture/municipality (that attribute is city-level only).

  Every entry cites a source URL that was actually fetched and read on
  :culture/retrieved-at -- never fabricated. Summaries state only what the
  cited source confirms. An item not in this table has NO spec-basis, full
  stop; extend `catalog`, do not invent an id/url.")

(def catalog
  "iso3 -> vector of culture entries."
  {"LIE"
   [{:culture/id "lie.dish.kaesespaetzle"
     :culture/name "Käsespätzle"
     :culture/name-local "Käsknöpfle"
     :culture/country "LIE"
     :culture/kind :dish
     :culture/summary "Cheese-noodle dish traditional to Swabia, Vorarlberg, Tyrol, Liechtenstein and Switzerland; in Liechtenstein it is usually served with apple sauce."
     :culture/url "https://en.wikipedia.org/wiki/K%C3%A4sesp%C3%A4tzle"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lie.dish.hafalaab"
     :culture/name "Hafalaab"
     :culture/country "LIE"
     :culture/kind :dish
     :culture/summary "Soup with ham or bacon and cornmeal dumplings, part of Liechtensteiner cuisine."
     :culture/url "https://en.wikipedia.org/wiki/Liechtenstein_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lie.dish.torkarebl"
     :culture/name "Torkarebl"
     :culture/country "LIE"
     :culture/kind :dish
     :culture/summary "Porridge dish resembling dumplings, part of Liechtensteiner cuisine."
     :culture/url "https://en.wikipedia.org/wiki/Liechtenstein_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lie.product.saukerkas"
     :culture/name "Saukerkas"
     :culture/country "LIE"
     :culture/kind :product
     :culture/summary "Cheese produced in Liechtenstein, named in accounts of Liechtensteiner cuisine."
     :culture/url "https://en.wikipedia.org/wiki/Liechtenstein_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lie.festival.national-day"
     :culture/name "Liechtenstein National Day"
     :culture/name-local "Staatsfeiertag"
     :culture/country "LIE"
     :culture/kind :festival
     :culture/summary "Celebrated annually on 15 August with a ceremony outside Vaduz Castle, a folk festival in Vaduz and fireworks; jointly celebrates the Assumption of Mary and the country's independence."
     :culture/url "https://en.wikipedia.org/wiki/Liechtenstein_National_Day"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lie.heritage.vaduz-castle"
     :culture/name "Vaduz Castle"
     :culture/name-local "Schloss Vaduz"
     :culture/country "LIE"
     :culture/kind :heritage
     :culture/summary "Hilltop castle begun in the 12th century overlooking the capital; official residence of the Prince of Liechtenstein and primary residence of the princely family since 1938."
     :culture/url "https://en.wikipedia.org/wiki/Vaduz_Castle"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}]})

(defn spec-basis [iso3] (get catalog iso3))

(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-lie culture catalog "
                 "(ADR-2607171400 addendum 2, Wave 1): " (count (get catalog "LIE"))
                 " LIE entries, each with a fetched-and-read citation. "
                 "Extend `culture.facts/catalog`, never fabricate an id/url.")})))

(defn by-kind [iso3 kind]
  (filterv #(= (:culture/kind %) kind) (spec-basis iso3)))
