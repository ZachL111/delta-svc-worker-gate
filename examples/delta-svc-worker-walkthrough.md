# Delta Svc Worker Gate Walkthrough

This note is the quickest way to read the extra review model in `delta-svc-worker-gate`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 165 | ship |
| stress | retry load | 240 | ship |
| edge | worker slack | 169 | ship |
| recovery | session drift | 243 | ship |
| stale | queue pressure | 210 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `session drift` against `queue pressure`, not the raw score alone.
