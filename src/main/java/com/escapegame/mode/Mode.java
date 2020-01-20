package com.escapegame.mode;

import com.escapegame.Main;
import com.escapegame.players.Gamer;
import com.escapegame.players.IA;
import com.escapegame.players.Player;
import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;
import com.escapegame.tools.Configuration;

import static com.escapegame.tools.Configuration.nbTurn;
import static com.escapegame.tools.Configuration.nosc;

public abstract class Mode {
    Gamer playeur;
    Gamer ia;

    boolean end = false;

    /**
     * Allows you to start the desired game mode
     */
    public void startGame(){
        playeur = new Player();
        ia = new IA();

        prepareRound();

        String code = "";
        for(int i = 1; i <= nosc; i++){
            code += "_ ";
        }

        if(!Configuration.dev)
            Display.write("(Combinaison secrète : "+ code +")");

        int numbTurn=0;
        while (!end && numbTurn < nbTurn) {
            end = turnGame();
            numbTurn++;
        }

        if(end)
            Display.write(getDisplayEndWin());
        else
            Display.write(getDisplayEndLose());

        this.endMenu();

    }

    /**
     * Displays the end menu and allows you to choose to replay, play another game mode or exit the game
     * @return return the player's choice or null
     */
    public String endMenu() {
        Mode mode;
        Display.write("Que voulez-vous faire ? \n\n"
                + "1: Rejouer à ce mode jeu\n"
                + "2: Retouner au menu\n"
                + "3: Quitter l'Escape Game");
        int m = Captures.readInt(1,3);
        if(m==1) {
            if (getNameGame().equals("Challenger")) {
                mode = new Challenger();
            } else if(getNameGame().equals("Defendeur")){
                mode = new Defender();
            } else {
                mode = new Versus();
            }

            mode.startGame();
        } else if(m==2)
            Main.menu();
        else
            System.exit(1);

            return null;
    }

    /**
     * Prepares rounds
     */
    protected abstract void prepareRound();

    /**
     * The turns of the game
     * Lets know who is playing.
     * @return Boolean that lets you know if the player has won or lost.
     * If the boolean is at the end of the game because the player wins
     */
    protected abstract boolean turnGame();

    /**
     * Get the name of the game mode
     * @return name of the game mode
     */
    protected abstract String getNameGame();

    protected abstract String getDisplayEndWin();

    protected abstract String getDisplayEndLose();

}