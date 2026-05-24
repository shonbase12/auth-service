# auth-service

Authentication and authorization for NovaPay. Issues JWTs for merchants.

## Issue 21 Changes
- Implemented enhanced security measures for JWT handling.

## Setup Instructions
1. Clone the repository: `git clone https://github.com/shonbase12/auth-service.git`
2. Navigate to the project directory: `cd auth-service`
3. Install dependencies: `npm install`

## Usage Examples
- To generate a token:
  ```java
  TokenService tokenService = new TokenService();
  String token = tokenService.generateToken(userId);
  ```
- To validate a token:
  ```java
  boolean isValid = tokenService.validateToken(token);
  ```

## Contributing
Please refer to the CONTRIBUTING.md file for guidelines on contributing to this project.