# Operator Guide

1. Confirm incorporation complete (Handelsregister entry, Amt für Justiz
   Firmenindex — https://handelsregister.li/).
2. Intake against vergaben.llv.li (Liechtenstein's public-procurement
   notice platform, ÖAWG/ÖAWV).
3. Compare checklist to PEID (Office of Statistics) and FL-UID VAT
   registration (Steuerverwaltung). If the engagement is a foreign
   digital-service provider crossing the CHF 100'000 worldwide-turnover
   threshold, a locally-based fiscal representative must be on file
   before VAT registration is possible — this actor's governor will HARD
   hold `:filing/submit` if `:requires-fiscal-rep? true` and
   `:has-fiscal-rep?` is not independently confirmed.
4. Human-gated filing only — `:filing/draft`/`:filing/submit` always
   escalate to the market-entry operator for approval, at every rollout
   phase.
