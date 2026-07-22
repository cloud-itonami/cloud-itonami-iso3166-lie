# cloud-itonami-iso3166-lie

**`:implemented`** for **LIE** (Liechtenstein). Flagship check
`fiscal-rep-missing`, tax-identifier check `peid-unverified`.

```
clojure -M:dev:test
```

AGPL-3.0-or-later.

## What this is

An independent public-sector market-entry & procurement compliance
actor for Liechtenstein, following the same "governed actor" pattern as
every other `cloud-itonami-iso3166-*` repo in this fleet: a contained
MarketEntry-LLM advisor (`src/marketentry/marketentryllm.cljc`) whose
proposals are always censored by an independent Market-Entry Compliance
Governor (`src/marketentry/governor.cljc`) before anything commits to
the SSoT (`src/marketentry/store.cljc`), expressed as a langgraph-clj
StateGraph (`src/marketentry/operation.cljc`) with human-in-the-loop
approval and an append-only audit ledger.

## Why Liechtenstein is structurally distinctive

Liechtenstein is a German-speaking micro-economy in a currency and
customs union with Switzerland since 1924 (renegotiated 1994) -- but,
unlike Switzerland, it is also an EEA (European Economic Area) member
(acceded May 1995, after Switzerland rejected EEA membership in its own
1992 referendum). That means Liechtenstein applies substantial EU
single-market law (e.g. the GDPR itself became directly applicable in
Liechtenstein on 20 July 2018 via the EEA Agreement) *while also*
sharing Switzerland's currency and mirroring its VAT rate/law by
treaty. This dual structure is what grounds this vertical's flagship
governor check: Liechtenstein independently administers its OWN VAT
registration (via the Steuerverwaltung, the Tax Administration), and a
foreign digital-service provider crossing the CHF 100'000
worldwide-turnover threshold cannot register at all without first
appointing a locally-based fiscal representative. See
`src/marketentry/facts.cljc` and `src/marketentry/governor.cljc` for
the full citation trail and an honest gap-disclosure of what was
investigated and NOT used (the FMA, Liechtenstein's financial-services
regulator, licenses banks/investment firms/insurance/asset
managers/crypto-asset providers under MiCAR -- but that is sector-scoped,
not a general market-entry gate, so it was not force-fit into this
governor).

## Culture catalog

Alongside the market-entry / statute catalogs, this repo carries a
**country-level regional-culture catalog** (ADR-2607171400 addendum 2,
`cloud-itonami-municipality-culture-catalog` Wave 1, in
`com-junkawasaki/root`) — national dishes, protected products, beverages,
crafts, festivals and heritage sites for Liechtenstein:

- `src/culture/facts.cljc` — the catalog, source of truth (keyed by
  uppercase ISO3, mirroring `statute.facts`).
- `schema/culture.edn` — DataScript schema.
- `data/culture-tx.edn` — derived DataScript tx-data (regenerated from
  the catalog, never hand-edited).

City-level counterparts live in the `cloud-itonami-municipality-*` repos.
Same provenance discipline as the compliance catalogs: every entry cites a
source URL that was actually fetched and read on `:culture/retrieved-at`;
summaries state only what the cited source confirms. An item not in
`culture.facts/catalog` has no spec-basis — never fabricate one.

## Culture catalog

Alongside the market-entry / statute catalogs, this repo carries a
**country-level regional-culture catalog** (ADR-2607171400 addendum 2,
`cloud-itonami-municipality-culture-catalog` Wave 1, in
`com-junkawasaki/root`) — national dishes, protected products, beverages,
crafts, festivals and heritage sites for Liechtenstein:

- `src/culture/facts.cljc` — the catalog, source of truth (keyed by
  uppercase ISO3, mirroring `statute.facts`).
- `schema/culture.edn` — DataScript schema.
- `data/culture-tx.edn` — derived DataScript tx-data (regenerated from
  the catalog, never hand-edited).

City-level counterparts live in the `cloud-itonami-municipality-*` repos.
Same provenance discipline as the compliance catalogs: every entry cites a
source URL that was actually fetched and read on `:culture/retrieved-at`;
summaries state only what the cited source confirms. An item not in
`culture.facts/catalog` has no spec-basis — never fabricate one.
