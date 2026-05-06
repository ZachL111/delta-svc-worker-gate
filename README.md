# delta-svc-worker-gate

`delta-svc-worker-gate` is a compact Kotlin repository for backend services, centered on this goal: Design a Kotlin verification harness for worker systems, covering stream reduction, windowed input fixtures, and failure-oriented tests.

## Reason For The Project

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Delta Svc Worker Gate Review Notes

For a quick review, compare `session drift` with `queue pressure` before reading the middle cases.

## What It Does

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/delta-svc-worker-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `session drift` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin code keeps the review rule close to the tests.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

The check exercises the source code and the review fixture. `recovery` is the high score at 243; `baseline` is the low score at 165.

## Boundaries

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
