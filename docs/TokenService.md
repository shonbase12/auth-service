# TokenService Documentation

## Overview
The TokenService class is responsible for managing token generation and validation.

## Methods
- `generateToken(userId: String): String`
  - Generates a token for the specified user ID.

- `validateToken(token: String): Boolean`
  - Validates the provided token and returns true if valid, false otherwise.

## Usage
```java
TokenService tokenService = new TokenService();
String token = tokenService.generateToken("user123");
boolean isValid = tokenService.validateToken(token);
```
