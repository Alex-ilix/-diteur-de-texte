package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {



        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        document.remplacer(debut, fin, texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Remplace une portion du texte entre deux positions données par une nouvelle chaîne de caractères.";
    }

}
