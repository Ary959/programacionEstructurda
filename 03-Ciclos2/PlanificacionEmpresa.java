import javax.swing.*;

public class PlanificacionEmpresa {
    public static void main(String[] args) {

    //Declaracion de Variables
        double capitalActual =0.0;
        double prestamo = 0;
        double capitalFinal =0.0;
        double insumos =0.0;
        double presupuestoRestante =0.0;
        double incentivos=0.0;

        //Pedir el Valor de variable capitualActual
                capitalActual=Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese el capital de la empresa: "));

                //Condicional para saber que tipo de prestamos el usuario va a tener
        if (capitalActual < 0) {
            prestamo = 10000 - capitalActual;
            capitalFinal = 10000;
        } else if (capitalActual > 0 && capitalActual <= 20000) {
            prestamo = 20000 - capitalActual;
            capitalFinal = 20000;
        }
     //Operaciones para saber presupuestoRestante, insumos e incentivos
        presupuestoRestante = capitalFinal - 5000 - 2000;
         insumos = presupuestoRestante / 2;
         incentivos = presupuestoRestante / 2;


         //Salida
        JOptionPane.showMessageDialog(null, "Capital actual: \n"+ capitalActual +
        "\nCapital final después del préstamo: \n" + capitalFinal+
        "\nPrestamo solicitado: \n"+ prestamo +
        "\nPresupuesto para insumos: \n" +insumos +
        "\n Presupuesto para incentivos al personal: \n" + incentivos);


    }
}
