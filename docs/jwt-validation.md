## JWT Validation Logic

The JWT validation process involves the following steps:

1. **Token Parsing**: The JWT is split into its three parts: header, payload, and signature.
2. **Signature Verification**: The signature is verified using the public key associated with the issuer.
3. **Claim Validation**: Claims such as `exp` (expiration time), `nbf` (not before), and `iss` (issuer) are checked to ensure the token is valid and issued by a trusted source.
4. **Audience Check**: The `aud` (audience) claim is verified to ensure the token is intended for the correct recipient.
5. **Custom Claims**: Any custom claims specific to the application are validated according to business rules.

If all checks pass, the token is considered valid.