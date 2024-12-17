package br.com.olamundo;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setContentPane(new OlaMundo().panel);
        f.setSize(250,300);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
