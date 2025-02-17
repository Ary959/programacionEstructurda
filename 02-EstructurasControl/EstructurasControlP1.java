import javax.swing.*;

public class EstructurasControlP1 {
    public static void main(String[] args) {
//Declaracion de variables
        String opcion = "";
        String menu = "a)Juego\n" +
                "b)Fruteria\n" +
                "c)Laboratorio\n" +
                "d)Salir\n" +
                "Elegir una opcion: ";
        opcion = JOptionPane.showInputDialog(menu);
        opcion=opcion.toUpperCase();
        switch (opcion){
            case "A":
                String pregunta= "¿Colon descubrio America?";
                String resp = JOptionPane.showInputDialog(pregunta + "si/no");
                if(resp.equalsIgnoreCase("si")) {
                    resp=JOptionPane.showInputDialog("La independencia de mexico fue en 1810?");
                    if(resp.equalsIgnoreCase("si")){
                        resp= JOptionPane.showInputDialog("The doors fue un grupo de rock americano?");
                        if (resp.equalsIgnoreCase("si")) {
                        }else{
                            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");

                }
                break;
            case "B":
                
                break;
            case "C":
                break;
            case "D":
                JOptionPane.showMessageDialog(null,
                        "El programa ha terminado");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Opcion no valida");







        }
    }
}
