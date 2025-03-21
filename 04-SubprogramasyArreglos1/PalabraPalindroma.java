package mx.edu.uttt.arreglos;

import javax.swing.*;

public class PalabraPalindroma {
    public static void main(String[] args) {
       String pa=PedirPalabra();
       PedirPalabra();
        imprimirPalabra(pa);
        saberSiEsPalindroma(pa);
        ImprimirResult(pa);
    }
    public static String PedirPalabra(){
        String pa="";
        pa= JOptionPane.showInputDialog("Introduce la palabra que usted quiera:");
        return pa;
    }
    public static void imprimirPalabra(String word){
        for(int i=0; i<word.length();i++){
            System.out.println(word.charAt(i));
        }    }
    public static  boolean saberSiEsPalindroma(String palabra){
        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                System.out.println("Es una palabra palindromo");

                return false;

            }
            inicio++;
            fin--;
        }

        return true;

    }
    public static void ImprimirResult(String palabra){
        int inicio=0;
        int fin=0;
        if(palabra.charAt(inicio) == palabra.charAt(fin)){
            System.out.println("La palabra es polindroma");


        } else if (palabra.charAt(inicio)< palabra.charAt(fin)) {
            System.out.println("La palabra no es polindroma");

        }
    }
    }


