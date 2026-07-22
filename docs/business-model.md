# Business Model: Independent Public-Sector Market-Entry & Procurement Compliance Service — Liechtenstein

## Classification

- Repository: `cloud-itonami-iso3166-lie`
- ISO 3166: `LIE` (Liechtenstein)

## Offer

- registration walkthrough for vergaben.llv.li (Liechtenstein's public-procurement
  notice platform, branded "ANKÖ"), under the Gesetz über das Öffentliche
  Auftragswesen (ÖAWG, LGBl 1998 Nr. 135) and its implementing ordinance
  (ÖAWV, LGBl 1998 Nr. 189)
- business/commercial-register checklist: Handelsregister extract (Amt für
  Justiz Firmenindex, handelsregister.li), governed by the Personen- und
  Gesellschaftsrecht (PGR, LGBl 1926 Nr. 4) Art. 944 ff. and the
  Handelsregisterverordnung (HRV, LGBl 2003 Nr. 66)
- tax/VAT checklist: PEID (Office of Statistics master identifier) and
  FL-UID (Steuerverwaltung VAT identifier); a foreign digital-service
  provider crossing the CHF 100'000 worldwide-turnover threshold must
  appoint a locally-based fiscal representative before VAT registration
  is even possible
- local-content / structural navigation: Liechtenstein is in a customs
  and currency union with Switzerland (since 1924, renegotiated 1994)
  while ALSO being an EEA member since May 1995 (Switzerland itself
  rejected EEA membership in 1992) -- so EU/EEA single-market law (e.g.
  the GDPR, directly applicable in Liechtenstein since 20 July 2018 via
  the EEA Agreement) sits alongside Swiss-mirrored VAT/currency rules.
  This actor's flagship governor check exists precisely because that
  duality means "same as Switzerland" is not a safe assumption for
  market entry.
- recurring regulatory-change monitoring
- compliance-audit export package

## Trust Controls

- `:filing/submit` never automated
- fabricated regulatory claims are HARD holds
- not legal advice — route to Liechtenstein-licensed counsel

## Investigated and deliberately NOT modeled

The FMA (Financial Market Authority) Liechtenstein was investigated as
a candidate flagship mechanism, given Liechtenstein's well-known role as
a financial-services/holding-company jurisdiction. Per fma-li.li
(fetched directly), the FMA licenses banks, investment firms, insurance
undertakings, pension funds, asset managers and (under MiCAR)
crypto-asset service providers -- a sector-scoped licensing regime, not
a general market-entry gate. An ordinary Handelsregister/ÖAWG-scoped
engagement that is not itself a financial intermediary has no FMA gate
to check. Rather than force an FMA check into this general-purpose
governor, this gap is disclosed honestly here and in
`src/marketentry/facts.cljc` / `src/marketentry/governor.cljc`. A future
LIE financial-services-specific vertical would be the right place for an
FMA licensing check.
