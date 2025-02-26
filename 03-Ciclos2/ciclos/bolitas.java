import javax.swing.*;

public class bolitas {
    public static void main(String[] args) {
        //Tienda de bolitas
        String respuesta="", resultado="";
        String tipoBolita="";
        boolean sentinel2= true;
        double totalCompra=0.0;
        double descuento=0.0, importe=0.0, total=0.0;
        String salida= "";
        String menuBolitas= "Tombola\n" +
                "a) Bolita Roja\n" +
                "b) Bolita Amarilla\n" +
                "c) Bolita Blanca\n" +
                "Elegir Opcion";
        resultado="Total de ventas\n" +
                "Total a pagar                     " + "Descuento                  " + "Importe     s       \n";
        do {
            totalCompra=Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de la compra"));
            tipoBolita=JOptionPane.showInputDialog(menuBolitas);

            if (tipoBolita.equalsIgnoreCase("a" )|| tipoBolita.equalsIgnoreCase("b") || tipoBolita.equalsIgnoreCase("c")){
                if (tipoBolita.equalsIgnoreCase("a")){
                    descuento= totalCompra * 0.40;
                }else if (tipoBolita.equalsIgnoreCase("b")){
                    descuento= totalCompra * 0.25;
                }else {
                    descuento= 0.0;
                }

                importe= totalCompra-descuento;
                total+=importe;

                resultado+=totalCompra + "            " + descuento + "                 " + importe + "\n";

            }else{
                JOptionPane.showMessageDialog(null,"Bolita NO valida");
            }
            salida=JOptionPane.showInputDialog(null, "Deseas cerrar la caja si/no");
            if (salida.equalsIgnoreCase("si")){
                sentinel2=false;
            }
        }while (sentinel2);

        resultado+="Total: " + total;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
