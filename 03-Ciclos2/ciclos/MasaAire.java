import javax.swing.*;

public class MasaAire {
    public static void main(String[] args) {

        int n=0;
        double sumaMasas = 0;
        double presion=0.00;
        double volumen =0.0;
        double temperatura =0.0;
        double masa =0.0;
        double promedioMasa=0.0;
        n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de vehículos: "));

        for (int i = 1; i <= n; i++) {
            JOptionPane.showMessageDialog(null, "Datos del vehículo " + i);

            presion= Double.parseDouble(JOptionPane.showInputDialog("Introduce la presión (en psi o atm): "));

          volumen = Double.parseDouble(JOptionPane.showInputDialog("Introduce el volumen (en litros o cm³): "));

            temperatura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura (en grados Fahrenheit): "));

             masa = (presion * volumen) / (0.37 * (temperatura + 460));

            sumaMasas += masa;
        }


         promedioMasa = sumaMasas / n;

        JOptionPane.showMessageDialog(null,"\nEl promedio de masa de aire de los vehículos es: \n" + promedioMasa);

    }
}
