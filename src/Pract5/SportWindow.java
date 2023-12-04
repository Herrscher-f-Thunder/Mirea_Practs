package Pract5;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
public class SportWindow extends JFrame{
    private JPanel panel;
    private JPanel panelText;
    private JButton milan;
    private  JButton madrid;
    private JLabel score;
    private int scoreMadrid = 0;
    private int scoreMilan = 0;
    private JLabel lastScore ;
    private JLabel winner;
    private  String last = "N/A";
    private String winnerName = "DRAW";
    private final int width;
    private final int high;
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if (command.equals("AC Milan")){
                scoreMilan += 1;
                last = "AC Milan";
            }
            else{
                scoreMadrid += 1;
                last = "Real Madrid";
            }
            if (scoreMilan > scoreMadrid)
                winnerName = "AC Milan";
            else if (scoreMilan < scoreMadrid)
                winnerName = "Real Madrid";
            else
                winnerName = "DRAW";
            score.setText("Result: " + scoreMilan + " X " + scoreMadrid + "\n");
            lastScore.setText("Last Score: " + last+ "\n");
            winner.setText("Winner: " + winnerName);
        }
    }
    public SportWindow(String title, int w, int h) {
        super(title);
        width = w;
        high = h;
        setSize(width, high);


        panel = new JPanel();
        milan = new JButton("AC Milan");
        madrid = new JButton("Real Madrid");


        ActionListener listener = new ButtonListener();
        milan.addActionListener(listener);
        madrid.addActionListener(listener);

        score = new JLabel("Result: " + scoreMilan + " X " + scoreMadrid + "\n");
        lastScore = new JLabel("Last Score: " + last+ "\n");
        winner = new JLabel("Winner: " + winnerName);
        panelText = new JPanel();
        panelText.add(score);
        panelText.add(lastScore);
        panelText.add(winner);
        panel.add(milan);
        panel.add(madrid);
        getContentPane().add(BorderLayout.NORTH, panel);
        getContentPane().add(BorderLayout.CENTER, panelText);
    }
}
