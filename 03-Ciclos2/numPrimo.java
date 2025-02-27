import javax.swing.*;

public class numPrimo {
    public static void main(String[] args) {

        //Definicion Variables
        int num = 0;
        //Pedir al usurario que introduzca el valor de num
      num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

      //Salida
        if (num <= 1) {
            JOptionPane.showMessageDialog(null,num + " no es un número primo");
        } else if (num == 2) {
            JOptionPane.showMessageDialog(null,num + " es un número primo.");
        }




                }
            }





