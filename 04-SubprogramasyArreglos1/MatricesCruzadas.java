package mx.edu.uttt.arreglos;

public class MatricesCruzadas {
    public static void main(String[] args) {

    }

    int[] vector1 = {1, 2, 3};
    int[] vector2 = {4, 5, 6};

    public static int[] productoCruzado(int[] v1, int[] v2) {
        int[] resultado = new int[3];


        resultado[0] = v1[1] * v2[2] - v1[2] * v2[1];
        resultado[1] = v1[2] * v2[0] - v1[0] * v2[2];
        resultado[2] = v1[0] * v2[1] - v1[1] * v2[0];

        return resultado;
    }


    int[] resultado = productoCruzado(vector1, vector2);


}
