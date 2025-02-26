import javax.swing.*;

public class Llantera {
    public static void main(String[] args) {
        double precioPorLlantas;
        double total;
        double cantidad=0.0;

        cantidad= Double.parseDouble( JOptionPane.showInputDialog("Ingrese la cantidad de llantas que desea comprar: "));



        if (cantidad < 5) {
            precioPorLlantas = 300.0;
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioPorLlantas = 250.0;
        } else {
            precioPorLlantas = 200.0;
        }

        total = cantidad * precioPorLlantas;


        JOptionPane.showMessageDialog(null, "Precio por llanta: \n" + precioPorLlantas +
                "\nTotal a pagar por la compra: \n" + total);

    }
}
