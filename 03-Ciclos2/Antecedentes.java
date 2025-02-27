import javax.swing.*;

public class Antecedentes {
    public static void main(String[] args) {

        //Definición de variables
        int N = 0;
        int suma = 0;
        //Introduccion de valores en las variables
      N=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
      //Operacion para sumar los antecentes del numero ingresado por el usuario
            for (int i = 1; i < N; i++) {
                suma += i;
            }

            // Imprimir la salida
           JOptionPane.showMessageDialog(null,"La suma de los números que anteceden a " + N + " es: " + suma);
        }
    }

