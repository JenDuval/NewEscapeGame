package com.escapegame.players;

import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;

import static com.escapegame.tools.Configuration.nosc;
import static com.escapegame.players.IA.totalBis;

public class Player extends Gamer {
    private static String checkEndTurn = "";
    public static int[] number;

    /**
     * Allows you to generate the win content that allows you to compare with the total to know if the player has won or lost
     * Generate win compared to nosc
     */
    public static void setCheckEndTurn(){
        for (int i = 0; i < nosc; i++){
            checkEndTurn += "=";
        }
    }

    @Override
    public int[] setCombinaison() {
        totalBis = "";
        Display.write("Vous êtes dans le mode de jeu Défendeur.\n"
                + "Entrez votre code secret :");
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
        totalBis = "";
        boolean end = false;
        String num = "";

        for (int i = 0; i < proposition.length; i++) {
           num += proposition[i];
        }

        Display.write("Proposition : " + num + " -> Réponse :");
        totalBis = Captures.readString();

        if(totalBis.equals(checkEndTurn))
            end = true;

        return end;
    }
}
