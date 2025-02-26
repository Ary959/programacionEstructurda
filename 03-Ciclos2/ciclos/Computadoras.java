import javax.swing.*;

public class Computadoras {
    public static void main(String[] args) {
        //Variables
        double precioPorComputadora = 11000.0;
        double total, descuento = 0;
        double cantidad=0.0;


        cantidad=Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de computadoras que se utilizara"));



        if (cantidad < 5) {
            descuento = 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = 0.20;
        } else {
            descuento = 0.40;
        }

        total = cantidad * precioPorComputadora;
        total = total - (total * descuento);

        //salida


        JOptionPane.showMessageDialog(null,"El total a pagar es: " + String.format("%3f",total));


    }
}
