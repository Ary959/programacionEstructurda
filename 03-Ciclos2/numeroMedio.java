import javax.swing.*;

public class numeroMedio {
    public static void main(String[] args) {
        //Declaracion de Variables
int num1=0;
int num2=0;
int num3=0;
int medio;
    //Pedir los valores para darle a las variables num1,num2,num3
       num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        num3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero: "));


        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            medio = num2;
        } else {
            medio = num3;
        }

     //Salida
        JOptionPane.showMessageDialog(null, "El numero de el medio es: "+ medio );
    }
}
