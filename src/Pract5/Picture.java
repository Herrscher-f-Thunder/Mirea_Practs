package Pract5;

import javax.swing.*;

public class Picture extends JFrame {

    public Picture(String s){
        super(s);
    }

    public static void main(String[] args) {
        Picture frame = new Picture("Picture");
        ImageIcon img = new ImageIcon("C:/Users/Арсений/Desktop/Pract5/CMHurmaidlY.jpg");
        JPanel panel = new JPanel();
        panel.add(new JLabel(img));
        frame.add(panel);
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
