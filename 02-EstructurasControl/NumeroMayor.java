import javax.swing.*;

/*
Evaluar si un número es mayor a 10, utilizando el operador
ternario (?)

(expresión) ? parte true : parte false
 */
public class NumeroMayor {
    public static void main(String[] args) {
        //Declaración de Variables
        double numero = 0.0;
        String Salida = "";

        //Entrada
        numero= Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));

       Salida = (numero>10)?"El numero es mayor a 10 ": "El numero es menor a 10";

       JOptionPane.showMessageDialog(null, Salida);
       if (!(numero>10)) {
           Salida = "El numero es mayor a 10";
       }else{
           Salida="El numero es menor a 10";
       }



    }
}
