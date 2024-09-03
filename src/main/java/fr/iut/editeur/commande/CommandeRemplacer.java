package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {

        /*
        if(parameters[4].isEmpty()) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        */

        int debut = Integer.parseInt(parameters[2]);
        int fin = Integer.parseInt(parameters[3]);
        String texte = parameters[4];
        document.remplacer(debut, fin, texte);
        super.executer();
    }

}
