import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        racine = null;
    }

    @Test
    void test_A_positif() {
        assertArrayEquals(new double[]{}, racine.calculer(-1,2));
    }

    @Test
    void test_B_plus_grand_que_A() {
        assertArrayEquals(new double[]{}, racine.calculer(2,1));

    }

    @Test
    void test_B_A_égaux() {
        assertArrayEquals(new double[]{}, racine.calculer(2,2));
    }

    @Test
    void test_A_B() {
        double[] resultat = racine.calculer(0,5);
        assertEquals(6,resultat.length);
        assertArrayEquals(new double[]{0.,1.,Math.sqrt(2),Math.sqrt(3),2.,Math.sqrt(5)}, resultat);
    }
}