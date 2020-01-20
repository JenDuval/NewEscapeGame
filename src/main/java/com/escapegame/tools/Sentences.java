package com.escapegame.tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class Sentences {

    /**
     * Used to exploit the .properties file that implements sentences
     * * @return returns the phrases ask
     * @throws IOException
     */
    public static Properties load() throws IOException{
        Properties properties = new Properties();
        String filename = "src/main/ressources/configuration.properties";

        FileInputStream input = new FileInputStream(filename);
        try{
            properties.load(input);
            return properties;
        }

        finally{
            input.close();
        }
    }
}