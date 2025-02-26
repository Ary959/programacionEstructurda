import javax.swing.*;

public class suma10num {
    public static void main(String[] args) {
        double suma = 0;
        int numeros=0;

       JOptionPane.showMessageDialog(null,"Introduce 10 numeros para sumarlos:");

        for (int i = 1; i <= 10; i++) {
          numeros=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad #" + i ));

            suma += numeros;
        }

        // Mostrar el resultado de la suma
        JOptionPane.showMessageDialog(null,"La suma total de las 10 cantidades es: " + suma);

    }
}
