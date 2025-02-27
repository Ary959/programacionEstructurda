import javax.swing.*;

public class Teatro {
    public static void main(String[] args) {

        //Declaracion de Variables
        double precioAsiento = 100.0;
        double dineroPerdidoCat=0;
        int edad;


        while (true) {
           edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del cliente : "));


            if (edad >= 5 && edad <= 14) {

                double descuento = precioAsiento * 0.35;
                dineroPerdidoCat += descuento;
            } else if (edad >= 15 && edad <= 19) {
                double descuento = precioAsiento * 0.25;
                dineroPerdidoCat += descuento;
            } else if (edad >= 20 && edad <= 45) {
                double descuento = precioAsiento * 0.10;
                dineroPerdidoCat += descuento;
            } else if (edad >= 46 && edad <= 65) {
                double descuento = precioAsiento * 0.25;
                dineroPerdidoCat+= descuento;
            } else if (edad >= 66) {
                double descuento = precioAsiento * 0.35;
                dineroPerdidoCat += descuento;
            } else {
                //Salida
                JOptionPane.showMessageDialog(null,"Este cliente no puede entrar al teatro (menor de 5 años).");

            }
        }





    }
}
