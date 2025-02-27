import javax.swing.*;

public class Anemia {
    //Declaracion de Variables
    public static void main(String[] args) {
        int edad = 0;
        double hemoglobina = 0.0;
        String sexo = "";
        boolean tieneAnemia = false;

        //Introduccion de valores en las variables
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));

        hemoglobina = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el nivel de hemoglobina :"));

        sexo = JOptionPane.showInputDialog("Ingrese el sexo de la persona : ");


        // Determinar si tiene anemia según la edad, sexo y nivel de hemoglobina
        if (edad >= 0 && edad <= 1) {
            if (hemoglobina < 13 || hemoglobina > 26) {
                tieneAnemia = true;
            }
        } else if (edad > 1 && edad <= 6) {
            if (hemoglobina < 10 || hemoglobina > 18) {
                tieneAnemia = true;
            }
        } else if (edad > 6 && edad <= 12) {
            if (hemoglobina < 11 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edad > 1 && edad <= 5) {
            if (hemoglobina < 11.5 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edad > 5 && edad <= 10) {
            if (hemoglobina < 12.6 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else if (edad > 10 && edad <= 15) {

            if (hemoglobina < 13 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else if (edad > 15) {
            // Mujeres > 15 años: Hemoglobina entre 12 y 16 g
            if (sexo == "femenino" || sexo == "femenino") {
                if (hemoglobina < 12 || hemoglobina > 16) {
                    tieneAnemia = true;
                }
            }
            // Hombres > 15 años: Hemoglobina entre 14 y 18 g
            else if (sexo == "masculino" || sexo == "masculino") {
                if (hemoglobina < 14 || hemoglobina > 18) {
                    tieneAnemia = true;
                }
            }
        }

        // Mostrar la salida
        if (tieneAnemia) {
            JOptionPane.showMessageDialog(null,"La persona tiene anemia.");
        } else {
            JOptionPane.showMessageDialog(null,"La persona  no tiene anemia.");
        }
    }
}