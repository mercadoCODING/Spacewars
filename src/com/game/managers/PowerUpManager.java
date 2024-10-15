package com.game.managers;

import com.game.model.Power;

public class PowerUpManager extends Power {
    public PowerUpManager(String skillName, int skillTimer, int coolDown) {
        super(skillName, skillTimer, coolDown);
    }
    @Override
    public void useSKill(String name) {

    }

    @Override
    public void upgradeKit(String name) {

    }
}
