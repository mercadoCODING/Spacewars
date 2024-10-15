package com.game.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageUtil {
    public static Image loadImage(String imagePath) {
        Image image = null;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: Could not load image from " + imagePath);
        }
        return image;
    }
}
