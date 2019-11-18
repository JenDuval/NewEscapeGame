package com.escapegame.players;

import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;

import static com.escapegame.tools.Properties.nosc;
import static com.escapegame.players.IA.totale;

public class Player extends Gameur {
    private static String win = "";
    public static int[] number;
    private void setWin(){
        for (int i = 1; i < nosc; i++){
            win += "=";
        }
    }

    @Override
    public int[] setCombinaison() {
        totale = "";
        Display.write("Vous êtes dans le mode de jeu Défendeur.\nEntrez votre code secret :");
        number =  Captures.readNumber(nosc);
        return number;
    }

    @Override
    public int[] suggestion() {

        //le joueur entre son choix
        Display.write("Proposition : ");
        int[] choix = Captures.readNumber(nosc);

        return choix;
    }

    //TODO
    @Override
    public boolean reply(int[] proposition) {
        totale = "";
        setWin();
        boolean end = true;
        String num = "";
        for (int i = 0; i < proposition.length; i++) {
           num += proposition[i];
        }

        Display.write("Proposition : " + num + " -> Réponse :");
        totale = Captures.readString();
        for (int i = 0; i < proposition.length; i++) {
            if(!totale.equals(win))
                end = false;
        }

        return end;
    }
}
