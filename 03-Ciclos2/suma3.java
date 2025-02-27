import javax.swing.*;

public class suma3 {
    public static void main(String[] args) {

        //Declaracion de Variables
        int suma = 0;
        //Ciclo For de i que vale 1 para que pare en 100 y contador para que sume
        //sus numeros
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

//Salida
    JOptionPane.showMessageDialog(null,"La suma de los números del 1 al 100 es: " + suma);
    }
}
