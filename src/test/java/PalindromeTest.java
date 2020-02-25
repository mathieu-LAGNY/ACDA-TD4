import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;
    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @AfterEach
    void tearDown() {
        palindrome = null;
    }

    @Test
    void test_pas_de_palindrome() {
        String phrase = "Calculer le nombre de mots palindrômes dans une {code phrase} passée en paramètres.";
        assertEquals(0,palindrome.calculer(phrase));
    }

    @Test
    void test_pas_de_ponctuation() {
        String phrase = "SOS je suis dans le sas";
        assertEquals(2,palindrome.calculer(phrase));
    }

    @Test
    void test_Majuscule() {
        String phrase = "Anna porte un bob";
        assertEquals(2,palindrome.calculer(phrase));
    }

    @Test
    void test_phrase() {
        String phrase = "Éric notre valet alla te laver ton ciré";
        assertEquals(1,palindrome.calculer(phrase));
    }
}