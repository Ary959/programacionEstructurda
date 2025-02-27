import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
     //Declaracion de Variables
        int suma = 0;
        for (int i = 100; i >= 0; i -= 2) {
            suma += i;

        }
        //Salida
        JOptionPane.showMessageDialog(null, "La suma de la secuencia es: " + suma);
    }
}
