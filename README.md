# auth-service

Authentication and authorization for NovaPay. Issues JWTs for merchants.

## Security Enhancements
- Implemented enhanced security measures for JWT handling (Issue 21)

## Getting Started
1. Clone: `git clone https://github.com/shonbase12/auth-service.git`
2. Navigate: `cd auth-service`
3. Install: `npm install`

## Usage
**Generate token**:
```java
TokenService tokenService = new TokenService();
String token = tokenService.generateToken(userId);
```
**Validate token**:
```java
boolean isValid = tokenService.validateToken(token);
```

## Contributing
See CONTRIBUTING.md for guidelines.