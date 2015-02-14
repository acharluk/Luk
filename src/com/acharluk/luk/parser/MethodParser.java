package com.acharluk.luk.parser;

import com.acharluk.luk.BuiltInType;
import com.acharluk.luk.Parameter;
import com.acharluk.luk.block.Block;
import com.acharluk.luk.block.Method;
import com.acharluk.luk.tokenizer.Token;
import com.acharluk.luk.tokenizer.Tokenizer;

import java.util.ArrayList;

/**
 * Created by ACharLuk on 06/01/2015.
 */
public class MethodParser extends Parser<Method> {
    @Override
    public boolean shouldParse(String line) {
        return line.matches("func [a-zA-Z][a-zA-Z0-9]* : \\(([a-zA-Z][a-zA-Z0-9]* [a-zA-Z][a-zA-Z0-9]*)*\\) -> [a-zA-Z][a-zA-Z0-9]*");
    }

    @Override
    public Method parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken();

        String name = tokenizer.nextToken().getToken();

        tokenizer.nextToken();
        tokenizer.nextToken();

        Token first = tokenizer.nextToken();

        ArrayList<Parameter> params = new ArrayList<Parameter>();

        if (!first.getToken().equals(")")) {
            String[] paramData = new String[] { first.getToken(), null };

            while (tokenizer.hasNextToken()) {
                Token token = tokenizer.nextToken();

                if (token.getToken().equals(")")) break;
                if (paramData[0] == null) {
                    paramData[0] = token.getToken();
                } else {
                    paramData[1] = token.getToken();

                    params.add(new Parameter(BuiltInType.valueOf(paramData[0].toUpperCase()), paramData[1]));

                    paramData = new String[2];
                }
            }
        }

        tokenizer.nextToken();
        //tokenizer.nextToken();

        String returnType = tokenizer.nextToken().getToken();

        return new Method(superBlock, name, returnType, params.toArray(new Parameter[params.size()]));
    }
}
