package Pract5;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class Animation extends JFrame {
    int Height = 800;
    int Length = 1200;
    String animation_images_path = "C:/Users/Арсений/Desktop/Pract5/frames";

    Animation(){
        super("Animation");
        setSize(Length, Height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint (Graphics g2){
        Graphics2D g = (Graphics2D) g2;
        animate(this.animation_images_path, g);
    }
    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        //for (int i = 0; i < 2; i++) {
            for (File file : dir.listFiles()) {
                Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                g.drawImage(frame, 0, 0, Length, Height, this);
                try { Thread.sleep(25);} catch (InterruptedException e) {}
            }
       // }
    }

    public static void main(String[] args) {
        Animation animation = new Animation();
    }
}
