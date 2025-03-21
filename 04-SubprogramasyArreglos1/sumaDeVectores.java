package mx.edu.uttt.arreglos;

import javax.swing.*;

public class sumaDeVectores {
    public static void main(String[] args) {
        //elaborar un programa que leea los elementos de 2 arreglos cada uno con N numero enteros.
        // Calcular un tercer arreglo sumando los 2 primeros de la sig  manera:
        //que sume el elemnto 1 del primer arreglo y el 1 del segundo y que el resultado se almacene en el primero del tercero
        // además se requiere que al final imprima los 3 arreglos

        int tam = solicitarTamanio();
        int v1[] = new int[tam];
        int v2[] = new int[tam];
        llenarArreglo(v1);
        llenarArreglo(v2);
        Imprimir(v1);
        Imprimir(v2);

        Imprimir(sumar(v1,v2));


    }


    public static void Imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("| " + v[i] + "|");
        }
        System.out.println();
    }
    public static  int solicitarTamanio(){
        int n=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del Arreglo "));
            if (n<=0){
                JOptionPane.showMessageDialog(null, "el tamaño no puede ser negativo o 0");
            }
        }while(n<=0);
       return n;
    }
    public static void llenarArreglo(int[] v ){
        int i= 0;
        while(i<v.length){
            v[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor "+ (i+1)));
            i++;
        }


    }
    public static int[]sumar(int []v1, int[]v2){
      int [] v3=new int[v2.length];
      for(int i=0; i<v1.length; i++){
          v3[i]=v1[i]+v2[i];
      }
      return v3;
    }
}
