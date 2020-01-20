package com.escapegame.mode;

import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;
import com.escapegame.tools.FAQ;

public class Defender extends Mode {

    @Override
    protected void prepareRound() {
        Display.write("Vous êtes dans le mode de jeu Défenseur.\nSouhaitez-vous avoir la mise en situation ? (Recommander pour votre première game)\nIndiquez par 1 (oui) ou 2 (non) votre choix. ");
        int faqc = Captures.readInt(1,2);
        if(faqc == 1)
            FAQ.faqDefender();
        playeur.setCombinaison();
    }

    @Override
    protected boolean turnGame() {
        int[] proposition = ia.suggestion();
        return playeur.reply(proposition);
    }

    @Override
    protected String getNameGame() {
        return "Defendeur";
    }

    @Override
    protected String getDisplayEndWin() {
        return "Vous avez perdu !!!!";
    }

    @Override
    protected String getDisplayEndLose() {
        return "Vous avez gagné !!!!";
    }
}
