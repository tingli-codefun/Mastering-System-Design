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
* Short URL will expire after 1 year after generation by default. Provide an option to set an **expiration date** for the shortened URLs.
* Analytics - **Track** usage statictics for each shortened URL.

## Non-Functional Requirement

1. System could support up to one hundred million of users.
2. Performance - the service should generate short URLs **quickly**, URL redirection should be fast.
3. Ensure that shortened URLs are unique and have no collitions.

## Capacity Estimation

The requirements specify that the system should support up to 100 million users. This is sufficient to begin our capacity estimation.

Assuming each user generates 20 short URLs, and each URL expires after one year, the total number of live URLs will be approximately **2 billion**.

For a typical URL shortening service, the read/write ratio is often 100:1, meaning each generated short URL will be accessed (read) 100 times for every write. As a result, the system must handle **200 billion read requests per year**, which translates to about **6,500 queries per second (QPS)**, with around **60 updates per second**.

In terms of database storage, with approximately **4 billion rows** (2 billion URLs × 2 for necessary data fields) and an average row size of **2 KB**, the total storage required would be around **8 TB**.

## High-Level Design

#### How short can the short URL be?

We should aim to make the URL as short as possible while ensuring there are at least 2 billion unique short URLs. Using only lowercase and uppercase characters, along with digits, a length of 6 characters will be sufficient. This is because 62662^6**6**2**6** gives more than 50 billion unique combinations.~~~~

### Where to store data?

For persistent storage, relational databases like MySQL, PostgreSQL, or Oracle are excellent options. For performance optimization, a caching layer may be required (discussed later), and Redis would be a great choice for this purpose.

Does 

## Data-Structure Design

## API Design

## Deep-Dive
