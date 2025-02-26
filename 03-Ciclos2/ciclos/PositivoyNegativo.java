import javax.swing.*;

public class PositivoyNegativo {
    public static void main(String[] args) {
        int n = 0;
        int sumaPositivos = 0;
        int multiplicacionNegativos = 1;
        int num = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números (n): "));


        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, "Introduce el número " + (i + 1) + ": ");


            if (num > 0) {
                sumaPositivos += num;
            }
            // Si el número es negativo, multiplicar
            else if (num < 0) {
                multiplicacionNegativos *= num;

            }
        }


        JOptionPane.showMessageDialog(null, "La suma de los números positivos es: " + sumaPositivos +
                "El producto de los números negativos es: " + multiplicacionNegativos);
    }
}




