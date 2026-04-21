# Auth Service

Authentication and authorization service for NovaPay. This service is responsible for issuing JWT tokens for merchants and validating incoming requests.

## Description
The Auth Service provides:
- **JWT Issuance**: Generates JWT tokens that clients must include in their requests to access other services.
- **Token Validation**: Validates JWT tokens to ensure that requests are authorized.
- **User Management**: Handles user registration and profile management.

## Key Features
- Secure JWT issuance and validation.
- Ability to manage user accounts and credentials.

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone https://github.com/shonbase12/auth-service.git
   cd auth-service
   ```

2. **Install dependencies**:
   ```bash
   npm install
   ```

3. **Build the project**:
   ```bash
   npm run build
   ```

4. **Run the service**:
   ```bash
   npm start
   ```

5. **Configuration**:
   - Create a `.env` file in the root directory and add the following variables:
     ```
     PORT=4000
     JWT_SECRET=<your_jwt_secret>
     ```

## Usage Examples
- **Register a User**:
  To register a new user, make a POST request to `/auth/register` with the following payload:
  ```json
  {
    "username": "new_user",
    "password": "your_password"
  }
  ```

- **Login**:
  To log in and receive a JWT token, make a POST request to `/auth/login` with the following payload:
  ```json
  {
    "username": "your_username",
    "password": "your_password"
  }
  ```

- **Validate Token**:
  Use the JWT token received from the login step to validate requests:
  ```bash
  curl -H "Authorization: Bearer <your_jwt_token>" http://localhost:4000/protected/resource
  ```

## API Endpoints
- **POST /auth/register**: Register a new user.
- **POST /auth/login**: Authenticate a user and issue a JWT token.

For detailed API documentation, please refer to the [API Documentation](link-to-api-docs).