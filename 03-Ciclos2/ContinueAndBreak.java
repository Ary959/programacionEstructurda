import javax.swing.*;

public class ContinueAndBreak {
    public static void main(String[] args) {
        //Declaración de Variables
        int suma = 0;
        int numero = 0;
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de numeros a ingresar"));

        //Inicio del Ciclo For
        for (int i = 1; i <= n; i++) {
            numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero : "+ i));
            if(numero==0){
                continue;
            }
            if(numero<0){
                break;

            }
            suma+=numero;

        }//Cierre del ciclo For

        //Salida
        JOptionPane.showMessageDialog(null, "La suma de los números es: "
        + suma);

    }
}