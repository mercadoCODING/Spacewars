package com.game.model;

import com.game.interfaces.Skills;
import com.game.interfaces.Upgrades;

abstract public class Power implements Skills, Upgrades {
    private String skillName;
    private int skillTimer;
    private int coolDown;

    public Power(String skillName, int skillTimer, int coolDown) {
        this.skillName = skillName;
        this.skillTimer = skillTimer;
        this.coolDown = coolDown;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillTimer() {
        return skillTimer;
    }

    public void setSkillTimer(int skillTimer) {
        this.skillTimer = skillTimer;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }
}
