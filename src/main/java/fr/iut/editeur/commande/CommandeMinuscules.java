package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument {

    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        document.minuscules(debut, fin);
        super.executer();
    }
}
