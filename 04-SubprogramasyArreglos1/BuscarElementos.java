package mx.edu.uttt.arreglos;

import javax.swing.*;

public class BuscarElementos {
    public static void main(String[] args) {
        // tamaño del arreglo
        int tamanioArreglo = pedirTamanioArreglo();
        int[] arreglo = new int[tamanioArreglo];

        llenarArreglo(arreglo);

        int numBuscado = pedirNumBuscado();
        int posicionEncontrada = buscarNumeroEnArreglo(arreglo, numBuscado);

        mostrarResultadoBusqueda(numBuscado, posicionEncontrada);
    }

    //Funcion tamaño del Arreglo
    public static int pedirTamanioArreglo() {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo:"));
        return tamanio;
    }

    // llenar arreglo
    public static void llenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + ":"));
        }
    }

    //pedir numero
    public static int pedirNumBuscado() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que deseas buscar:"));
        return numero;
    }

    //buscar numero en el arreglo
    public static int buscarNumeroEnArreglo(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }

    // Resultado de la Busqueda
    public static void mostrarResultadoBusqueda(int numeroBuscado, int posicionEncontrada) {
        if (posicionEncontrada != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + posicionEncontrada);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }
}

