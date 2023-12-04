package Pract16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class N1 extends JFrame {
    private class Mouse implements MouseListener {
        private String mousePlace;
        public Mouse(String place){
            mousePlace = place;
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mousePressed(MouseEvent e) {

        }
        @Override
        public void mouseReleased(MouseEvent e) {

        }
        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать в " + mousePlace);
        }

    }
    private  N1(){
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);

        JLabel center = new JLabel("CENTER", SwingConstants.CENTER);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        center.addMouseListener(new Mouse("ЦАО"));
        add(center, BorderLayout.CENTER);

        JLabel north = new JLabel("NORTH", SwingConstants.CENTER);
        north.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        north.addMouseListener(new Mouse("САО"));
        add(north, BorderLayout.NORTH);

        JLabel east = new JLabel("EAST", SwingConstants.CENTER);
        east.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        east.addMouseListener(new Mouse("ВАО"));
        add(east, BorderLayout.EAST);

        JLabel south = new JLabel("SOUTH", SwingConstants.CENTER);
        south.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        south.addMouseListener(new Mouse("ЮАО"));
        add(south, BorderLayout.SOUTH);

        JLabel west = new JLabel("WEST", SwingConstants.CENTER);
        west.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        west.addMouseListener(new Mouse("ЗАО"));
        add(west, BorderLayout.WEST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new N1();
    }
}
