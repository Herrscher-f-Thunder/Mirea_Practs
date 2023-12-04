package Pract5;
import  javax.swing.*;
public class Sport {
    public static void main(String[] args) {
        SportWindow sportWindow = new SportWindow("Match", 300, 300);
        sportWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sportWindow.setVisible(true);
    }
}
