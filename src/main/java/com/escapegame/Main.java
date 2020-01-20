package com.escapegame;

import com.escapegame.mode.Challenger;
import com.escapegame.mode.Defender;
import com.escapegame.mode.Mode;
import com.escapegame.mode.Versus;
import com.escapegame.players.Player;
import com.escapegame.tools.Captures;
import com.escapegame.tools.Configuration;
import com.escapegame.tools.Display;

public class Main {
    public static void main(String[] args) {
        Configuration.startConf();
        Player.setWin();
        menu();
    }

    public static void menu(){
        Display.write("Choisissez votre mode de jeu :\n1: Challenger\n2: Défenseur\n3: Duel");

        int m = Captures.readInt(1,3);
        Mode mode;
        if(m==1)
            mode = new Challenger();
        else if(m==2)
            mode = new Defender();
        else
            mode = new Versus();

        mode.startGame();
    }

}
