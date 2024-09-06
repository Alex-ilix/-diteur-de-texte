package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {


    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        document.effacer(debut, fin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Efface une prtion du texte.";
    }
}

