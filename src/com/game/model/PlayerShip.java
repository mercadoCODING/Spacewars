package com.game.model;

abstract public class PlayerShip {
    private String name;
    private int hp;
    private int lives;
    public PlayerShip(String name, int hp,int lives) {
        this.name = name;
        this.hp = hp;
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
