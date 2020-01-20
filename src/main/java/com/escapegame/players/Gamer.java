package com.escapegame.players;

import com.escapegame.tools.Configuration;

public abstract class Gamer {
    int[] combination = new int[Configuration.nosc];
    int[] combinationDef = new int[Configuration.nosc];

    /**
     * Recover the initialized combination at the beginning of the game.
     * @return combination
     */
    public String getCombinationString(){
        String res="";
        for (int n: combination)
            res+=n;
        return res;
    }

    /**
     * Initialize the secret combination in early part
     * @return combination
     */
   public abstract int[] setCombination();

    /**
     * Allows you to submit an answer to the opponent
     * @return proposition
     */
    public abstract int[] suggestion();

    /**
     * Lets you replicate to the opponent if he is good or wrong
     * @param proposition That's the opponent's suggestion
     * @return end : true or false
     */
    public abstract boolean reply(int[] proposition);
}
