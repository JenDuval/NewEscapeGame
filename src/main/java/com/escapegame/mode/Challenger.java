package com.escapegame.mode;

import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;
import com.escapegame.tools.FAQ;
import com.escapegame.tools.Properties;

import static com.escapegame.tools.Properties.nbTurn;

public class Challenger extends Mode {
    @Override
    protected void prepareRound() {
        Display.write("Vous êtes dans le mode de jeu Challenger.\nSouhaitez-vous avoir la mise en situation ? (Recommander pour votre première game)\nIndiquez par 1 (oui) ou 2 (non) votre choix. ");
        int faqc = Captures.readInt(1,2);
        if(faqc == 1)
            FAQ.faqChallenger();

        ia.setCombinaison();
    }

    @Override
    protected boolean turnGame() {
        if(Properties.develope)
            Display.write("(Combinaison secrète : "+ia.getCombinaisonString()+")");

        int[] proposition = playeur.suggestion();
        return ia.reply(proposition);
    }

    @Override
    protected String getNameGame() {
        return "Challenger";
    }


}
