package com.escapegame.tools;

import com.escapegame.players.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * Property file
 */
public class Configuration {
    private static final Logger logger = LogManager.getLogger(Configuration.class);

    //définit la taille de la combinaison à deviner : nosc = number of secret code
    public static int nosc;

    //définit les nombres min et max autorisés dans une combinaison
    public static int nbMin;
    public static int nbMax;

    //défini le nombre de chance en mode Challenger et Défenseur
    public static int nbTurn;

    //Activé le mode dev, permet de voir la combinaison en mode Challenger et Versus
    public static boolean dev;

    public static void startConf(){
        Properties prop = null;

        try {
            prop = Sentences.load();

            nosc = Integer.parseInt(prop.getProperty("size.combination"));
            nbMin = Integer.parseInt(prop.getProperty("number.minimum"));
            nbMax = Integer.parseInt(prop.getProperty("number.maximum"));
            nbTurn = Integer.parseInt(prop.getProperty("number.turn"));
            dev = Boolean.parseBoolean(prop.getProperty("mode.developper"));

            Player.setCheckEndTurn();
        } catch (IOException e) {
            logger.debug(e);
        }
    }
}
