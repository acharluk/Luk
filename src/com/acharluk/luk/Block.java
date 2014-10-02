package com.acharluk.luk;

import java.util.ArrayList;

/**
 * Created by ACharLuk on 02/10/2014.
 */
public abstract class Block {

    private Block superBlock;
    private ArrayList<Block> subBlocks;

    public Block(Block superBlock) {
        this.superBlock = superBlock;
        this.subBlocks = new ArrayList<Block>();
    }

    public Block getSuperBlock() {
        return superBlock;
    }

    public void addBlock(Block block) {
        subBlocks.add(block);
    }

    public abstract void run();

}
