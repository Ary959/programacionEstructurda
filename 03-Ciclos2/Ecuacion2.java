import javax.swing.*;

public class Ecuacion2 {
    public static void main(String[] args) {
        //declaracion de variables
        double s=0.0;
        double x=0.0;
        int n = 0;
        double deno= 0.0;
        double supDeno =0.0;
         int i=1;
        n = Integer.parseInt(JOptionPane.showInputDialog("El numero de fracciones a resolver"));
         i =1;
        supDeno=3.0;
        deno=1.0;
        //Inicializacion del ciclo While
        while(i<=n){
            x= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));

            if (i%2!=0){
               s+=Math.pow(x, 3.0/supDeno)/deno ;
            }else{
                s-=Math.pow(x, 3.0/supDeno)/deno ;
            }
            //Inicio de contadores
            supDeno+=3;
            deno+=2;
          i++;
        }

        //Salida
        JOptionPane.showMessageDialog(null, "El valor de S"+ String.format("%.3f",s));
    }
}
