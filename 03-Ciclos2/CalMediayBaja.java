import javax.swing.*;

public class CalMediayBaja {
    public static void main(String[] args) {

        //Definicion de Variables
       int n=0;
       int i=1;
       double calificaciones=0.0;
       double suma=0;
       double calificacionMinima=0.0;
        double media=0.0;
             //Pedir al usuario que ingrese el numero de alumnos
               n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de alumnos: "));

           //Inicia ciclo for para calcular las calificaciones
                for ( i = 1; i < n; i++) {
                    calificaciones=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación num "+i +" :"));
                    suma += calificaciones;


                    if (calificaciones < calificacionMinima) {
                        calificacionMinima =calificaciones;
                    }
                }  //Cierra ciclo for

            // Hacemos la operacion para la suma
                 media = suma / n;
           //SALIDA
       JOptionPane.showMessageDialog (null, "La calificación media del grupo es: \n " + media+
                "\nLa calificación más baja del grupo es: \n" + calificacionMinima);


            }
        }


