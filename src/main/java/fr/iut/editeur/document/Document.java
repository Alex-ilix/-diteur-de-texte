package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        // Vérification des indices pour s'assurer qu'ils sont valides
        if (debut < 0 || fin >= texteDocument.length() || debut > fin) {
            throw new IllegalArgumentException("Indices invalides.");
        }

        // Extraire la portion du texte à convertir en majuscules
        String partieAMettreEnMajuscules = texteDocument.substring(debut, fin + 1);

        // Convertir la portion en majuscules
        String partieMajuscules = partieAMettreEnMajuscules.toUpperCase();

        // Construire le nouveau texte
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + partieMajuscules + partieDroite;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        texteDocument = "";
    }

    public void inserer(int debut, String texte) {
        String partieGauche = this.texteDocument.substring(0, debut);
        String partieDroite = this.texteDocument.substring(debut);
        this.texteDocument = partieGauche + texte + partieDroite;
    }

    public void minuscules(int debut, int fin) {
        remplacer(debut, fin, texteDocument.substring(debut, fin + 1).toLowerCase());
    }







}
