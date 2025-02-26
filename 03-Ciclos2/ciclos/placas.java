import javax.swing.*;

public class placas {
    public static void main(String[] args) {


            int i = 0;
            String color = "";
            int n = 0;
            int amarillo = 0;
            int rosa = 0;
            int roja = 0;
            int verde = 0;
            int azul = 0;
            int numcarros = 0;

            while (i <= 10) {
                color = JOptionPane.showInputDialog("Introduce los dos ultimos digitos  de tu carro");
                if (n == 1 || n == 2) {
                    amarillo++;
                } else if (n == 3 || n == 4) {
                    rosa++;
                } else if (n == 5 || n == 6) {
                    roja++;
                } else if (n == 7 || n == 8) {
                    verde++;
                } else if (n == 9 || n == 0) {
                    azul++;
                }

                i++;
                JOptionPane.showMessageDialog(null, "Numero de autos segun sus placas: \n "
                        + "\namarilla\n" + amarillo + "\nrosa\n" + rosa + "\nroja\n " + roja + "\nverde\n" + verde + "\nazul\n" + azul);
            }
        }
    }

