package com.escapegame.tools;

public class FAQ {
    public static void faqChallenger(){
        Display.write( "Vous êtes kidnappé par un individue masqué qui vous assome violament avec une batte\n"
                + "Vous vous réveillez dans une pièce fermer d'un cadenat élétronic, dans cette pièce vous avez un PC.\n"
                + "Vous devez jouer avec l'ordinateur pour découvrir le code du cadenat et pouvoir sortir.\n"
                + "L'ordinateur créé une combinaison secrette pour le cadenat virtuel\n"
                + "Vous lui faite une propostion avec le nombre de chiffre correspondant au nombre de '_' se trouvant dans Code Secret.\n"
                + "L'ordinateur vous indiquera par :\n"
                + "'+' Si l'un des ses chiffres est plus grand que le votre,\n"
                + "'-' Si l'un des ses chiffres est plus petit que le votre,\n"
                + "'=' Si l'un des ses chiffres est égal au votre\n"
                + "Il vous indiquera cela par chiffre.");
    }

    public static void faqDefender(){
        Display.write("Vous kidnappé un individue lambda que vous assome violament avec une batte\n"
                + "Vous le placé dans une pièce fermer avec un cadenat éléctronic, votre victime n'a d'un pc dans sa pièce\n"
                + "S'il veux sortir, il doit jouer avec vous par lebié du PC, sans qu'il ne sache que c'est vous\n"
                + "Vous créé une combinaison secratte, quevotre victime doit trouvé pour sortir\n"
                + "Votre code secret doit avoir le même nombre de chiffre que le nombre de '_' se trouvant dans Code Secret.\n"
                + "Votre victime vous proposera des combinaison de chiffre, à vous de lui indiquer s'il à bon ou non.\n"
                + "Vous indiquerai à votre victime par :\n"
                + "'-' Si l'un des ses chiffres est plus grand que le votre,\n"
                + "'+' Si l'un des ses chiffres est plus petit que le votre,\n"
                + "'=' Si l'un des ses chiffres est égal au votre\n"
                + "Vous devez lui ceci par chiifre.");
    }

    public static void faqVersus(){
        Display.write("Vous êtes kidnappé par un individue masqué qui vous assome violament avec une batte\n"
                + "Vous vous réveillez dans une pièce fermer d'un cadenat élétronic, dans cette pièce vous avez un PC.\n"
                + "Vous devez jouer contre une autre victime elle aussi enfermé dans une autre pièce,par un cadenat éléctronique.\n"
                + "Pour vous en sortir vous devez gagné contre cette autre victime.\n"
                + "Vous choisisez la combinaison secrette de son cadenat éléctronique.\n"
                + "L'autre victime choisse lacombinaison de votre cadenat élétronique.\n"
                + "Par un duel en tourpar tour, vous devez un tour sur deux proposer une combinaison pour vous libéré.\n"
                + "Vous et adversaire, devez répondre à l'autre par:\n"
                + "'+' Si le chiffre est plus petit que celui dela combinaison,\n"
                + "'-' Si le chiifre est plus grand que la combinaiosn,\n"
                + "'=' Si le chiffre est égale à cellui de la combinaison.\n"
                + "Ceci pour chacun des chiffres.");
    }
}
