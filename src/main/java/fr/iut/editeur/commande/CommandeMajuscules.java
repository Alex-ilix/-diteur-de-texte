
package fr.iut.editeur.commande;

        import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        document.majuscules(debut, fin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Met en majuscules une portion du texte entre deux positions données.";
    }

}
