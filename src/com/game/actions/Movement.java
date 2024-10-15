package com.game.actions;
import com.game.sprite.PlayerUnit;

public class Movement {

    private static PlayerUnit playerUnit;

    public static void initialize(PlayerUnit playerUnitInstance) {
        playerUnit = playerUnitInstance;
    }
    public static void keyMovement(String key) {
        switch (key.toLowerCase()) {
            case "w":
                playerUnit.move(0,-5);
                break;

            case "a":
                playerUnit.move(-5,0);
                break;

            case "s":
                playerUnit.move(0,5);
                break;

            case"d":
                playerUnit.move(5,0);
                break;

            default:
                break;
        }
    }
}
