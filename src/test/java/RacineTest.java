import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacineTest {

    private Racine racine;
    @BeforeEach
    void setUp() {
        racine = new Racine();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_A_positif() {
        try {
            racine.calculer(-1,2);
            fail("A est négatif");
        } catch (IllegalStateException ignored) {
        }
    }

    @Test
    void test_B_plus_grand_que_A() {
        try {
            racine.calculer(2,1);
            fail("B_plus_grand_que_A");
        } catch (IllegalStateException ignored) {
        }
    }

    @Test
    void test_B_A_égaux() {
        try {
            racine.calculer(2,2);
            fail("B_A_égaux");
        } catch (IllegalStateException ignored) {
        }
    }

    @Test
    void test_A_B() {
        List<Double> resultat = racine.calculer(0,5);
        assertEquals(6,resultat.size());
        assertEquals(0.,resultat.remove(0));
        assertEquals(1.,resultat.remove(1));
        assertEquals(Math.sqrt(2), resultat.remove(2));
        assertEquals(Math.sqrt(3),resultat.remove(3));
        assertEquals(2.,resultat.remove(4));
        assertEquals(Math.sqrt(5),resultat.remove(5));
    }
}