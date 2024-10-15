package com.game.graphics;

import com.game.interfaces.GraphicInterface;
import com.game.utils.ImageUtil;

import java.awt.*;

abstract public class EnemySprite implements GraphicInterface {
    private int x;
    private int y;
    private int width,height;
    private int speed;
    private Image image;

    public EnemySprite(String imagePath,int startX,int startY){
        this.x = startX;
        this.y = startY;

        image = ImageUtil.loadImage(imagePath);
        if(image!= null){
            width = image.getWidth(null);
            height = image.getHeight(null);
        }else{
            width = 40;
            height = 40;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Image getImage() {
        return image;
    }

}
