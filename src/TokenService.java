package com.novapay.auth;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
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
        return Jwts.parser()
            .setSigningKey(jwtSecret)
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
    }
}
