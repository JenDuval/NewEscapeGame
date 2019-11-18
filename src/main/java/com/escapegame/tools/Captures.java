package com.escapegame.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Captures {
    private static final Logger logger = LogManager.getLogger(Captures.class);

    static Scanner sc = new Scanner(System.in);

    /**
     * Allows catcher is processed keyboard input
     *
     * @param min Minimum value
     * @param max Maximum value
     * @return return the rest
     */
    public static int readInt(int min, int max) {
        String line = sc.nextLine();

        int rest;

        try {
            rest = Integer.parseInt(line);
        } catch (Exception e) {
            logger.debug("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        if (rest < min || rest > max) {
            logger.debug("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        return rest;
    }

    public static int[] readNumber(int nb) {
        String line = sc.nextLine();

        //vérification de la taille du texte entré
        if (line.length() != nb) {
            logger.debug("Cette valeur n'est pas autorisée");
            return readNumber(nb);
        }

        //convertion en tableau de String
        String[] tab = line.split("");

        //convertion en tableau de int
        int[] tab2 = new int[nb];
        try {
            for (int i = 0; i < nb; i++)
                tab2[i] = Integer.parseInt(tab[i]);
        } catch (Exception e) {
            logger.debug("Cette valeur n'est pas autorisée");
            return readNumber(nb);
        }

        return tab2;
    }

    /**
     * Allows catcher is processed keyboard input
     *
     * @return total
     */
    public static String readString() {
        sc = new Scanner(System.in);
        String total;
        boolean error = false;
        //1) Saisie au clavier
        String line = sc.nextLine();

        //2) Initialise un array liste et un regex pour split l'array liste
        String[] splitArray = null;

        splitArray = line.split("");

        //3) Vérifie si l'array liste contien bien 4 caractères
        if (splitArray.length == 4) {
            total = "";
            //4.1) Une boucle pour traité l'array liste caractère par caractère
            for (int i = 0; i < splitArray.length; i++) {
                //4.2) Vérifie si l'array liste contien + - ou =
                if (splitArray[i].equals("+"))
                    total += "+";
                else if (splitArray[i].equals("-"))
                    total += "-";
                else if (splitArray[i].equals("="))
                    total += "=";
                else {
                    logger.debug("Cette valeur n'est pas autorisée");
                   error = true;
                }
            }

            if(error)
                 return readString();
            else
                return total;
        } else {
            logger.debug("Cette valeur n'est pas autorisée" + splitArray.length);
            for (int i = 0; i < splitArray.length; i++) {
                logger.debug(splitArray[i]);
            }
            readString();
        }
        return null;
    }
}