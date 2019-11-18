package com.escapegame.players;

import com.escapegame.tools.Properties;

public abstract class Gameur {
    int[] combinaison = new int[Properties.nosc];
    int[] combinaisonDef = new int[Properties.nosc];

    public String getCombinaisonString(){
        String res="";
        for (int n:combinaison)
            res+=n;
        return res;
    }

   public abstract int[] setCombinaison();

    public abstract int[] suggestion();

    public abstract boolean reply(int[] proposition);
}
