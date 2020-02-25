import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*class MatriceTest {


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
        try{
            matrice.creation(-2, 5, 6, 8);
            fail("Une dimension n'est pas bonne");
        } catch(IllegalStateException ignored){
        }
    }

    void verifie_paramètre_colonne(){
        try{
            matrice.creation(2, -5, 6, 8);
            fail("Une dimension n'est pas bonne");
        } catch(IllegalStateException ignored){
        }
    }

    void verifie_B_plus_petit_A(){
        assertEquals("B est plus petit que A", matrice.creation(5, 6, 5, 4));
    }

    @Test
    void verifie_valeur(){
        Matrice m = new Matrice();
        m = matrice.creation(4, 5, 6, 7);
        for(int i = 0; i<m.M; i++){
            for(int j = 0; j<m.N;j++){

                assertTrue(m.A<m.data[i][j]<m.B);
            }
        }
    }
}*/