import javax.swing.*;

public class Multiplicaciones {
    public static void main(String[] args) {
        //Definicion de Variables
        int n = 0;
        int resultado=0;
        //Pedir al usuario que numero de tabla de multiplicar desea
       n=Integer.parseInt (JOptionPane.showInputDialog("\"Introduce el número para calcular su tabla de multiplicar: "));

        //Mostrar mensaje para tabla de multiplicar
        JOptionPane.showMessageDialog(null,"Tabla de multiplicar de " + n + ":");

        //Inicializar el for para que se detenga en el numero 10
        for (int i = 1; i <= 10; i++) {

             resultado = n * i;

             //Salida
            JOptionPane.showMessageDialog(null, n + " x " + i + " = " + resultado);
        }
    }

}
