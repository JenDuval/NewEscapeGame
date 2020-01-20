package com.escapegame.players;

import com.escapegame.tools.Display;
import com.escapegame.tools.Configuration;

import java.util.Random;


public class IA extends Gamer {
    public static String replyIA;
    public static String replyPlayer;
    int[] max = new int[Configuration.nosc];
    int[] min = new int[Configuration.nosc];
    Random r = new Random();

    public int[] setCombination() {
        for (int i = 0; i < combination.length; i++)
            combination[i] =
                    (int) (Math.random() * (Configuration.nbMax + 1) - Configuration.nbMin) + Configuration.nbMin;
        return new int[0];
    }

    @Override
    public int[] suggestion() {
        String[] splitArray = null;
        splitArray = replyPlayer.split("");
        for (int i = 0; i < combinationDef.length; i++) {
            if (replyPlayer.equals("")) {
                max[i] = 9;
                min[i] = 0;
                combinationDef[i] = min[i] + r.nextInt(max[i] -  min[i]);

            } else {
                if (splitArray[i].equals("+"))
                    min[i] = combinationDef[i];
                else if (splitArray[i].equals("-"))
                    max[i] = combinationDef[i];

                if (!splitArray[i].equals("=")) {
                    combinationDef[i] = min[i] + r.nextInt(max[i] -  min[i]);
                }
            }
        }
        return combinationDef;
    }

    @Override
    public boolean reply(int[] proposition) {
        replyIA = "";
        String number = "";
        boolean end = true;
        for (int i = 0; i < proposition.length; i++) {

            number += proposition[i];

            if (proposition[i] < combination[i]) {
                replyIA += "+";
                end = false;
            } else if (proposition[i] > combination[i]) {
                replyIA += "-";
                end = false;
            } else
                replyIA += "=";
        }
        Display.write("Proposition : " + number + " -> Réponse :" + replyIA);

        return end;
    }
}