package mx.edu.uttt.subprogramas;

import javax.swing.*;

public class Operaciones {
    public static void main(String[] args) {
        iniciar();
    }
    public static double sumar(double numero1, double numero2) {
        double suma = numero1 + numero2;
        return suma;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
     double division=0.0;
        if (numero2!= 0) {
            return numero1/numero2;
        }else{
            division=-9999;

        }
        return division;
    }

    public static boolean esMayor(double numero1,double numero2){
        //Utilizando un if else
//        if(numero1>numero2){
//            return true;
//        }else{
//            return false;
//        }
        //Utilizando un ternario
//        return (numero1>numero2)?true:false;

        //Retornar directamente sin estructura de control
        return numero1>numero2;
    }
    public static long calcularFct(int n){
        int i=1;
        long fact=1;
        for(i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static String Menu(){
        return "Menu\n"+
                "1)Suma\n"+
                "2)Resta\n"+
                "3)Multiplicacion\n"
                +"4)Division\n"+
                "5)Factorial\n"+
                "6)Es Mayor (boolean)\n"+
                "7)Salir\n"+
                "Elegir Opcion: ";
    }
    public static void calcular(String opcion){

        switch(opcion){
            case "1":
             JOptionPane.showInputDialog(null,sumar(solicitarNumero1(),solicitarNumero2()) ) ;
                break;
            case"2":
                JOptionPane.showInputDialog(null,restar(solicitarNumero1(),solicitarNumero2()) ) ;
                break;
            case"3":
                JOptionPane.showInputDialog(null,multiplicar(solicitarNumero1(),solicitarNumero2()) ) ;
                break;
            case "4":
                JOptionPane.showInputDialog(null,dividir(solicitarNumero1(),solicitarNumero2()) ) ;
                break;
            case "5":
                JOptionPane.showMessageDialog(null, calcularFct(solicitarNumeroN()));
                break;
            case "6":
                break;
            case "7":
                break;
            default:
                JOptionPane.showMessageDialog(null,"opcion no valida");
        }
    }
    public static double solicitarNumero1() {
        return Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1"));
    }

        public static double solicitarNumero2(){
            return Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));
        }
        public static int  solicitarNumeroN(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce numero n"));

        }
        public static void iniciar(){
            //Se muestra el menu y se elige una opción
            String opcion=  JOptionPane.showInputDialog(Menu());
            do {
                opcion = JOptionPane.showInputDialog(Menu());
                if(opcion.equalsIgnoreCase("7")){
                    JOptionPane.showMessageDialog(null, "Adios =(");
                    break;
                }
                calcular(opcion);
            }while(true);
        }

}



