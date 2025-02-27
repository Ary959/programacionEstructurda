import javax.swing.*;

public class Supermercado {
    public static void main(String[] args) {

        //Declaracion de Variables
        double totalCompras = 0;
        String continuar = "n";
        double precio = 0.0;
        int articulos = 0;
        double gastoArticulo = 0.0;

        //WHILE mientras continuar sea igual a "n" pide el precio, articulo y el gasto
       //contador en totalCompras
        while (continuar == "n") {

           precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del artículo: "));

            articulos=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de artículos: "));

            gastoArticulo = precio * articulos;


            totalCompras += gastoArticulo;


            continuar=String.format(JOptionPane.showInputDialog("¿Desea agregar otro artículo? (s para sí, cualquier otra tecla para no): "));

        }

      //Salida
        JOptionPane.showMessageDialog(null, "El total de sus compras es: " + totalCompras);
    }
}
