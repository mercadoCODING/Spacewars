package com.game.ui;

import javax.swing.*;
import java.awt.*;

public class Hud extends JPanel {
    public Hud(){
        setBackground(Color.DARK_GRAY);
        setPreferredSize(new Dimension(800,30));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawString("Score:" , 10, 20);
        g.drawString("Health: ", 100,20);
        g.drawString("Lives: ", 300 , 20);
    }
}
