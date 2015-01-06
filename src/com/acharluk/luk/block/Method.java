package com.acharluk.luk.block;

import com.acharluk.luk.Parameter;
import com.acharluk.luk.Type;
import com.acharluk.luk.Value;

/**
 * Created by ACharLuk on 06/01/2015.
 */
public class Method extends Block {

    private String name;
    private Type type;
    private Parameter[] params;
    private Value returnValue;

    public Method(Block superBlock) {
        super(superBlock);
    }

    @Override
    public void run() {

    }
}
