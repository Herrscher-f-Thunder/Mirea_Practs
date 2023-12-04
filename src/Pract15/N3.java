package Pract15;

import javax.swing.*;
import java.awt.*;

public class N3 extends JFrame {
    private GridLayout gridLayout = new GridLayout(1, 2, 5, 12);
    private JPanel panel = new JPanel(gridLayout);
    private JMenuBar menuBar = new JMenuBar();
    private JButton button1 = new JButton("Button1");
    private JButton button2 = new JButton("Button2");
    private JTextArea textArea = new JTextArea("This is the area you can write text");

    private JMenu FileMenu(){
        JMenu file  = new JMenu("File");
        JMenu save  = new JMenu("Save");
        file.add(save);
        JMenu exit  = new JMenu("Exit");
        file.add(exit);
        return file;
    }
    private JMenu EditMenu(){
        JMenu edit  = new JMenu("Edit");
        JMenu copy  = new JMenu("Copy");
        edit.add(copy);
        JMenu paste  = new JMenu("Paste");
        edit.add(paste);
        JMenu cut  = new JMenu("Cut");
        edit.add(cut);
        return edit;
    }
    private JMenu HelpMenu(){
        JMenu help = new JMenu("Help");
        return help;
    }

    private N3(){
        super("Menu");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        menuBar.add(FileMenu());
        menuBar.add(EditMenu());
        menuBar.add(HelpMenu());
        setJMenuBar(menuBar);
        panel.add(button1);
        panel.add(button2);
        add(panel, BorderLayout.CENTER);
        add(textArea);
        setVisible(true);
    }
    public static void main(String[] args) {
        new N3();
    }
}
