package com.game.model;

import com.game.interfaces.Upgrades;

abstract public class Bullets implements Upgrades {
    private int damage;
    private String versionUpgrade;

    public Bullets(int damage, String versionUpgrade) {
        this.damage = damage;
        this.versionUpgrade = versionUpgrade;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getVersionUpgrade() {
        return versionUpgrade;
    }

    public void setVersionUpgrade(String versionUpgrade) {
        this.versionUpgrade = versionUpgrade;
    }
}
