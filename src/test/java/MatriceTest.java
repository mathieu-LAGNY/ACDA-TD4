import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriceTest {


    protected Matrice matrice;
    @BeforeEach
    void setUp() {
        matrice = new Matrice();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void verifie_paramètre_ligne(){
        assertEquals("Une dimension n'est pas bonne", matrice.creation(-2, 5, 6, 8));
    }

    void verifie_paramètre_colonne(){
        assertEquals("Une dimension n'est pas bonne", matrice.creation(2, -5, 6, 8));
    }

    void verifie_B_plus_petit_A(){
        assertEquals("B est plus petit que A", matrice.creation(5, 6, 5, 4));
    }

    @Test
    void verifie_valeur(){
        for(int i = 0; i<matrice.M; i++){
            for(int j = 0; j<matrice.N;j++){
                assertTrue(matrice.A<matrice.data[i][j]<matrice.B);
            }
        }
    }
}