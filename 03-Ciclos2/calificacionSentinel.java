import javax.swing.*;

public class calificacionSentinel {
    public static void main(String[] args) {

       //Definicion de Variables
        int numAprobados = 0;
        int numReprobados = 0;
        int numeroDeCalif = 0;
        double calif = 0.0;

        //Pedir que el usuario le de un valor a la variable numeroDeCalif

        numeroDeCalif = Integer.parseInt(JOptionPane.showInputDialog(("Cuantas calificaciones se van a evaluar")));
        //Inicia Ciclo for
        for (int i = 1; i < numeroDeCalif; i++) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion" + i));
            if (calif >= 7.0) {
                //Contador de número de Aprobados
                numAprobados++;
            } else {
                numReprobados++;

            }

        }//Cierra ciclo for
        JOptionPane.showMessageDialog(null, "El numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);


        int i = 1;
        numAprobados = 0;
        numReprobados = 0;

        while (1 <= numeroDeCalif) ;
        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion" + i));
        if (calif >= 7.0) {
            numAprobados++;
        } else {
            numReprobados++;
        }
        i++;
        JOptionPane.showMessageDialog(null, "El numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
        i = 0;
        numAprobados = 0;
        numReprobados = 0;
        //Inicia Ciclo DO-WHILE
        do {
            calif = Double.parseDouble((JOptionPane.showInputDialog("Introduce la calificacion" + i)));
            if (calif >= 7.0) {
                numAprobados++;
            } else {
                numReprobados++;

            }
            i++;

        } while (i <= numeroDeCalif); //Cierra ciclo DO-WHILE

        //Salida

        JOptionPane.showMessageDialog(null, "El numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}
