package mx.edu.uttt.arreglos;

import javax.swing.*;

public class ArreglosDinamicos {
    public static void main(String[] args) {

        //Pedir el valor

        int tamanio = 0;
        tamanio = Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el tamaño del arreglo"));
        String arr1[] = new String[tamanio];
        arr1[0] = JOptionPane.showInputDialog("Introduce el valor del arr[0]");
     arr1[tamanio-1]=
    JOptionPane.showInputDialog("Introduce el valor del arr[0]");

    }
}
