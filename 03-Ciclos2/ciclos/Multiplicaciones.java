import javax.swing.*;

public class Multiplicaciones {
    public static void main(String[] args) {
        int n = 0;
        int resultado=0;
       n=Integer.parseInt (JOptionPane.showInputDialog("\"Introduce el número para calcular su tabla de multiplicar: "));



        JOptionPane.showMessageDialog(null,"Tabla de multiplicar de " + n + ":");
        for (int i = 1; i <= 10; i++) {

             resultado = n * i;
            JOptionPane.showMessageDialog(null, n + " x " + i + " = " + resultado);
        }
    }

}
