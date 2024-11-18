# Design a simple URL shortening service (TinyURL)

## Functional Requirement

### Summary

Design a system for creating a URL shortening service similar to TinyURL. This service will generate concise aliases that redirect to the original, longer URLs. Notable examples of such services include bit.ly, ow.ly, and short.io.

### Must-have functions

#### 1. URL Shortening:

- Users can input a long URL and receive a shortened URL in return.
- The system should generate a **unique**, short alias for each long URL.
- **Restful APIs** for programmatic URL shortening and management.

#### 2. URL Redirection:

- When a user accesses a shortened URL, the system should redirect them to the original long URL.

### Nice-to-have functions

* Custom Alias - Allow users to create custom short URLs if the alias is available and valid.
* Provide an option to set an **expiration date** for the shortened URLs
* Analytics - **Track** usage statictics for each shortened URL

## Non-Functional Requirement

1. Performance - the service should generate short URLs **quickly**.
2. URL redirection should be fast.
3. Ensure that shortened URLs are unique and have no collitions
