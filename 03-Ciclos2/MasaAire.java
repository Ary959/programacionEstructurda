import javax.swing.*;

public class MasaAire {
    public static void main(String[] args) {
        //Definir Variables
        int n=0;
        double sumaMasas = 0;
        double presion=0.00;
        double volumen =0.0;
        double temperatura =0.0;
        double masa =0.0;
        double promedioMasa=0.0;

        //El usuario va a introducir el valor de la variable
        n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de vehículos: "));
        //Inicio Ciclo For
        for (int i = 1; i <= n; i++) {
            JOptionPane.showMessageDialog(null, "Datos del vehículo " + i);

            presion= Double.parseDouble(JOptionPane.showInputDialog("Introduce la presión (en psi o atm): "));

          volumen = Double.parseDouble(JOptionPane.showInputDialog("Introduce el volumen (en litros o cm³): "));

            temperatura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura (en grados Fahrenheit): "));

             masa = (presion * volumen) / (0.37 * (temperatura + 460));

            sumaMasas += masa;
        }  //Cierre del Ciclo for


         promedioMasa = sumaMasas / n;
        //Salida
        JOptionPane.showMessageDialog(null,"\nEl promedio de masa de aire de los vehículos es: \n" + promedioMasa);

    }
}
