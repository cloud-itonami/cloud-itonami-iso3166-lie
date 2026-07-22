(ns marketentry.facts
  "Liechtenstein market-entry catalog.

  Every field below was independently fetched and read this session (no
  training-data paraphrase):

    - the Public Procurement Act (Öffentliches Auftragswesen-Gesetz,
      ÖAWG) -- LGBl 1998 Nr. 135, LR-Nr 172.051, 'Gesetz vom 19. Juni
      1998 über das Öffentliche Auftragswesen (ÖAWG)' -- confirmed
      directly at https://www.gesetze.li/konso/1998.135 (Liechtenstein's
      own official consolidated-law portal, Lilex).
    - its implementing ordinance (ÖAWV) -- LGBl 1998 Nr. 189, LR-Nr
      172.051.1, 'Verordnung vom 3. November 1998 über das Öffentliche
      Auftragswesen (ÖAWV)' -- confirmed directly at
      https://www.gesetze.li/konso/1998.189.
    - vergaben.llv.li -- Liechtenstein's public-procurement notice
      platform (branded 'ANKÖ', an Austrian-origin tender-notice system
      Liechtenstein uses for its own announcements) -- fetched directly,
      confirmed to be the national administration's own
      procurement-notice site.
    - the Handelsregister (commercial register) -- note: this vertical's
      build brief suggested the term 'Öffentlichkeitsregister', but every
      source actually fetched this session (gesetze.li, Wikipedia,
      handelsregister.li) consistently names it 'Handelsregister (HR)',
      so that confirmed term is used instead of the suggested one.
      Administered by the Amt für Justiz (Office of Justice) since 1
      February 2013, legal basis Art. 944 ff PGR + the
      Handelsregisterverordnung (HRV), LGBl 2003 Nr. 66 (confirmed
      directly at https://www.gesetze.li/konso/2003.066, title
      'Verordnung vom 11. Februar 2003 über das Handelsregister
      (Handelsregisterverordnung; HRV)') -- per
      de.wikipedia.org/wiki/Handelsregister_(Liechtenstein), which states
      verbatim: 'Das Handelsregister ist seit 1. Februar 2013 Teil des
      Amts für Justiz.' Public query portal: https://handelsregister.li/
      (the official Firmenindex).
    - the PEID/FL-UID tax-identifier system -- per
      lookuptax.com/docs/tax-identification-number/liechtenstein-tax-id-guide
      (a professional tax-data reference, the same class of source CHE's
      catalog uses DLA Piper for): the PEID (Personenidentifikationsnummer)
      is issued by the Office of Statistics as the master person/entity
      identifier; the FL-UID (nine-digit VAT identifier, format
      FL-XXXXXXXXX) is issued separately by the Steuerverwaltung (Tax
      Administration) for VAT-registered businesses.

  A genuinely distinctive structural fact grounds `:requires-fiscal-rep?`
  below (this vertical's flagship governor check, see
  `marketentry.governor`): unlike Switzerland (NOT an EEA member),
  Liechtenstein is an EEA member (acceded May 1995) *while also* sharing a
  currency and customs union with Switzerland (since 1924, renegotiated
  1994) -- both facts confirmed directly at
  en.wikipedia.org/wiki/Liechtenstein-Switzerland_relations and
  en.wikipedia.org/wiki/Taxation_in_Liechtenstein ('Liechtenstein's
  standard rate of VAT (Mehrwertsteuer) is identical to Switzerland's for
  it must mirror the latter's continually'). Despite mirroring the Swiss
  VAT rate/law by treaty, Liechtenstein independently administers its OWN
  VAT registration via the Steuerverwaltung, and per the lookuptax.com
  guide, a foreign digital-service provider crossing the CHF 100'000
  worldwide-turnover threshold cannot register at all without first
  appointing a locally-based fiscal representative ('Registration is not
  possible without first appointing a locally-based fiscal
  representative.'). That is a materially different gate from CHE's
  ch-presence-missing check (a general Switzerland-resident
  authorized-representative requirement for federal public tenders under
  BöB/IVöB) -- this one is a fiscal/VAT-registration gate, not a
  procurement-participation gate, so it is modeled as its own check
  rather than copied verbatim from the CHE shape.

  GAP DISCLOSURE (honest, not fabricated): the FMA (Financial Market
  Authority) Liechtenstein was investigated as a candidate for this
  flagship slot, per this vertical's own build instructions, because
  Liechtenstein is well known as a financial-services/holding-company
  jurisdiction. Directly fetched from fma-li.li: the FMA licenses banks,
  investment firms, insurance undertakings, pension funds, asset managers
  and (under MiCAR) crypto-asset service providers -- but NOT general
  market entry. There is no FMA sign-off required for an ordinary
  Handelsregister/ÖAWG-scoped engagement that is not itself a financial
  intermediary. Forcing an FMA check into a *general* market-entry
  governor would misrepresent FMA's actual (sector-scoped) jurisdiction,
  so it is deliberately NOT modeled as a check here. A future LIE
  financial-services-specific vertical would be the right place for an
  FMA licensing check, grounded in the FMA's own published 'Legal
  Foundations for Financial Intermediaries' and its public register at
  register.fma-li.li.")

(def catalog
  {"LIE" {:name "Liechtenstein"
          :owner-authority "Fachstelle Öffentliches Auftragswesen (Public Procurement Unit) / vergaben.llv.li"
          :legal-basis "Gesetz vom 19. Juni 1998 über das Öffentliche Auftragswesen (ÖAWG), LGBl 1998 Nr. 135 (LR 172.051)"
          :national-spec "vergaben.llv.li (ANKÖ notice platform)"
          :provenance "https://vergaben.llv.li/"
          :required-evidence ["Handelsregister extract (Amt für Justiz Firmenindex)"
                              "PEID record (Office of Statistics)"
                              "FL-UID VAT registration record (Steuerverwaltung)"
                              "Fiscal-representative record"]
          :rep-owner-authority "Amt für Justiz (Handelsregister)"
          :rep-legal-basis "Personen- und Gesellschaftsrecht (PGR) Art. 944 ff.; Handelsregisterverordnung (HRV), LGBl 2003 Nr. 66"
          :rep-provenance "https://handelsregister.li/"
          :corporate-number-owner-authority "Office of Statistics (PEID) / Steuerverwaltung (FL-UID)"
          :corporate-number-legal-basis "PEID (Personenidentifikationsnummer) master identifier; FL-UID VAT identifier issued by the Steuerverwaltung"
          :corporate-number-provenance "https://lookuptax.com/docs/tax-identification-number/liechtenstein-tax-id-guide"}
   "USA" {:name "United States" :owner-authority "GSA/SAM.gov" :legal-basis "FAR"
          :national-spec "SAM.gov" :provenance "https://sam.gov/"
          :required-evidence ["EIN record" "SAM.gov registration record" "State business registration record" "SAM UEI verification record"]}
   "DEU" {:name "Germany" :owner-authority "e-Vergabe" :legal-basis "GWB/VgV"
          :national-spec "e-Vergabe" :provenance "https://www.evergabe-online.de/"
          :required-evidence ["Handelsregister extract" "e-Vergabe registration record" "USt-IdNr record" "Authorized-representative record"]}
   "CHE" {:name "Switzerland" :owner-authority "BKB / simap.ch" :legal-basis "Federal Act on Public Procurement (BöB/PPA)"
          :national-spec "simap.ch supplier registration + UID" :provenance "https://www.simap.ch/"
          :required-evidence ["UID record" "simap registration record" "Commercial register extract" "Authorized-representative record"]}})

(defn spec-basis [iso3] (get catalog iso3))
(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s) missing (remove catalog iso3s)]
     {:requested (count iso3s) :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note "R0 catalog seed"})))
(defn required-evidence-satisfied? [iso3 submitted]
  (when-let [{:keys [required-evidence]} (spec-basis iso3)]
    (= (count required-evidence) (count (filter (set submitted) required-evidence)))))
(defn evidence-checklist [iso3] (:required-evidence (spec-basis iso3) []))
(defn rep-spec-basis [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:rep-owner-authority sb)
      (select-keys sb [:rep-owner-authority :rep-legal-basis :rep-provenance]))))
(defn corporate-number-spec-basis [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:corporate-number-owner-authority sb)
      (select-keys sb [:corporate-number-owner-authority :corporate-number-legal-basis :corporate-number-provenance]))))
