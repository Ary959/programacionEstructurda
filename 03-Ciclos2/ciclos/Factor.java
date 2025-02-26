import javax.swing.*;

public class Factor {
    public static void main(String[] args) {
        int N = 0;
        int  factorial = 1;
        N= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero positivo: "));

        if (N < 0) {
           JOptionPane.showMessageDialog(null,"El número debe ser entero y positivo.");
        } else {




            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }


            JOptionPane.showMessageDialog(null,"El factorial de " + N + " es: " + factorial);
        }
    }
}
