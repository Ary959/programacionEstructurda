package mx.edu.uttt.subprogramas;

import javax.swing.*;

public class TestCasa {

    public static void main(String[] args) {
        String color="";
        Casa casa1=new Casa();
        Casa casa2=new Casa();
        casa1.establecerColor("Amarillo");
        color="Roja";
        casa2.establecerColor(color);
        String salida = "Los resultados spn \n" +
                casa1.obtenerColor();
        JOptionPane.showMessageDialog(null,salida);
    }
}
