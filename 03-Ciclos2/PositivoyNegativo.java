import javax.swing.*;

public class PositivoyNegativo {
    public static void main(String[] args) {

        //Declaracion de Variables
        int n = 0;
        int sumaPositivos = 0;
        int multiplicacionNegativos = 1;
        int num = 0;
        //Pedir al usuario que introduzca la cantidad de numeros que quiera
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números (n): "));

        //Ciclo For para parar en el valor n que ingreso el usuario
        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, "Introduce el número " + (i + 1) + ": ");

         //Condicional de IF ELSE si num es mayor a 0 es positivo y si no es negativo
            if (num > 0) {
                sumaPositivos += num;
            }
            // Si el número es negativo, multiplicar
            else if (num < 0) {
                multiplicacionNegativos *= num;

            }
        }

       //Salida
        JOptionPane.showMessageDialog(null, "La suma de los números positivos es: " + sumaPositivos +
                "El producto de los números negativos es: " + multiplicacionNegativos);
    }
}




