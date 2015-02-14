package com.acharluk.luk.block;

import com.acharluk.luk.Variable;

import java.util.ArrayList;

/**
 * Created by ACharLuk on 02/10/2014.
 */
public abstract class Block {

    private Block superBlock;
    private ArrayList<Block> subBlocks;
    private ArrayList<Variable> variables;

    public Block(Block superBlock) {
        this.superBlock = superBlock;
        this.subBlocks = new ArrayList<Block>();
        this.variables = new ArrayList<Variable>();
    }

    public Block getSuperBlock() {
        return superBlock;
    }

    public Block[] getSubBlocks() {
        return subBlocks.toArray(new Block[subBlocks.size()]);
    }

    public void addBlock(Block block) {
        subBlocks.add(block);
    }

    public Variable getVariable(String name) {
        for (Variable v : variables) {
            if (v.getName().equals(name)) {
                return v;
            }
        }
        return null;
    }

    public void addVariable(Variable v) {
        variables.add(v);
    }

    public abstract void run();

}
