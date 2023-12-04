package Pract15;

import javax.swing.*;
import java.awt.*;

public class N4 extends JFrame{
    GridLayout gridLayout = new GridLayout(4, 4, 5, 12);
    JPanel panel = new JPanel(gridLayout);
    private N4(){
        super("Calculator");
        setSize(270, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new TextArea(1, 32));
        String buttons = "789/456*123-0.=+";
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                panel.add(new JButton(String.valueOf(buttons.charAt(j * 4 + i))));
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new N4();
    }
}
