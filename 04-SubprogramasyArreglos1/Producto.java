package mx.edu.uttt.arreglos;

import javax.swing.*;

public class Producto {
    public static void main(String[] args) {
   int tam=solicitarTamanio();
   String []prod=new String[tam];
   double[]unidades=new double[tam];
   double []precios= new double [tam];
   double[]importes=new double[tam];
   solicitarProductos(prod);

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
    public static void solicitarProductos(String[]p){
        for(int i=0; i<p.length; i++){
            p[i]=JOptionPane.showInputDialog("Introduce el nombre del producto");
        }

    }
    public static void imprimir(String[] nombre,double[]unidades,double[]precios,double[]importe){

    }
    public static void Imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("| " + v[i] + "|");
        }
        System.out.println();
    }


}
