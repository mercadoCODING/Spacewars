package com.game.actions;

import com.game.entities.WeakShip;
import com.game.sprite.WeakShipUnit;
import com.game.utils.RandomUtil;

import java.util.ArrayList;
import java.util.List;


public class EnemySpawner {
    private List<WeakShipUnit> weakShipEnemy;
    private int spawnProbability;

    public EnemySpawner(int spawnProbability){
        this.weakShipEnemy = new ArrayList<>();
        this.spawnProbability = spawnProbability;
    }

    public void spawnEnemy(int panelWidth){
        if (panelWidth > 50 && RandomUtil.shouldSpawn(spawnProbability)) {
            int startX = RandomUtil.getRandomInt(panelWidth - 50);
            WeakShipUnit newEnemy = new WeakShipUnit("src/com/game/res/spritesmodel/weakShip_Sprite.png", startX, 0);
            weakShipEnemy.add(newEnemy);
            System.out.println("Enemy spawned at X: " + startX);
        } else if (panelWidth <= 50) {
            System.out.println("Panel width too small to spawn enemies.");
        }
    }

    public List<WeakShipUnit> getWeakShipEnemies() {
        return weakShipEnemy;
    }
}
