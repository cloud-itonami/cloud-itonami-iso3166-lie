(ns statute.facts
  "General-law compliance catalog for Liechtenstein (LIE) -- a
  country-level entry alongside cloud-itonami-iso3166-jpn/-usa/-gbr/
  -deu/-fra/-can/-aus/-kor/-nld/-ita/-esp/-swe/-nor/-dnk/-fin/-prt/-bel/
  -bra/-mex/-chl/-arg/-zaf/-col/-ury/-cri/-pan/-ecu/-pry/-gtm/-hnd/-ind/
  -ken/-tha/-are/-vnm/-idn/-phl/-egy/-tur/-nga/-sau/-mys/-aut/-che per
  ADR-2607141700 (cloud-itonami-compliance-fact-federation).

  Every entry below was independently fetched and read this session.
  Liechtenstein's official consolidated-law portal (gesetze.li, 'Lilex')
  was directly reachable (unlike llv.li, which returned HTTP 403 to
  every fetch attempt this session, apparently bot-protected -- not
  worked around, per this workspace's policy against defeating bot
  detection). Direct-link convention on gesetze.li itself:
  www.gesetze.li/konso/[LGBl-Nr] always resolves to the current
  consolidated version of that instrument.

  Personen- und Gesellschaftsrecht (PGR) -- LGBl 1926 Nr. 4, LR-Nr
  216.0 -- confirmed directly at https://www.gesetze.li/konso/1926.004,
  which states the title verbatim: 'Personen- und Gesellschaftsrecht
  (PGR) vom 20. Januar 1926'.

  Handelsregisterverordnung (HRV) -- LGBl 2003 Nr. 66, LR-Nr 216.012 --
  confirmed directly at https://www.gesetze.li/konso/2003.066, title
  verbatim: 'Verordnung vom 11. Februar 2003 über das Handelsregister
  (Handelsregisterverordnung; HRV)'. Per
  de.wikipedia.org/wiki/Handelsregister_(Liechtenstein) (fetched and
  read this session): 'Das Handelsregister ist seit 1. Februar 2013 Teil
  des Amts für Justiz' -- the register is administered by the Amt für
  Justiz (Office of Justice), legal basis Art. 944 ff PGR + this HRV.

  Gesetz über das Öffentliche Auftragswesen (ÖAWG) -- LGBl 1998 Nr. 135,
  LR-Nr 172.051 -- confirmed directly at
  https://www.gesetze.li/konso/1998.135, title verbatim: 'Gesetz vom 19.
  Juni 1998 über das Öffentliche Auftragswesen (ÖAWG)'. Notice platform:
  vergaben.llv.li (branded 'ANKÖ'), fetched and confirmed to be
  Liechtenstein's own public-procurement announcement site.

  GDPR applicability via the EEA Agreement -- confirmed directly at
  en.wikipedia.org/wiki/General_Data_Protection_Regulation, which states
  verbatim: '20 July 2018: the GDPR became valid in the EEA countries
  (Iceland, Liechtenstein, and Norway), after the EEA Joint Committee and
  the three countries agreed to follow the regulation.' This is a
  genuinely distinctive structural fact: unlike Switzerland (not an EEA
  member, and which has its own separate Federal Act on Data Protection),
  Liechtenstein's EEA membership means the GDPR itself is the applicable
  data-protection instrument, layered onto its customs/currency union
  with Switzerland (confirmed at
  en.wikipedia.org/wiki/Liechtenstein-Switzerland_relations: a customs
  union since 1924/renegotiated 1994, while 'Liechtenstein accepted [EEA
  membership] in a corresponding referendum' that Switzerland rejected in
  1992, joining the EEA in May 1995).

  Employment-contract law -- per lanv.li (Liechtensteinischer
  ArbeitnehmerInnenverband, the national employee association),
  fetched and read this session at
  https://www.lanv.li/arbeit-und-recht/gesetzliche-grundlagen: the
  page cites 'Allgemeines bürgerliches Gesetzbuch (ABGB) Art. 1173a ff.'
  as the legal basis for the employment contract (Arbeitsvertragsrecht),
  alongside the separate Arbeitsgesetz (ArG, 'Gesetz über die Arbeit in
  Industrie, Gewerbe und Handel'). GAP DISCLOSURE: this session could
  not independently confirm an exact LGBl number or enactment date for
  either instrument via a directly-fetched primary source (llv.li and
  gesetze.li LGBl-number guesses for this specific text did not
  resolve), so `:statute/law-number` records exactly the citation lanv.li
  gives and `:statute/enacted-date` is intentionally OMITTED rather than
  guessed.

  An entry not in this table has NO spec-basis, full stop; extend
  `catalog`, do not invent an id/url/date.")

(def catalog
  "ISO3166 alpha-3 -> vector of statute entries."
  {"LIE"
   [{:statute/id "lie.pgr-1926"
     :statute/title "Personen- und Gesellschaftsrecht (PGR)"
     :statute/jurisdiction "LIE"
     :statute/kind :law
     :statute/law-number "LGBl 1926 Nr. 4 (LR 216.0)"
     :statute/url "https://www.gesetze.li/konso/1926.004"
     :statute/url-provenance :gesetze-li-official-portal
     :statute/enacted-date "1926-01-20"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:corporate-governance :incorporation}}
    {:statute/id "lie.handelsregisterverordnung-2003"
     :statute/title "Handelsregisterverordnung (HRV)"
     :statute/jurisdiction "LIE"
     :statute/kind :regulation
     :statute/law-number "LGBl 2003 Nr. 66 (LR 216.012)"
     :statute/url "https://www.gesetze.li/konso/2003.066"
     :statute/url-provenance :gesetze-li-official-portal
     :statute/enacted-date "2003-02-11"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:corporate-governance :commercial-register}}
    {:statute/id "lie.oeawg-1998"
     :statute/title "Gesetz über das Öffentliche Auftragswesen (ÖAWG)"
     :statute/jurisdiction "LIE"
     :statute/kind :law
     :statute/law-number "LGBl 1998 Nr. 135 (LR 172.051)"
     :statute/url "https://www.gesetze.li/konso/1998.135"
     :statute/url-provenance :gesetze-li-official-portal
     :statute/enacted-date "1998-06-19"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:public-procurement}}
    {:statute/id "lie.gdpr-eea-2018"
     :statute/title "General Data Protection Regulation (EU) 2016/679, as applied in Liechtenstein via the EEA Agreement"
     :statute/jurisdiction "LIE"
     :statute/kind :regulation
     :statute/law-number "EU 2016/679 (EEA Joint Committee Decision)"
     :statute/url "https://en.wikipedia.org/wiki/General_Data_Protection_Regulation"
     :statute/url-provenance :wikipedia-en
     :statute/enacted-date "2018-07-20"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:data-protection :privacy}}
    {:statute/id "lie.employment-contract-abgb-1173a"
     :statute/title "Allgemeines bürgerliches Gesetzbuch (ABGB), Art. 1173a ff. -- Arbeitsvertragsrecht (employment-contract law)"
     :statute/jurisdiction "LIE"
     :statute/kind :law
     :statute/law-number "ABGB Art. 1173a ff."
     :statute/url "https://www.lanv.li/arbeit-und-recht/gesetzliche-grundlagen"
     :statute/url-provenance :lanv-li-employee-association
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:labor :employment}}]})

(defn spec-basis [jurisdiction] (get catalog jurisdiction))

(defn coverage
  ([] (coverage (keys catalog)))
  ([jurisdictions]
   (let [have (filter catalog jurisdictions)
         missing (remove catalog jurisdictions)]
     {:requested (count jurisdictions)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-lie statute.facts Wave 0 (ADR-2607141700): "
                 (count (get catalog "LIE")) " Liechtenstein entries seeded "
                 "with gesetze.li/wikipedia.org/lanv.li citations. "
                 "Extend `statute.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [jurisdiction topic]
  (filterv #(contains? (:statute/topic %) topic) (spec-basis jurisdiction)))
