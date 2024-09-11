package fr.iut.editeur.document;

/**
 * La classe {@code Document} représente un document textuel qui peut être
 * modifié de diverses manières, telles que l'ajout de texte, la substitution,
 * la mise en majuscules ou minuscules, etc.
 * <p>
 * Cette classe permet de gérer et de manipuler un texte sous forme de chaîne de
 * caractères.
 * </p>
 */
public class Document {

    /**
     * Le texte contenu dans le document.
     */
    private String texteDocument;

    /**
     * Constructeur de la classe {@code Document}.
     * <p>
     * Initialise un document vide.
     * </p>
     */
    public Document() {
        this.texteDocument = "";
    }

    /**
     * Renvoie le texte actuel du document.
     *
     * @return Le texte contenu dans le document sous forme de chaîne de caractères.
     */
    public String getTexteDocument() {
        return texteDocument;
    }

    /**
     * Modifie le texte du document.
     *
     * @param texteDocument La nouvelle chaîne de caractères qui remplacera le texte actuel du document.
     */
    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    /**
     * Ajoute une chaîne de caractères à la fin du document.
     *
     * @param texte La chaîne de caractères à ajouter au document.
     */
    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    /**
     * Remplace une portion du texte du document par une nouvelle chaîne de caractères.
     *
     * @param debut        L'indice de début de la portion à remplacer.
     * @param fin          L'indice de fin de la portion à remplacer.
     * @param remplacement La chaîne de caractères qui remplacera la portion spécifiée du texte.
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met en majuscules une portion du texte du document.
     *
     * @param debut L'indice de début de la portion à mettre en majuscules.
     * @param fin   L'indice de fin de la portion à mettre en majuscules.
     * @throws IllegalArgumentException Si les indices spécifiés sont invalides.
     */
    public void majuscules(int debut, int fin) {
        if (debut < 0 || fin >= texteDocument.length() || debut > fin) {
            throw new IllegalArgumentException("Indices invalides.");
        }

        String partieAMettreEnMajuscules = texteDocument.substring(debut, fin + 1);
        String partieMajuscules = partieAMettreEnMajuscules.toUpperCase();
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + partieMajuscules + partieDroite;
    }

    /**
     * Efface une portion du texte du document.
     *
     * @param debut L'indice de début de la portion à effacer.
     * @param fin   L'indice de fin de la portion à effacer.
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Efface tout le contenu du document, le rendant vide.
     */
    public void clear() {
        texteDocument = "";
    }

    /**
     * Insère une chaîne de caractères à un emplacement spécifié dans le texte du document.
     *
     * @param debut L'indice où le texte doit être inséré.
     * @param texte La chaîne de caractères à insérer.
     */
    public void inserer(int debut, String texte) {
        String partieGauche = this.texteDocument.substring(0, debut);
        String partieDroite = this.texteDocument.substring(debut);
        this.texteDocument = partieGauche + texte + partieDroite;
    }

    /**
     * Met en minuscules une portion du texte du document.
     *
     * @param debut L'indice de début de la portion à mettre en minuscules.
     * @param fin   L'indice de fin de la portion à mettre en minuscules.
     */
    public void minuscules(int debut, int fin) {
        remplacer(debut, fin, texteDocument.substring(debut, fin + 1).toLowerCase());
    }

    /**
     * Renvoie une représentation sous forme de chaîne de caractères du document.
     *
     * @return Le texte actuel du document.
     */
    @Override
    public String toString() {
        return this.texteDocument;
    }

}
