import javax.swing.*;

public class Factor {
    public static void main(String[] args) {
        //Definicion de Variables
        int N = 0;
        int  factorial = 1;

        //Pedir al usuario que introduzca el numero que el desee
        N= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero positivo: "));

        if (N < 0) {
           JOptionPane.showMessageDialog(null,"El número debe ser entero y positivo.");
        } else {



          //Inicoo de For para saber el factorial del numero que ingreso el usuario
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }

          //Salida
            JOptionPane.showMessageDialog(null,"El factorial de " + N + " es: " + factorial);
        }
    }
}
