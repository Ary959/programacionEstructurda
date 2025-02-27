import javax.swing.*;

public class Num1a100 {
    public static void main(String[] args) {

     // ciclo for para mostrar los numeros del 1 al 100
        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {

               JOptionPane.showMessageDialog(null,i + " ");
            }
        }
    }
}