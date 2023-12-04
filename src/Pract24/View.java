package Pract24;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private DocumentFactory documentFactory = new DocumentFactory();
    IDocument Document;
    JMenuBar menuBar = new JMenuBar();
    JMenu musicMenu = new JMenu("Music");
    JMenu textMenu = new JMenu("Text");
    JMenu imageMenu = new JMenu("Image");
    JMenuItem newImageMenu = new JMenuItem("New");
    JMenuItem newMusicMenu = new JMenuItem("New");
    JMenuItem newTextMenu = new JMenuItem("New");
    JMenuItem openImageMenu = new JMenuItem("Open");
    JMenuItem openMusicMenu = new JMenuItem("Open");
    JMenuItem openTextMenu = new JMenuItem("Open");
    JMenuItem saveImageMenu = new JMenuItem("Save");
    JMenuItem saveMusicMenu = new JMenuItem("Save");
    JMenuItem saveTextMenu = new JMenuItem("Save");
    JMenuItem exitImageMenu = new JMenuItem("Exit");
    JMenuItem exitMusicMenu = new JMenuItem("Exit");
    JMenuItem exitTextMenu = new JMenuItem("Exit");
    JPanel panel;
    JLabel text;
    String res = "Тип: nan";
    public View(){
        super("Компания ХХХ");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //add(jButton);
        text = new JLabel(res);
        panel = new JPanel();
        panel.add(text);
        getContentPane().add(BorderLayout.CENTER, panel);
        setJMenuBar(menuBar);
        menuBar.add(textMenu);
        menuBar.add(imageMenu);
        menuBar.add(musicMenu);

        textMenu.add(newTextMenu);
        textMenu.add(openTextMenu);
        textMenu.add(saveTextMenu);
        textMenu.add(exitTextMenu);

        imageMenu.add(newImageMenu);
        imageMenu.add(openImageMenu);
        imageMenu.add(saveImageMenu);
        imageMenu.add(exitImageMenu);

        musicMenu.add(newMusicMenu);
        musicMenu.add(openMusicMenu);
        musicMenu.add(saveMusicMenu);
        musicMenu.add(exitMusicMenu);

        newTextMenu.addActionListener(e->{
            res = "Тип: Text - Создание";
            text.setText(res);
            Document = documentFactory.createDocument(new TextDocumentFactory());
        });
        newImageMenu.addActionListener(e->{
            res = "Тип: Image - Создание";
            text.setText(res);
            Document = documentFactory.createDocument(new ImageDocumentFactory());
        });
        newMusicMenu.addActionListener(e->{
            res = "Тип: Music - Создание";
            text.setText(res);
            Document = documentFactory.createDocument(new MusicDocumentFactory());
        });

        openTextMenu.addActionListener(e->{
            res = "Тип: Text - Открытие";
            text.setText(res);
            Document = documentFactory.openDocument(new TextDocumentFactory());
        });
        openImageMenu.addActionListener(e->{
            res = "Тип: Image - Открытие";
            text.setText(res);
            Document = documentFactory.openDocument(new ImageDocumentFactory());
        });
        openMusicMenu.addActionListener(e->{
            res = "Тип: Music - Открытие";
            text.setText(res);
            Document = documentFactory.openDocument(new MusicDocumentFactory());
        });
        setVisible(true);
    }
}
