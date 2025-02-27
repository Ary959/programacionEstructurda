import javax.swing.*;

public class PromedioCalif {
    public static void main(String[] args) {
      //Declaracion de Variables
        int n=0;
        double calificaciones=0.0;
        int i=1;
           double suma=0.0;
           double promedio=0.0;


               n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones: "));

            //Ciclo for de i=1 hasta el que el usuario puso de variable
                for ( i = 1; i < n; i++) {
                    calificaciones=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación num "+i +" :"));

                    suma += calificaciones;
                }


                 promedio = suma / n;

             //Salida
                JOptionPane.showMessageDialog(null,"El promedio de las calificaciones es: " + promedio);


            }
        }




