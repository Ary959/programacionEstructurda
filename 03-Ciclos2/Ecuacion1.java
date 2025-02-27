import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {
        //Definicion de Variables
        int n = 0;
        int denSup = 0;
        int deno = 0;
        double s = 0.0;
        double x = 0.0;

       //Inicio del Ciclo DO-WHILE
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog
                    ("introduce el numero de fracciones"));
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x "));
            if (n < 0) {
                JOptionPane.showMessageDialog(null, "La n es incorrecta");
            } else if (x < 0.0) {
                JOptionPane.showMessageDialog(null, "La x es incorrecta");
            }
        }
        while (n < 0 || x < 0.0);
        //Cierre del ciclo DO-WHILE



        //Inicio del Ciclo For
        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, 3.0 / denSup) / deno;
            denSup += 3;
            deno += 2;


         //Salida
            JOptionPane.showMessageDialog(null, "El valor de 'S':" + String.format("%3f", s));


        } //Cierre del Ciclo For
    }
}



