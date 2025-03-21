package mx.edu.uttt.arreglos;

import javax.swing.*;

public class Intercalado {

        public static void main(String[] args) {

            //crear 2 vectores

            int tam = TamaniodelVector();
            int v1[] = new int[tam];
            int v2[] = new int[tam];
            llenarVector(v1, 1);
            llenarVector(v2,2);

            // Crear el vector 3(intercalado)

            int v3[] = combinarVectores(v1, v2, tam);


            imprimir(v3);
        }

        //  solicitar el tamaño de los vectores

        public static int TamaniodelVector() {
            int n = 0;
            do {
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamanio de los vectores "));
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null, "El tamaño no puede ser cero o negativo");
                }
            } while (n <= 0);
            return n;
        }

        //  llenar los vectores

        public static void llenarVector(int[] v, int numero) {
            for (int i = 0; i < v.length; i++) {
                v[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + " del vector " + numero + ":"));
            }
        }

        // intercalar los dos vectores y crear el tercer vector

        public static int[] combinarVectores(int[] v1, int[] v2, int tam) {
            int[] v3 = new int[tam * 2];
            int j = 0;

            // Intercalamos los elementos de v1 y v2 en v3
            for (int i = 0; i < tam; i++) {
                v3[j] = v1[i];
                j++;
                v3[j] = v2[i];
                j++;
            }
            return v3;
        }

        //  parta imprimir el vector intercalado

        public static void imprimir(int[] v) {
            String imp = "Vector intercalado: ";
            for (int i = 0; i < v.length; i++) {
                imp += v[i] + " ";
            }
            JOptionPane.showMessageDialog(null, imp);
        }
    }

