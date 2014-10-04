package com.acharluk.luk.parser;

import com.acharluk.luk.block.Block;
import com.acharluk.luk.block.Class;
import com.acharluk.luk.tokenizer.Tokenizer;

/**
 * Created by ACharLuk on 04/10/2014.
 */
public class ClassParser extends Parser<Class> {
    @Override
    public boolean shouldParse(String line) {
        return line.matches("class [a-zA-Z][a-zA-Z0-9]*");
    }

    @Override
    public Class parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken();
        String name = tokenizer.nextToken().getToken();
        return new Class(name);
    }
}
