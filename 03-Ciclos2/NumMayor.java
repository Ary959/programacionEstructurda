import javax.swing.*;

public class NumMayor {
    public static void main(String[] args) {
        //Declaracion de Variables
        double numero = 0.0;
        String Salida = "";


        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));

        Salida = (numero > 10) ? "El numero es mayor a 10 " : "El numero es menor a 10";
      //Salida
        JOptionPane.showMessageDialog(null, Salida);
        if (!(numero > 10)) {
            Salida = "El numero es mayor a 10";
        } else {
            Salida = "El numero es menor a 10";
        }
    }
}
