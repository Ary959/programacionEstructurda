package mx.edu.uttt.arreglos;

import javax.swing.*;

public class VendedorVentas {
    public static void main(String[] args) {
        //Elaborar un programa que lee el nombre de un vendedor y
        // las ventas realizadas durante los 30 días del mes que las almecene
        // en un arreglo y que imprima el reporte siguiente

        int tam = validarTamanio();
        int arr1[] = new int[tam];
        validarTamanio();

        llenarArreglo(arr1);
        imprimir(arr1);
        imprimirNombreVendedor();
        calcularProm(arr1);
        System.out.println("La suma es : "+ calcularProm(arr1));

    }

    public static int validarTamanio() {
        int tamanio = 30;
        do {


            tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce las ventas: "));
            if (tamanio >= 30) {
                JOptionPane.showInputDialog(null, "Tamaño no valido");
            }
        } while (tamanio <= 0);
        return tamanio;

    }

    public static String solicitarNombre() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del vendedor");
        return nombre;
    }

    public static void imprimirNombreVendedor() {
        String nombre = " ";
        System.out.println("El nombre del vendedor es:  " + solicitarNombre());


    }

    public static void llenarArreglo(int[] vector) {
        int valor = 0;
        for (int i = 0; i < vector.length; i++) {
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                    "Introduce las ventas por día [" + i + "]"));
            vector[i] = valor;

        }

    }

    public static void imprimir(int[] vector) {
        int i = 0;
        for (int valor : vector) {
            System.out.println("La ventas por dia son  [" + i + "] = " + valor);
            i++;
        }


    }
    public static double calcularProm(int[] vector) {
        double promedio = 0.0;
        double tamanio = 0;
        double valor = 0.0;
        for (int x : vector) {

            promedio += x;


        }
        return promedio;
    }



    }




