package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe {@code CommandeRemplacer} représente une commande qui remplace une
 * portion du texte d'un document entre deux indices spécifiés par une nouvelle
 * chaîne de caractères.
 * <p>
 * Cette commande permet de sélectionner une partie du texte et de la remplacer
 * par un autre texte donné.
 * </p>
 */
public class CommandeRemplacer extends CommandeDocument {

    /**
     * Constructeur de la commande {@code CommandeRemplacer}.
     *
     * @param document   Le document sur lequel la commande sera exécutée.
     * @param parameters Les paramètres de la commande. Les indices de début et de
     *                   fin de la portion à remplacer, suivis du texte de remplacement,
     *                   doivent être passés en paramètres.
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande de remplacement sur une portion du texte du document.
     * <p>
     * Cette méthode remplace la portion du texte spécifiée par les indices de
     * début et de fin par une nouvelle chaîne de caractères. Les indices et le texte
     * de remplacement sont extraits des paramètres.
     * </p>
     */
    @Override
    public void executer() {
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        document.remplacer(debut, fin, texte);
        super.executer();
    }

    /**
     * Renvoie une description de la commande.
     *
     * @return Une chaîne de caractères décrivant l'action de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "Remplace une portion du texte entre deux positions données par une nouvelle chaîne de caractères.";
    }
}
