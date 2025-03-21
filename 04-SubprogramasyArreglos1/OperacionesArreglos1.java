package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesArreglos1 {
    public static void main(String[] args) {

        int tam = validarTamanio();
        int arr1[] = new int[tam];
        int arr2[]=new int[tam];


        llenarArreglo(arr1);
        imprimirVector(arr1);
        calcularPromedio(arr1);

        System.out.println("El promedio es : "+ calcularPromedio(arr1));
         llenarArreglo(arr2);
        System.out.println( "La suma de los vecotres es: " +sumarVectores(arr1,arr2));
    }

    public static int validarTamanio() {
        int tamanio = 0;
        do {


            tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño: "));
            if (tamanio <= 0) {
                JOptionPane.showInputDialog(null, "Tamaño no valido");
            }
        } while (tamanio <= 0);
        return tamanio;

    }

    public static void llenarArreglo(int[] vector) {
        int valor = 0;
        for (int i = 0; i < vector.length; i++) {
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                    "Introduce la posicion [" + i + "]"));
            vector[i] = valor;
        }

    }

    public static void imprimir(int[] vector) {
        int i = 0;
        for (int valor : vector) {
            System.out.println("El valor de la posicion [" + i + "] = " + valor);
            i++;
        }
    }

    //Realizar una funcion que obtenga el promedio de los valores del vector
    public static double calcularPromedio(int[] vector) {
        double promedio = 0.0;
        double tamanio = 0;
        double valor=0.0;
        for (int x:vector) {

            promedio+=x;


        }
        return promedio/ vector.length;


        }
        //Realizar una funcion que suma los valores de dos vectores
        public static int sumarVectores(int []v1,int []v2){
        int acumulador=0;
        for(int i= 0; i<v1.length;i++){
            acumulador+=v1[i]+v2[i];

        }
        return acumulador   ;
        }
        public static void imprimirVector (int[]arr){
        String salida=" | ";
        for(int valor : arr){
            salida+=valor + " | ";
            System.out.println(salida);
        }
        }
    }

