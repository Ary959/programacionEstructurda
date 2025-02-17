import javax.swing.*;

public class CalculadoraSencilla {
    public static void main(String[] args) {

        //Declaración de variables
        String menu = "";
        String opcion = String.valueOf(0);
        double resultado= 0.0 ,num1=0.0, num2=0.0;

  menu= "MENU PRINCIPAL\n"+
  "1)Sumar\n2)Restar\n"+
  "3) Multiplicar\n"+
  "4)Division\n"+
  "5)Modulo\n"+
  "Elegir opcion:";

  opcion = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog(menu)));
  num1= Double.parseDouble((JOptionPane.showInputDialog("introduce el numero 1")));
        num2= Double.parseDouble((JOptionPane.showInputDialog("introduce el numero 2")));
        if(num2>0.0) switch (opcion) {

        }
        else {
            JOptionPane.showMessageDialog(null, "Elnumero 2 no puede");
        }

  switch (opcion){
      case "1":
          //suma
        resultado=num1 + num2;
        JOptionPane.showMessageDialog
                (null, "La suma es :"+ resultado);
          break;
      case "2":
          //resta
          resultado=num1 - num2;
          JOptionPane.showMessageDialog
                  (null, "La resta es :"+ resultado);
          break;
      case "3":
          //Multiplicacion
          resultado=num1 * num2;
          JOptionPane.showMessageDialog
                  (null, "La multiplicacion es :"+ resultado);
          break;
      case "4":
          //Division
          resultado=num1 / num2;
          JOptionPane.showMessageDialog
                  (null, "La división es :"+ resultado);

          break;
      case "5":
          //Modulo
          resultado=num1 % num2;
          JOptionPane.showMessageDialog
                  (null, "El modulo es:"+ resultado);
          break;
      default:
          JOptionPane.showMessageDialog(null, "caso no valido");

  }
// JOptionPane.showMessageDialog(null, opcion);


    }
}
