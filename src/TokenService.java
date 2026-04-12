package com.novapay.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;

import java.util.Date;

public class TokenService {
    private final String jwtSecret;
    private final long expiryMs;

    public TokenService(String jwtSecret, long expiryMs) {
        this.jwtSecret = jwtSecret;
        this.expiryMs = expiryMs;
    }

    public String issue(String merchantId) {
        return Jwts.builder()
            .setSubject(merchantId)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + expiryMs))
            .signWith(SignatureAlgorithm.HS256, jwtSecret)
            .compact();
    }

    public String verify(String token) {
        try {
            Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody();
            // Additional claims verification can be added here
            return claims.getSubject();
        } catch (ExpiredJwtException e) {
            // Token is expired
            throw new RuntimeException("Token is expired", e);
        } catch (SignatureException e) {
            // Invalid signature
            throw new RuntimeException("Invalid token signature", e);
        } catch (MalformedJwtException e) {
            // Token is malformed
            throw new RuntimeException("Malformed token", e);
        } catch (Exception e) {
            // Other exceptions
            throw new RuntimeException("Token verification failed", e);
        }
    }
}