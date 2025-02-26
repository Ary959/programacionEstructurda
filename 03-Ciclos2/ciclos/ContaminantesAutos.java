import javax.swing.*;

public class ContaminantesAutos {
    public static void main(String[] args) {

                int totalAutomoviles = 25;

                double sumaContaminantes = 0.0;
                double menorContaminacion = 0.0; // Inicializamos con el valor más alto posible
                double mayorContaminacion = 0.0; // Inicializamos con el valor más bajo posible
                double puntosContaminacion=0.0;
                double Promedio=0.0;

                for (int i = 0; i < totalAutomoviles; i++) {
                    JOptionPane.showMessageDialog(null , "Automóvil " + i );

                    puntosContaminacion =Double.parseDouble( JOptionPane.showInputDialog("Introduce los puntos de contaminación: "));

                    sumaContaminantes += puntosContaminacion;


                    if (puntosContaminacion <= menorContaminacion) {
                        JOptionPane.showMessageDialog(null, "los puntos de contaminacion son menores");
                    }

                    if (puntosContaminacion <= mayorContaminacion) {
                        JOptionPane.showMessageDialog(null, "los puntos de contaminacion son mayores");
                    }
                }


                Promedio = sumaContaminantes / totalAutomoviles;

                // Mostrar los resultados
                JOptionPane.showMessageDialog
                        (null, "Promedio de puntos de contaminación de los primeros "
                                + totalAutomoviles + " automóviles: " + Promedio +
                "El automóvil que menos contaminó tiene: " + menorContaminacion + " puntos." +
                "El automóvil que más contaminó tiene: " + mayorContaminacion + " puntos.");

            }
        }

