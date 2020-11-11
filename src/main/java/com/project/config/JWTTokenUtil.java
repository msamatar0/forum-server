package com.project.config;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import com.project.model.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTTokenUtil implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final long TOKEN_VALIDITY = 5 * 60 * 60;
    @Value("${jwt.secret}")
    private String secret;

    public String tokenToUsername(String token){
        return getClaim(token, Claims::getSubject);
    }
    public Date getExpiration(String token) {
        return getClaim(token, Claims::getExpiration);
    }
    public <T> T getClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims getAllClaims(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }
    private Boolean isExpired(String token) {
        final Date expiration = getExpiration(token);
        return expiration.before(new Date());
    }
    public String generateToken(User user) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, user.getUsername());
    }
    private String doGenerateToken(Map<String, Object> claims, String subject) {

        return Jwts.builder()
            .setClaims(claims).setSubject(subject)
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
            .signWith(SignatureAlgorithm.HS512, secret).compact();
    }   
    public Boolean validate(String token, User user) {
        final String username = tokenToUsername(token);
        return (username.equals(user.getUsername()) && !isExpired(token));
    }
}