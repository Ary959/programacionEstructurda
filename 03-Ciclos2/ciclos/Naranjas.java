import javax.swing.*;

public class Naranjas {
    public static void main(String[] args) {

        double precioPorKilo = 0.0;
        double totalTienda = 0;

        double kilos=0.0;
        double precioTotal=0.0;
                // Número de clientes
                int numeroClientes = 15;

               precioPorKilo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las naranjas: "));

                for (int i = 0; i < numeroClientes; i++) {
                JOptionPane.showMessageDialog (null,"Cliente " + i );

                  kilos=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de kilos que quiere comprar: "));
                     precioTotal = kilos * precioPorKilo;

                    if (kilos > 10) {

                        precioTotal = precioTotal * 0.85;

                    }

                    JOptionPane.showMessageDialog(null, "El cliente pagará: " + precioTotal);


                    totalTienda += precioTotal;
                    JOptionPane.showMessageDialog(null, "El total que la tienda percibirá por estas compras es: " + totalTienda);
                }


                JOptionPane.showMessageDialog(null, "El total que la tienda percibirá por estas compras es: " + totalTienda);


            }
        }



