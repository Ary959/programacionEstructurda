import javax.swing.*;

public class Estereo {
    public static void main(String[] args) {
        double precio = 0.0 ;
        double descuento = 0;
        double iva = 0.16;
        double precioFinal=0.0;
        double precioConDescuento = 0.0;
        String marca="";

        precio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del estereo:"));
        marca=(JOptionPane.showInputDialog("Introduzca  la marca del estereo:"));




        if (precio >= 2000) {
            descuento += 0.10;
        }


        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;
            precioConDescuento= precio - (precio * descuento);
        }



        precioFinal = precioConDescuento * (1 + iva);


        JOptionPane.showMessageDialog(null, "El precio con IVA es de : " + precioFinal);


    }
}
