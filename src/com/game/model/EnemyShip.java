package com.game.model;

abstract public class EnemyShip {
    private int hp;
    private int dmg;
    private String shipName;
    private int speed;

    public EnemyShip(int hp, int dmg, String shipName,int speed) {
        this.hp = hp;
        this.dmg = dmg;
        this.shipName = shipName;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
