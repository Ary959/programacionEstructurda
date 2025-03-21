package mx.edu.uttt.arreglos;

import javax.swing.*;
import java.util.Arrays;

public class Mediana {
    public static void main(String[] args) {
        int tam = solicitarTamanio();
        int v1[] = new int[tam];
        int v2[] = new int[tam];

        llenarArreglo(v1);
        llenarArreglo(v2);

        System.out.println("Arreglo 1:");
        Imprimir(v1);

        System.out.println("Arreglo 2:");
        Imprimir(v2);


        Arrays.sort(v1);
        Arrays.sort(v2);

        System.out.println("Mediana del arreglo 1: " + CalcularMediana(v1));
        System.out.println("Mediana del arreglo 2: " + CalcularMediana(v2));
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


    public static void Imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("| " + v[i] + " |");
        }
        System.out.println();
    }


    public static double CalcularMediana(int[] arreglo) {
        int n = arreglo.length;

        if (n % 2 == 1) {

            return arreglo[n / 2];
        } else {

            return (arreglo[n / 2 - 1] + arreglo[n / 2]) / 2.0;
        }
    }
}









