package com.acharluk.luk.block;

/**
 * Created by ACharLuk on 04/10/2014.
 */
public class Class extends Block {

    private String name;

    public Class(String name) {
        super(null);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        //Run func main
    }

}
