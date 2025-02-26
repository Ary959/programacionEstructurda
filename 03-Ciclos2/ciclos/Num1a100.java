import javax.swing.*;

public class Num1a100 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {

               JOptionPane.showMessageDialog(null,i + " ");
            }
        }
    }
}