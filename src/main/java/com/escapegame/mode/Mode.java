package com.escapegame.mode;

import com.escapegame.Main;
import com.escapegame.players.Gameur;
import com.escapegame.players.IA;
import com.escapegame.players.Player;
import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;
import com.escapegame.tools.Properties;

import static com.escapegame.tools.Properties.nbTurn;
import static com.escapegame.tools.Properties.nosc;

public abstract class Mode {
    Gameur playeur;
    Gameur ia;

    boolean end=false;

    public void startGame(){
        playeur = new Player();
        ia = new IA();
        String win = "";
        String lose = "";

        prepareRound();

        String code = "";
        for(int i = 1; i <= nosc; i++){
            code += "_ ";
        }

        if(!Properties.develope)
            Display.write("(Combinaison secrète : "+ code +")");

        int numbTurn=0;
        while (!end && numbTurn < nbTurn) {
            end = turnGame();
            numbTurn++;
        }
       if(getNameGame().equals("Defendeur")) {
           win = "Vous avez perdu !!!!";
           lose = "Vous avez gagné !!!!";
       } else {
           win = "Vous avez gagné !!!!";
           lose = "Vous avez perdu !!!!";
       }
        if(end)
            Display.write(win);
        else
            Display.write(lose);

        this.endMenu();

    }

    public String endMenu() {
        Mode mode;
        Display.write("Que voulez-vous faire ? \n\n1: Rejouer à ce mode jeu\n2: Retouner au menu\n3: Quitter l'Escape Game");
        int m = Captures.readInt(1,3);
        if(m==1) {
            if(getNameGame().equals("Challenger"))
                mode = new Challenger();
            else if(getNameGame().equals("Defender"))
                mode = new Defender();
            else
                mode = new Versus();

            mode.startGame();
        }
        else if(m==2)
            Main.menu();
        else
            System.exit(1);

            return null;
    }

    protected abstract void prepareRound();

    protected abstract boolean turnGame();

    protected abstract String getNameGame();

}