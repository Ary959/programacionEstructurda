package mx.edu.uttt.subprogramas;

import javax.swing.*;
import java.sql.SQLOutput;

public class Saludo {
    public static void main(String[] args) {
//      saludar();
//      saludar2("Arcadia");
//      saludar2("Artemio");
//      saludar2("Harumi tiene mucho sueño" );
//      saludar2("Hector tambien tiene mucho sueño");
//      saludarConNombre("Yahir",666);
//      saludarConNombre("Marisol",7896);

        //Declaracion de variables
        String nombre="";
        int matricula=0;
        int edad=0;
        nombre= JOptionPane.showInputDialog("Introduce tu nombre: ");
        matricula=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu matricula:"));
  saludarConNombre(nombre,matricula);
        nombre= JOptionPane.showInputDialog("Introduce tu nombre: ");
        matricula=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu matricula:"));

        saludarConNombre(nombre,matricula);
        edad=Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad: "));
        saludarConContestacion(nombre,edad);

        String saludo=saludarConContestacion(nombre,edad);
    }
    //Metodo de tipo estatico que no retorna nada
    //y no recibe parametros
    public static void saludar() {
        System.out.println("Hola Mundo");
    }
    //Metodo estatico que no retorna nada (void) y recibe
    //un parametro d tipo String


    public static void saludar2(String nombre){
        System.out.println("Hola Mundo"+nombre);
    }
    public static void saludarConNombre(String nombre, int matricula){
        String cadena ="Hola mundo soy: " +  nombre + "con matricula: " + matricula;
        System.out.println(cadena);

    }
    public static String saludarConContestacion(String nombre, int edad){
        String saludar= "Hola"+ nombre +
                "estas a punto de reprobar programacion a tus " +
                edad;
        return saludar;
    }
}
