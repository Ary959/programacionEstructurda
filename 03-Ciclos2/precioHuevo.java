import javax.swing.*;

public class precioHuevo {
    public static void main(String[] args) {

        //Declaracion de Variables
        int n=0;
        double sumaCalidades = 0;
        double peso =0.0;
        double altura=0.0;
        int huevos =0;
        double calidad= 0.0;
        double promedioCalidad =0.0;
        double precioKiloHuevo=0.0;

        //Pedir el numero de N
                n=Integer.parseInt(JOptionPane.showInputDialog
                        ("Introduce el número de gallinas: "));

         //FOR de i hasta el numeor que ingreso el usuario
        for (int i = 1; i <= n; i++) {
            JOptionPane.showMessageDialog(null,"Datos de la gallina " + i);

           //Pedir el valor de peso,altura,huevos
           peso=Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso de la gallina: "));
            altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura de la gallina: "));
            huevos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de huevos que pone: "));

             calidad = (peso * altura) / huevos;
            sumaCalidades += calidad;
        }


         promedioCalidad = sumaCalidades / n;

        if (promedioCalidad >= 15) {
            precioKiloHuevo = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8 && promedioCalidad < 15) {
            precioKiloHuevo = 1.00 * promedioCalidad;
        } else {
            precioKiloHuevo = 0.80 * promedioCalidad;
        }

     //Salida
        JOptionPane.showMessageDialog(null, "\nEl promedio de calidad de las gallinas es: \n" + promedioCalidad +
        "\nEl precio por kilo de huevo es: " + precioKiloHuevo);

    }
}
