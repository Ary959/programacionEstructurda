import javax.swing.*;

public class MayorYMenor {
    public static void main(String[] args) {

        //Definicion de Variables
        int n=0;
        int numMayor=0;
        int numMenor=0;
        int numero=0;

       //el usuario va a introducir el valor de la variable cantidad
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números: "));

        //Comienza el ciclo For para saber si el numero es mayor o menor
        for (int i = 1; i <= n; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " + i));

            if (numero > numMayor) {
             numMayor=numero;

            } else if (numero<numMayor){
                numMenor = numero;
                JOptionPane.showMessageDialog(null, "\nEl número mayor es: \n" + numMayor +
                        "\n El número menor es: \n" + numMenor);

            }
            }

        //Salida
        JOptionPane.showMessageDialog(null, "\nEl número mayor es: \n" + numMayor +
      "\n El número menor es: \n" + numMenor);

    }
}
