package com.MCKerim;

import javax.swing.*;

public class GameManager extends JFrame {

    public GameManager(){
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
    }
}
