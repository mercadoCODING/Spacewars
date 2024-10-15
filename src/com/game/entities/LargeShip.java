package com.game.entities;

import com.game.model.EnemyShip;

public class LargeShip extends EnemyShip {

    public LargeShip(int hp, int dmg, String shipName,int speed) {
        super(250, 20, "Battlecruiser",speed);
    }
}
