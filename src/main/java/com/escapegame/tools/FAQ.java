package com.escapegame.tools;

/**
 * The rules is unfolding part as a story
 */
public class FAQ {
    public static void faqChallenger(){
        Display.write( "Vous êtes kidnappé par un individu masqué qui vous assomme violemment avec une batte.\n"
                + "Vous vous réveillez dans une pièce fermer d'un cadenas électronique, dans cette pièce vous avez un PC.\n"
                + "Vous devez jouer avec l'ordinateur pour découvrir le code du cadenas et pouvoir sortir.\n"
                + "L'ordinateur créé une combinaison secrète pour le cadenas virtuel.\n"
                + "Vous lui faites une proposition avec le nombre de chiffre correspondant au nombre de '_' se trouvant dans Code Secret.\n"
                + "L'ordinateur vous indiquera par :\n"
                + "'+' Si l'un de ces chiffres est plus grand que le vôtre,\n"
                + "'-' Si l'un de ces chiffres est plus petit que le vôtre,\n"
                + "'=' Si l'un de ces chiffres est égal au vôtre\n"
                + "Il vous indiquera cela par chiffre.");
    }

    public static void faqDefender(){
        Display.write("Vous kidnappez un individu lambda que vous assommez violemment avec une batte.\n"
                + "Vous le placez dans une pièce fermée avec un cadenas électronique, votre victime n'a qu'un pc dans sa pièce.\n"
                + "S'il veut sortir, il doit jouer avec vous par le biais du PC, sans qu'il ne sache que c'est vous.\n"
                + "Vous créez une combinaison secrète, que votre victime doit trouver pour sortir.\n"
                + "Votre code secret doit avoir le même nombre de chiffre que le nombre de '_' se trouvant dans Code Secret.\n"
                + "Votre victime vous proposera des combinaisons de chiffre, à vous de lui indiquer si ces chiffres sont bons ou non.\n"
                + "Vous indiquerez à votre victime par :\n"
                + "'-' Si l'un de ces chiffres est plus grand que le vôtre,\n"
                + "'+' Si l'un de ces chiffres est plus petit que le vôtre,\n"
                + "'=' Si l'un de ces chiffres est égal au vôtre\n"
                + "Vous devez lui ceci par chiffre.");
    }

    public static void faqVersus(){
        Display.write("Vous êtes kidnappé par un individu masqué qui vous assomme violemment avec une batte.\n"
                + "Vous vous réveillez dans une pièce fermer d'un cadenas électronique, dans cette pièce vous avez un PC.\n"
                + "Vous devez jouer contre une autre victime elle aussi enfermé dans une autre pièce, par un cadenas électronique.\n"
                + "Pour vous en sortir vous devez gagner contre cette autre victime.\n"
                + "Vous choisissez la combinaison secrète de son cadenas électronique.\n"
                + "L'autre victime choisisse la combinaison de votre cadenas électronique.\n"
                + "Par un duel en tour par tour, vous devez un tour sur deux, proposer une combinaison pour vous libérer.\n"
                + "Vous et adversaire, devez répondre à l'autre par :\n"
                + "'+' Si le chiffre est plus petit que celui de la combinaison,\n"
                + "'-' Si le chiffre est plus grand que la combinaison,\n"
                + "'=' Si le chiffre est égale à celui de la combinaison.\n"
                + "Ceci pour chacun des chiffres.");
    }
}
