package mx.edu.uttt.arreglos;

import javax.swing.*;

public class AscendenteyDescendente {
    public static void main(String[] args) {

    }

    public static void Imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("| " + v[i] + "|");
        }
        System.out.println();
    }

    public static int solicitarTamanio() {
        int n = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del Arreglo "));
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "el tamaño no puede ser negativo o 0");
            }
        } while (n <= 0);
        return n;
    }
    public static void llenarArreglo(int[] v ){
        int i= 0;
        while(i<v.length){
            v[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor "+ (i+1)));
            i++;
        }


    }
}

