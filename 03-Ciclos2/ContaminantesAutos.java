import javax.swing.*;

public class ContaminantesAutos {
    public static void main(String[] args) {

        //Definicion de Variables
                int totalAutomoviles = 25;
                double sumaContaminantes = 0.0;
                double menorContaminacion = 0.0; // Inicializamos con el valor más alto posible
                double mayorContaminacion = 0.0; // Inicializamos con el valor más bajo posible
                double puntosContaminacion=0.0;
                double Promedio=0.0;

                //Inicio del Ciclo For
                for (int i = 0; i < totalAutomoviles; i++) {
                    JOptionPane.showMessageDialog(null , "Automóvil " + i );

                    puntosContaminacion =Double.parseDouble( JOptionPane.showInputDialog("Introduce los puntos de contaminación: "));

                    sumaContaminantes += puntosContaminacion;

                 //Condicional If Else para saber si la contaminacion es alta o baja
                    if (puntosContaminacion <= menorContaminacion) {
                        JOptionPane.showMessageDialog(null, "los puntos de contaminacion son menores");
                    }

                    if (puntosContaminacion <= mayorContaminacion) {
                        JOptionPane.showMessageDialog(null, "los puntos de contaminacion son mayores");
                    } //Cierre del If else
                }//Cierre del ciclo for


                Promedio = sumaContaminantes / totalAutomoviles;

                // Salida
                JOptionPane.showMessageDialog
                        (null, "Promedio de puntos de contaminación de los primeros "
                                + totalAutomoviles + " automóviles: " + Promedio +
                "El automóvil que menos contaminó tiene: " + menorContaminacion + " puntos." +
                "El automóvil que más contaminó tiene: " + mayorContaminacion + " puntos.");

            }
        }

