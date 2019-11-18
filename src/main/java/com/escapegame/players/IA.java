package com.escapegame.players;

import com.escapegame.tools.Display;
import com.escapegame.tools.Properties;

import java.util.Random;


public class IA extends Gameur {
    public static String total;
    public static String totale;
    int[] max = new int[Properties.nosc];
    int[] min = new int[Properties.nosc];
    Random r = new Random();

    @Override
    public int[] setCombinaison() {
        for (int i = 0; i < combinaison.length; i++)
            combinaison[i] =
                    (int) (Math.random() * (Properties.numberMax + 1) - Properties.numberMin) + Properties.numberMin;
        return new int[0];
    }

    @Override
    public int[] suggestion() {
        String[] splitArray = null;
        splitArray = totale.split("");
        for (int i = 0; i < combinaisonDef.length; i++) {
            if (totale.equals("")) {
                max[i] = 9;
                min[i] = 0;
                combinaisonDef[i] = min[i] + r.nextInt(max[i] -  min[i]);

            } else {
                if (splitArray[i].equals("+"))
                    min[i] = combinaisonDef[i];
                else if (splitArray[i].equals("-"))
                    max[i] = combinaisonDef[i];

                if (!splitArray[i].equals("=")) {
                    combinaisonDef[i] = min[i] + r.nextInt(max[i] -  min[i]);
                }
            }
        }
        return combinaisonDef;
    }

    @Override
    public boolean reply(int[] proposition) {
        total = "";
        String number = "";
        boolean end = true;
        for (int i = 0; i < proposition.length; i++) {

            number += proposition[i];

            if (proposition[i] < combinaison[i]) {
                total += "+";
                end = false;
            } else if (proposition[i] > combinaison[i]) {
                total += "-";
                end = false;
            } else
                total += "=";
        }
        Display.write("Proposition : " + number + " -> Réponse :" + total);

        return end;
    }
}