package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import fr.iut.editeur.document.Document;
import fr.iut.editeur.commande.CommandeClear;

public class DocumentTest {


    private Document document;
    private CommandeClear commandeClear;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.ajouter("Ceci est un texte de test.");
        commandeClear = new CommandeClear(document, new String[]{});
    }

    @Test
    public void testExecuterEffaceContenu() {
        // Vérifie que le document contient du texte avant d'exécuter la commande
        assertEquals("Ceci est un texte de test.", document.getTexteDocument());

        // Exécute la commande
        commandeClear.executer();

        // Vérifie que le document est vide après l'exécution de la commande
        assertEquals("", document.getTexteDocument());
    }

}