package com.acharluk.luk;

import com.acharluk.luk.tokenizer.Tokenizer;

/**
 * Created by ACharLuk on 28/09/2014.
 */
public class TokenizerTest {

    public static void main(String[] args) {
        String code =
                "class luk\n" +
                "func main : () -> void\n" +
                "print(\"hola\")"
                ;

        Tokenizer tokenizer = new Tokenizer(code);

        while (tokenizer.hasNextToken()) {
            System.out.println(tokenizer.nextToken().getToken());
        }
    }

}
