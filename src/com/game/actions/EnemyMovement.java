package com.game.actions;
import com.game.sprite.WeakShipUnit;
import java.util.List;

public class EnemyMovement {
    private List<WeakShipUnit> enemies;

    public EnemyMovement(List<WeakShipUnit> enemies) {
        this.enemies = enemies;
    }

    public void moveEnemies() {
        for (WeakShipUnit enemy : enemies) {
            enemy.move();
        }
    }
    public void removeOffScreenEnemies(int panelHeight) {
        // Remove enemies that have moved off the screen
        enemies.removeIf(enemy -> enemy.getY() > panelHeight);
    }
}
