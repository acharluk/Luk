package com.acharluk.luk.parser;

import com.acharluk.luk.block.Block;
import com.acharluk.luk.block.VariableBlock;
import com.acharluk.luk.tokenizer.Token;
import com.acharluk.luk.tokenizer.TokenType;
import com.acharluk.luk.tokenizer.Tokenizer;

/**
 * Created by ACharLuk on 12/02/2015.
 */
public class VariableParser extends Parser {
    @Override
    public boolean shouldParse(String line) {
        return line.matches("var [a-zA-Z]+ [a-zA-Z0-9]+ = (\")?[a-zA-Z0-9]*(\")?");
    }

    @Override
    public Block parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken(); // "var"

        String type = tokenizer.nextToken().getToken();
        String name = tokenizer.nextToken().getToken();

        tokenizer.nextToken(); // "="

        Token v = tokenizer.nextToken();
        Object value = null;

        if (v.getType() == TokenType.INTEGER_LITERAL) {
            value = Integer.valueOf(v.getToken());
        } else if (v.getType() == TokenType.STRING_LITERAL) {
            value = v.getToken();
        } else {
            //If identifier
            value = superBlock.getVariable(v.getToken()).getValue();
        }

        return new VariableBlock(superBlock, type, name, value);
    }
}
