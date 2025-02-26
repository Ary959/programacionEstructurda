import javax.swing.*;

public class MayorYMenor {
    public static void main(String[] args) {
        int n=0;
        int numMayor=0;
        int numMenor=0;
        int numero=0;

        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números: "));



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

        JOptionPane.showMessageDialog(null, "\nEl número mayor es: \n" + numMayor +
      "\n El número menor es: \n" + numMenor);

    }
}
