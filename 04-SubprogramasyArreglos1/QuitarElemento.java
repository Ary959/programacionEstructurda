package mx.edu.uttt.arreglos;

import javax.swing.*;

public class QuitarElemento {
        public static void main(String[] args) {

            int tamanioArreglo = pedirTamanioArreglo();
            int[] arreglo = new int[tamanioArreglo];


            llenarArreglo(arreglo);


            System.out.println("Arreglo original:");
            mostrarArreglo(arreglo);
            int numeroEliminar = pedirNumeroEliminar();
            int[] nuevoArreglo = eliminarElemento(arreglo, numeroEliminar);
            System.out.println("Arreglo después de eliminar " + numeroEliminar + ":");
            mostrarArreglo(nuevoArreglo);
        }

        //pedir el tamaño del arreglo
        public static int pedirTamanioArreglo() {
            int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo:"));
            return tamanio;
        }

        // llenar el arreglo con valores ingresados por el usuario
        public static void llenarArreglo(int[] arreglo) {
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + ":"));
            }
        }

        // mostrar el contenido del arreglo
        public static void mostrarArreglo(int[] arreglo) {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }

        // Pedir el número que se desea eliminar
        public static int pedirNumeroEliminar() {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que deseas eliminar:"));
            return numero;
        }

        // <Eliminar un elemento del arreglo
        public static int[] eliminarElemento(int[] arreglo, int numeroEliminar) {

            int contador = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == numeroEliminar) {
                    contador++;
                }
            }


            if (contador == 0) {
                System.out.println("El número " + numeroEliminar + " no se encuentra en el arreglo.");
                return arreglo;
            }

            int[] nuevoArreglo = new int[arreglo.length - contador];
            int indiceNuevoArreglo = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] != numeroEliminar) {
                    nuevoArreglo[indiceNuevoArreglo] = arreglo[i];
                    indiceNuevoArreglo++;
                }
            }

            return nuevoArreglo;
        }
    }