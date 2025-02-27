import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaración de variables
        int i=0;
        int numTrabajadores= 0;
        int numHorasExtras=0;
        int  numHorasTrabajadas=0;
        double salarioTotal =0.0;
        String salida="";

        numTrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de trabajadores"));
        salida="Reporte de Salarios Semanales \n" +
                "Empleado        "+ "Horas Trabajadas  "+ "Horas Extras     "+
        "Salario Total \n";
               i=1;
               //Inicializacion del ciclo while para saber los salarios de los
        //Trabajadores de una empresa
               while(i<=numTrabajadores){
                   numHorasTrabajadas =Integer.parseInt(JOptionPane.showInputDialog("Numeros de horas trabajadas: "));
                   if(numHorasTrabajadas<=40) {
                       salarioTotal = numHorasTrabajadas * 20;
                       salida+="Empleado"+ i +"   " + numHorasTrabajadas+
                               "   " + numHorasExtras + "      " + salarioTotal;
                   }else{
                       numHorasExtras= numHorasTrabajadas -40;
                       salarioTotal=40 *20+ numHorasExtras *25;
                       salida+="Empleado"+ i +"   " + numHorasTrabajadas+
                               "   " + numHorasExtras + "      " + salarioTotal;
                   }
                   //Salida
                   JOptionPane.showMessageDialog(null, salida);
                   i++;
               }
    }
}
