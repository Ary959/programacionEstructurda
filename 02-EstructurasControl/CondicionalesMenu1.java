import javax.swing.*;
import javax.tools.JavaCompiler;

public class CondicionalesMenu1 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";
        boolean sentinel = true;
        //Creacion del Menú con condicional if-else
        menu = "Menu Principal\n" +
                "1)Fabrica \n" +
                "2)Llantera\n" +
                "3)Juego de preguntas " +
                "\n4)Salir" +
                "\nElegirOpcion: ";


            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    int computadora= 11000;
                    double CompraComputadora=0.0;
                    double d1= (CompraComputadora * 11000) * 40 /100;

               CompraComputadora=Double.parseDouble(JOptionPane.showInputDialog ("Introduce el numero de computadoras que compraste"));

                    if (CompraComputadora< 5)
                        JOptionPane.showMessageDialog
                                (null,"El total de la compra con el descuento sería: " +
                                        d1);
                    if (CompraComputadora >=5 )


                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;


            }
        }
    }

