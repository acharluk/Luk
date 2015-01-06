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

    public Method(Block superBlock, String name, Type type, Parameter[] params) {
        super(superBlock);

        this.name = name;
        this.type = type;
        this.params = params;
    }

    @Override
    public void run() {
        invoke();
    }

    public void invoke(Value... values) {

    }
}
