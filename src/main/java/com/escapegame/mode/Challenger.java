package com.escapegame.mode;

import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;
import com.escapegame.tools.FAQ;
import com.escapegame.tools.Configuration;

public class Challenger extends Mode {
    @Override
    protected void prepareRound() {
        Display.write("Vous êtes dans le mode de jeu Challenger.\n"
                + "Souhaitez-vous avoir la mise en situation ? (Recommander pour votre première game)\n"
                + "Indiquez par 1 (oui) ou 2 (non) votre choix. ");
        int faqc = Captures.readInt(1,2);
        if(faqc == 1)
            FAQ.faqChallenger();

        ia.setCombination();
    }

    @Override
    protected boolean turnGame() {
        if(Configuration.dev)
            Display.write("(Combinaison secrète : " + ia.getCombinationString()+")");

        int[] proposition = playeur.suggestion();
        return ia.reply(proposition);
    }

    @Override
    protected String getNameGame() {
        return "Challenger";
    }

    @Override
    protected String getDisplayEndWin() {
        return "Vous avez gagné !!!!";
    }

    @Override
    protected String getDisplayEndLose() {
        return "Vous avez perdu !!!!";
    }

}
