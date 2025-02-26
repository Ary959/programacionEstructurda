import javax.swing.*;

public class Fruteria {
    public static void main(String[] args) {
        double precioPorKilo=0.0;
        double kilosComprados = 0.0;
        double precioTotal=0.0;
        double descuento=0.0;
        double descuentoAplicado=0.0;
        double totalPagar = 0.0;
                precioPorKilo=Double.parseDouble(   JOptionPane.showInputDialog("Ingrese el precio por kilo de manzanas: ") );

        kilosComprados=Double.parseDouble(   JOptionPane.showInputDialog("Ingrese la cantidad de kilos que desea comprar:"));

         precioTotal = kilosComprados * precioPorKilo;
         descuento = 0;

        // Determinar el descuento según la cantidad de kilos
        if (kilosComprados >= 2 && kilosComprados <= 5) {
            descuento = 0.10;
            JOptionPane.showMessageDialog(null, "tu descuento es del 10%" );
        } else if (kilosComprados > 5 && kilosComprados <= 10) {
            descuento = 0.15;
            JOptionPane.showMessageDialog(null, "tu descuento es del 15%" );
        } else if (kilosComprados > 10) {
            descuento = 0.20;
            JOptionPane.showMessageDialog(null, "tu descuento es del 20%" );

        }


        descuentoAplicado = precioTotal * descuento;


      totalPagar=precioTotal- descuentoAplicado;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El total a pagar de las manzanas:  \n"+ totalPagar);
    }
}
