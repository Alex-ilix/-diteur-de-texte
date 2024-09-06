package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        // Vérification des indices pour s'assurer qu'ils sont valides
        if (debut < 0 || fin >= texte.length() || debut > fin) {
            throw new IllegalArgumentException("Indices invalides.");
        }

        // Extraire la portion du texte à convertir en majuscules
        String partieAMettreEnMajuscules = texte.substring(debut, fin + 1);

        // Convertir la portion en majuscules
        String partieMajuscules = partieAMettreEnMajuscules.toUpperCase();

        // Construire le nouveau texte
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + partieMajuscules + partieDroite;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        texte = "";
    }

    public void inserer(int debut, String texte) {
        String partieGauche = this.texte.substring(0, debut);
        String partieDroite = this.texte.substring(debut);
        this.texte = partieGauche + texte + partieDroite;
    }

    public void minuscules(int debut, int fin) {
        remplacer(debut, fin, texte.substring(debut, fin + 1).toLowerCase());
    }





}
