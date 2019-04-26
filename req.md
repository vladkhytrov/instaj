- Every instagram request must be executed independently.
- Every request could be executed periodically.
- The result of every request must be persisted (in async way too).
- There must be some sort of "tasks" which consist of grouping/combining requests.
For example there is no reason to execute only follow. Instead follow would be executed
after "media query" on some id.


