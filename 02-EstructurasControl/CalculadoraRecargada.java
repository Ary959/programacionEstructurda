import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {

        //Declaración de variables
        String menu = "";
        String opcion = String.valueOf(0), resultado = "";
        double num1=0.0, num2=0.0;

        menu= "MENU PRINCIPAL\n"+
                "1)Sumar\n2)Restar\n"+
                "3) Multiplicar\n"+
                "4)Division\n"+
                "5)Modulo\n"+
                "Elegir opcion:";

        opcion = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        num1= Double.parseDouble((JOptionPane.showInputDialog("introduce el numero 1")));
        num2= Double.parseDouble((JOptionPane.showInputDialog("introduce el numero 2")));
        opcion = opcion.toUpperCase();
        if(num2>0.0) switch (opcion) {

        }
        else {
            JOptionPane.showMessageDialog(null, "Elnumero 2 no puede");
        }

        switch (opcion){
            case "a":
            case "A":

                //suma
               resultado= "La suma es :"+ (num1+num2);
                break;
            case "b":
            case "B":
                //resta
                resultado=  "La resta es :"+ (num1-num2);
                break;
            case "c":
            case "C":
                //Multiplicacion
                resultado=  "La multiplicacion es :"+ (num1*num2);
                break;
            case "d":
            case "D":
                //Division
                resultado= resultado= "La division es :"+ (num1/num2);

                break;
            case "e":
                //Modulo
                resultado= "El modulo es "+ (num1%num2);
                break;
            default:
               resultado= "Caso no valido";

        }
// JOptionPane.showMessageDialog(null, opcion);


    }
}
