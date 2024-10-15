package com.game.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.game.actions.EnemyMovement;
import com.game.actions.EnemySpawner;
import com.game.actions.Movement;
import com.game.sprite.PlayerUnit;
import com.game.sprite.WeakShipUnit;
import com.game.utils.ImageUtil;
public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private PlayerUnit playerUnit;
    private Image backgroundImage;

    private int backgroundY;
    private EnemySpawner enemySpawner;
    private EnemyMovement enemyMovement;


    public GamePanel(){
        backgroundImage = ImageUtil.loadImage("src/com/game/res/background/bg.jpg");
        timer = new Timer(15,this);
        timer.start();
        addKeyListener(this);
        this.enemySpawner = new EnemySpawner(20);
        this.enemyMovement = new EnemyMovement(enemySpawner.getWeakShipEnemies());

        playerUnit = new PlayerUnit("src/com/game/res/spritesmodel/playerShip_sprite.png", 250, 400);
        Movement.initialize(playerUnit);


        backgroundY = 0;
        System.out.println("Current enemies: " + enemySpawner.getWeakShipEnemies().size());

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, backgroundY, getWidth(), getHeight(), null);
            g.drawImage(backgroundImage, 0, backgroundY - getHeight(), getWidth(), getHeight(), null);
        } else {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());
        }

        for (WeakShipUnit enemy : enemySpawner.getWeakShipEnemies()) {
            enemy.draw(g);

        }

        playerUnit.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int BACKGROUND_SPEED = 1;
        backgroundY += BACKGROUND_SPEED;
        if (backgroundY >= getHeight()) {
            backgroundY = 0;
        }

        enemySpawner.spawnEnemy(getWidth());
        enemyMovement.moveEnemies();
        enemyMovement.removeOffScreenEnemies(getHeight());


        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String key = KeyEvent.getKeyText(e.getKeyCode()).toLowerCase();
        Movement.keyMovement(key);
        System.out.println("You pressed: " + key);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
