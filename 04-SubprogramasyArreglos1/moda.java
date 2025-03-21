package mx.edu.uttt.arreglos;

import javax.swing.*;

public class moda {
    public static void main(String[] args) {
        int[] vector = new int[15];


        llenarArreglo(vector);

        System.out.print("Arreglo: ");
        Imprimir(vector);

        mostrarModa(vector);
    }
    public static int solicitarTamanio() {
        int n = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del Arreglo: "));
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamaño no puede ser negativo o 0");
            }
        } while (n <= 0);
        return n;
    }


    public static void llenarArreglo(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para la posición " + (i + 1)));
        }
    }

    // Función para imprimir el arreglo
    public static void Imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }


    public static void mostrarModa(int[] v) {
        int[] frecuencia = new int[10];


        for (int i = 0; i < v.length; i++) {
            frecuencia[v[i] - 1]++;
        }


        int maxFrecuencia = 0;
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
            }
        }

        System.out.print("Moda: ");
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] == maxFrecuencia) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}