package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {


    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {

        int position = Integer.parseInt(parameters[1]); // permet de récupérer la position d'insertion
        String texte = parameters[2]; // permet de récupérer le texte à insérer

        this.document.inserer(position, texte); // insère le texte à la position spécifiée dans le document
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Inserre du texte dans le texte.";
    }

}
