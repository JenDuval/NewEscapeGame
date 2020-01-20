package com.escapegame.players;

import com.escapegame.tools.Configuration;

public abstract class Gameur {
    int[] combinaison = new int[Configuration.nosc];
    int[] combinaisonDef = new int[Configuration.nosc];

    /**
     * Recover the initialized combination at the beginning of the game.
     * @return combination
     */
    public String getCombinaisonString(){
        String res="";
        for (int n:combinaison)
            res+=n;
        return res;
    }

    /**
     * Initialize the secret combination in early part
     * @return combination
     */
   public abstract int[] setCombinaison();

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
