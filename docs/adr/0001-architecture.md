# ADR-0001: LIE marketentry :implemented

Flagship `fiscal-rep-missing`, tax check `peid-unverified`.

Grounded in directly-fetched primary sources (gesetze.li, the official
Liechtenstein consolidated-law portal): the Personen- und
Gesellschaftsrecht (PGR, LGBl 1926 Nr. 4), the Handelsregisterverordnung
(HRV, LGBl 2003 Nr. 66), and the Gesetz/Verordnung über das Öffentliche
Auftragswesen (ÖAWG/ÖAWV, LGBl 1998 Nr. 135/189). The flagship governor
check is grounded in Liechtenstein's own Steuerverwaltung-administered
VAT-registration rule for foreign digital-service providers (a
locally-based fiscal representative is required once the CHF 100'000
worldwide-turnover threshold is crossed), a genuinely distinct
mechanism from CHE's `ch-presence-missing` check — not copied verbatim.

The FMA (Financial Market Authority) was investigated and found to be
sector-scoped (banks/investment firms/insurance/asset managers/
crypto-asset providers under MiCAR), not a general market-entry gate,
so it was deliberately excluded rather than force-fit. See
`src/marketentry/facts.cljc` and `src/marketentry/governor.cljc` for the
full citation trail and gap disclosure.
