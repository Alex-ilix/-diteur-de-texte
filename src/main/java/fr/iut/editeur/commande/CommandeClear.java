package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe {@code CommandeClear} représente une commande qui efface
 * complètement le contenu d'un document.
 * <p>
 * Cette commande permet de vider le texte du document, le rendant ainsi vide.
 * </p>
 */
public class CommandeClear extends CommandeDocument {

    /**
     * Constructeur de la commande {@code CommandeClear}.
     *
     * @param document   Le document sur lequel la commande sera exécutée.
     * @param parameters Les paramètres de la commande (non utilisés dans ce cas).
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande de suppression du contenu du document.
     * <p>
     * Cette méthode appelle la méthode {@code clear} du document pour effacer
     * tout le texte, puis appelle la méthode {@code executer} de la classe parente.
     * </p>
     */
    @Override
    public void executer() {
        document.clear();
        super.executer();
    }

    /**
     * Renvoie une description de la commande.
     *
     * @return Une chaîne de caractères décrivant l'action de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "Efface tout le contenu du document.";
    }
}
