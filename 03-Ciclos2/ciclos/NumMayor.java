import javax.swing.*;

public class NumMayor {
    public static void main(String[] args) {
        double numero = 0.0;
        String Salida = "";

        //Entrada
        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));

        Salida = (numero > 10) ? "El numero es mayor a 10 " : "El numero es menor a 10";

        JOptionPane.showMessageDialog(null, Salida);
        if (!(numero > 10)) {
            Salida = "El numero es mayor a 10";
        } else {
            Salida = "El numero es menor a 10";
        }
    }
}
