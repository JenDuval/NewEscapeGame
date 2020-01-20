package com.escapegame.mode;

import com.escapegame.tools.Captures;
import com.escapegame.tools.Display;
import com.escapegame.tools.FAQ;
import com.escapegame.tools.Configuration;

import static com.escapegame.tools.Configuration.nbTurn;

public class Versus extends Mode {
    int i;

    @Override
    protected void prepareRound() {
        nbTurn = nbTurn * 2;
        i = 1;
        Display.write("Vous êtes dans le mode de jeu Duel.\nSouhaitez-vous avoir la mise en situation ? (Recommander pour votre première game)\nIndiquez par 1 (oui) ou 2 (non) votre choix. ");
        int faqc = Captures.readInt(1,2);
        if(faqc == 1)
            FAQ.faqVersus();
        ia.setCombinaison();
        playeur.setCombinaison();
    }

    @Override
    protected boolean turnGame() {
        Display.write("=============================== Tour N°" + i + " ===============================");
        if(i%2 == 1) {
            i++;
            Display.write("Vous êtes le Défenseur.");
            int[] propositions = ia.suggestion();
            endWin = "Vous avez perdu !!!!";
            endLose = "Vous avez gagné !!!!";
            return  playeur.reply(propositions);
        } else {
            i++;
            Display.write("Vous êtes le Challenger.");
            if (Configuration.developpe)
                Display.write("(Combinaison secrète : " + ia.getCombinaisonString() + ")");
            int[] proposition = playeur.suggestion();
            endWin = "Vous avez gagné !!!!";
            endLose = "Vous avez perdu !!!!";
            return ia.reply(proposition);
        }
    }

    @Override
    protected String getNameGame() {
        return "Versus";
    }
}
