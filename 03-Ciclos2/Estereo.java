import javax.swing.*;

public class Estereo {
    //Declaracion de Variables
    public static void main(String[] args) {
        double precio = 0.0 ;
        double descuento = 0;
        double iva = 0.16;
        double precioFinal=0.0;
        double precioConDescuento = 0.0;
        String marca="";

        //Pedir al usuario el precio y la marca del Estereo para darle valor a
        //nuestras variables
        precio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del estereo:"));
        marca=(JOptionPane.showInputDialog("Introduzca  la marca del estereo:"));

        //Condicional If para saber el descuento que tendra si el precio del estereo
        //es mayor a 2000 o si es marca NOSY
        if (precio >= 2000) {
            descuento += 0.10;
        }


        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;
            precioConDescuento= precio - (precio * descuento);
        }


     //Calcular el precio final
        precioFinal = precioConDescuento * (1 + iva);

     //Salida
        JOptionPane.showMessageDialog(null, "El precio con IVA es de : " + precioFinal);


    }
}
