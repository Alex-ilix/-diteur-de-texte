package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe {@code CommandeAjouter} représente une commande permettant
 * d'ajouter une chaîne de caractères à un document.
 * <p>
 * Cette commande s'exécute en ajoutant le texte spécifié à la fin du document.
 * </p>
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur de la commande {@code CommandeAjouter}.
     *
     * @param document   Le document sur lequel la commande sera exécutée.
     * @param parameters Les paramètres de la commande. Le second paramètre
     *                   doit être le texte à ajouter au document.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande d'ajout de texte au document.
     * <p>
     * Cette méthode ajoute le texte spécifié à la fin du document. Si le format
     * des paramètres est incorrect, un message d'erreur est affiché.
     * </p>
     */
    @Override
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    /**
     * Renvoie une description de la commande.
     *
     * @return Une chaîne de caractères décrivant la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "Ajoute une chaîne de caractères à la fin du document.";
    }

}
