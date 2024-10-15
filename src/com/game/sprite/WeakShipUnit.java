package com.game.sprite;

import com.game.graphics.EnemySprite;

import java.awt.*;

public class WeakShipUnit extends EnemySprite {

    public WeakShipUnit(String imagePath, int startX, int startY) {
        super(imagePath, startX, startY);
    }
    @Override
    public void draw(Graphics g) {
        if(getImage() != null){
            int scaledWidth = getWidth() / 6;
            int scaledHeight = getHeight() / 6;
            g.drawImage(getImage(), getX(), getY(), scaledWidth, scaledHeight, null);
        }else{
            g.setColor(Color.RED);
            g.fillRect(getX(), getY(), getWidth(), getHeight());
        }
    }

    public void move() {
        // Moves the enemy down the screen
        setY(getY() + 2);
    }
}
