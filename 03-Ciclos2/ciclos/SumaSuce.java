import javax.swing.*;

public class SumaSuce {
    public static void main(String[] args) {
        int N=0;
        int suma = 0;
        int termino = 20;
        int sucesion=5;
        N=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N: "));



        while(termino <= N) {

            suma += termino;
            termino += 5;
            sucesion+=5;


        }


        JOptionPane.showMessageDialog(null, "La sucesión es: " + sucesion+
        "La suma de la sucesión es: " + suma);


    }
}
