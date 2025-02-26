import javax.swing.*;

public class sucesion2 {
    public static void main(String[] args) {
        int N=0;
        int suma = 0;
        int i=1;
        int cuadrado=0;
        int sucesion=0;
        N=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N : "));






        for ( i = 1; i <= N; i++) {
            cuadrado = i * i;
            suma += cuadrado;
            JOptionPane.showMessageDialog(null, "la sucesion es: "+ cuadrado);
        }



        JOptionPane.showMessageDialog(null,"La suma de la sucesión es: " + suma);

    }
}
