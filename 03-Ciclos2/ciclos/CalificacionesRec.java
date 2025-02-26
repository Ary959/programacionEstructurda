import javax.swing.*;

public class CalificacionesRec {
    public static void main(String[] args) {
        double promedio =0.0;
        String  alumno="";
        int unidadesCursar = 0;
        double descuento = 0.0;
        double colegiatura = 0.0;
        int materiasReprobadas =0;

        promedio=Double.parseDouble(JOptionPane.showInputDialog("cual es tu promedio: "));

        JOptionPane.showInputDialog("Introduce en que nivel educativo vas: ");


        if (alumno=="preparatoria") {

            if (promedio >= 9.5) {
                unidadesCursar = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                unidadesCursar = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                unidadesCursar = 50;
                descuento = 0.00;
            } else {
                materiasReprobadas=Integer.parseInt(JOptionPane.showInputDialog
                        ("Introduce las materias Reprobadas"));

                if (materiasReprobadas <= 3) {
                    unidadesCursar = 45;
                } else {
                    unidadesCursar = 40;
                }
                descuento = 0.00;
            }
            colegiatura = (unidadesCursar / 5) * 180;
            colegiatura -= colegiatura * descuento; // Aplicar el descuento

        } else if (alumno=="profesional") {

            if (promedio >= 9.5) {
                unidadesCursar = 55;
                descuento = 0.20;
            } else {
                unidadesCursar = 55;
                descuento = 0.00;
            }

            colegiatura = (unidadesCursar / 5) * 300;
            colegiatura -= colegiatura * descuento;
        }


        JOptionPane.showMessageDialog(null, "El alumno puede cursar " + unidadesCursar + " unidades\n" +
        "El total a pagar es: $" + colegiatura);
    }
}
