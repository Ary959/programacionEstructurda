package mx.edu.uttt.arreglos;

import javax.swing.*;

public class ArreglosCiclicosSinFunciones {
    public static void main(String[] args) {
        int[] arr1;
        int tam = 0;

        do {
            tam = Integer.parseInt((JOptionPane.showInputDialog("Introduce el tamaño del arreglo")));
            if (tam <= 0)
                JOptionPane.showMessageDialog
                        (null, "Tamaño no valido");

        } while (tam <= 0);
        arr1 = new int[tam];
        //Imprimir Arreglo forma 1
        int i;
        for (i = 0; i < arr1.length; i++) {
            //i<=arr1.length-1 o puede ser i< arr1.length or i<tam
            System.out.println(arr1[i]);
        }
        //Llenar arreglo
       i=0;
        while(i<arr1.length){
            arr1[i]=Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce el valor [ " + i+ "]"));
            i++;
        }

        for(int valor:arr1){
            System.out.println(valor);
            //foreach

        }
    }
}
