import javax.swing.*;

public class Antecedentes {
    public static void main(String[] args) {
        int N = 0;
        int suma = 0;
      N=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

            for (int i = 1; i < N; i++) {
                suma += i;
            }

            // Imprimir el resultado
           JOptionPane.showMessageDialog(null,"La suma de los números que anteceden a " + N + " es: " + suma);
        }
    }

