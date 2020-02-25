import java.util.ArrayList;
import java.util.List;

public class Racine {
    /**
     * Calculer toutes les racines carrées des nombres compris entre {code A} et {code B}.
     *
     * @param A nombre entier tel que A < B.
     * @param B nombre entier tel que A < B.
     * @return un {@code List} contenant les racines carrées des nombres compris entre {code A} et {code B}.
     */




    public double[] calculer(int A, int B){
        double[] list = new double[B-A+1];
        if(A<=0 || B<=0 || A==B){
            return list;
        }
        for(int i = A; i<B+1; i++){
            list[i-A]=Math.sqrt(i);
        }
        return list;
    }
}
