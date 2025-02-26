import javax.swing.*;

public class preguntas {
    public static void main(String[] args) {

        String pregunta = "¿Colon descubrio America?";
        String resp = JOptionPane.showInputDialog((pregunta + "Si/No"));
        if (resp.equalsIgnoreCase("Si")) {
            resp = JOptionPane.showInputDialog("¿La independencia fue en 1810?");
            if (resp.equalsIgnoreCase("SI")) {
                resp = JOptionPane.showInputDialog("¿The doors fue un grupo de rock Americano?");
                if (resp.equalsIgnoreCase("si")) {
                    JOptionPane.showMessageDialog(null, "Has ganado.");

                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido.");

        }
    }
}