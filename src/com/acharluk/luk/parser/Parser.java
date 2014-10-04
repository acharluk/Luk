package com.acharluk.luk.parser;

import com.acharluk.luk.block.Block;
import com.acharluk.luk.tokenizer.Tokenizer;

/**
 * Created by ACharLuk on 02/10/2014.
 */
public abstract class Parser<T extends Block> {

    public abstract boolean shouldParse(String line);

    public abstract T parse(Block superBlock, Tokenizer tokenizer);
}
