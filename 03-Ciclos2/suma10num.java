import javax.swing.*;

public class suma10num {
    public static void main(String[] args) {
        //Declaracion de Variables
        double suma = 0;
        int numeros=0;

       JOptionPane.showMessageDialog(null,"Introduce 10 numeros para sumarlos:");

       //Ciclo for para que de i que vale 1 pare cuando i es menor o igual a 10
        for (int i = 1; i <= 10; i++) {
          numeros=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad #" + i ));

            suma += numeros;
        }

        // Mostrar salida que es el resultado de la suma
        JOptionPane.showMessageDialog(null,"La suma total de las 10 cantidades es: " + suma);

    }
}
