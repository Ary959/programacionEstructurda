import javax.swing.*;

public class Muestreo {
    public static void main(String[] args) {
      int n=0;
      double sumaN = 0, sumaJ = 0, sumaA = 0, sumaV = 0;
        int i=0;
        int edad=0;
        int persona=0;
        double peso=0.0;
              n=Integer.parseInt(JOptionPane.showInputDialog( "Introduce el número de personas en el muestreo: "));


                for ( i = 0; i < n; i++) {
              JOptionPane.showMessageDialog(null,"Persona :" + i);


                    edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad: "));
                   peso=Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso: "));



                    if (edad >= 0 && edad <= 12) {
                        sumaN += peso;
                        i++;
                    } else if (edad >= 13 && edad <= 29) {
                        sumaJ += peso;
                        i++;
                    } else if (edad >= 30 && edad <= 59) {
                        sumaA += peso;
                        i++;
                    } else if (edad >= 60) {
                        sumaV += peso;
                        i++;
                    } else {
                        System.out.println("Edad no válida, se ignorará esta persona.");
                    }
                }


                if (i > 0) {
                    JOptionPane.showMessageDialog(null,"Promedio de peso de los niños 0-12 años: " + (sumaN / i ));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos");
                }

                if (i > 0) {
                    JOptionPane.showMessageDialog(null,"Promedio de peso de los jovenes 13-29 años " + (sumaJ / i ));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos de jovenes.");
                }

                if (i > 0) {
                    JOptionPane.showMessageDialog(null,"Promedio de peso de los adultos 30-59 años: " + (sumaA/ i ));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos de Adultos.");
                }

                if (i > 0) {
                    JOptionPane.showMessageDialog(null,"Promedio de peso de las personas de 60 en adelante: " + (sumaV / i ));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos de niños.");
                }


            }
        }



