package com.acharluk.luk.tokenizer;

/**
 * Created by ACharLuk on 28/09/2014.
 */
public class Token {

    private String token;
    private TokenType type;

    public Token(String token, TokenType type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public TokenType getType() {
        return type;
    }

}
