package com.game.ui;


import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    private GamePanel gamePanel;
    private Hud hud;

    public Game(){
        setTitle("Space Wars");
        setSize(500,850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);

        hud = new Hud();
        add(hud,BorderLayout.NORTH);

        gamePanel.setFocusable(true);
        gamePanel.requestFocusInWindow();

        setVisible(true);

    }

}
