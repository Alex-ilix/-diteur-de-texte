package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe {@code CommandeMinuscules} représente une commande qui met en
 * minuscules une portion du texte d'un document entre deux indices spécifiés.
 * <p>
 * Cette commande permet de sélectionner une partie du texte et de la convertir
 * en minuscules.
 * </p>
 */
public class CommandeMinuscules extends CommandeDocument {

    /**
     * Constructeur de la commande {@code CommandeMinuscules}.
     *
     * @param document   Le document sur lequel la commande sera exécutée.
     * @param parameters Les paramètres de la commande. Le premier paramètre
     *                   doit être l'indice de début et le second l'indice de fin
     *                   de la portion à convertir en minuscules.
     */
    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande de conversion en minuscules sur une portion du texte du
     * document.
     * <p>
     * Cette méthode convertit la portion du texte spécifiée par les indices de
     * début et de fin en minuscules. Les indices sont extraits des paramètres.
     * </p>
     */
    @Override
    public void executer() {
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        document.minuscules(debut, fin);
        super.executer();
    }

    /**
     * Renvoie une description de la commande.
     *
     * @return Une chaîne de caractères décrivant l'action de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "Met en minuscules une portion du texte entre deux positions données.";
    }
}
