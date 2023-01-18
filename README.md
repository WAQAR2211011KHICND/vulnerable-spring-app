## Muhammad Waqar & Anoosha Rasheed & Hasan Haider
# Security in Spring Boot
This repository contains a project with a number of vulnerabilities that you will need to fix

- XSS
- SQL Injection
- Identification and Authentication failures
- Security logging and monitoring failures
- Cryptographic Failure

# XSS Resolve
XSS attack - using sanitization of text by specifying the th:text - that treats as text
SQL Inj..  - we prevent this by using the spring hibernation database process - "REPOSITORY.findbyId"
Cryptographic Failure - the jwt cryptographic key is very simple that is vernulable to attack because it can be easily be guessed.