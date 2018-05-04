package com.parser.gui;

import com.parser.JavaToUmlParser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {
    private JPanel panel1;
    private JTextField textField1;
    private JButton chooseFileButton;
    private JHyperlinkLabel JHyperlinkLabel;
    private JTextArea textArea1;
    private JFileChooser jFileChooser = new JFileChooser();

    private final JavaToUmlParser javaToUmlParser = new JavaToUmlParser();

    public GUI() {
        chooseFileButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                jFileChooser.showOpenDialog(panel1);

                super.mouseReleased(e);
            }
        });

        jFileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if (ev.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)){
                    String path = jFileChooser.getSelectedFile().getPath();
                    textField1.setText(path);
                    textArea1.setText(javaToUmlParser.loadAndParse(path));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
