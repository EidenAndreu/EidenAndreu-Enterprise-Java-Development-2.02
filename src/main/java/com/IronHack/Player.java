package com.IronHack;

public class Player {

    private static final int MAX_HEALTH = 100;
    private String name;

    protected int health;

    protected int strength;

    private int lives;
    private Player player;

    public Player(String name, int health, int strength, int lives) {

        this.name = name;

        this.health = health;

        this.strength = strength;

        this.lives = lives;

    }

    public Player(int i, int health) {
    }

    public String getName() {

        return name;

    }

    public int getHealth() {

        return health;

    }

    public int getStrength() {

        return strength;

    }

    public int getLives() {

        return lives;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setHealth(int health) {

        this.health = health;

    }

    public void setStrength(int strength) {

        this.strength = strength;

    }

    public void setLives(int lives) {

        this.lives = lives;

    }
    public void decrementLives() {
        player.lives--;
        player.health = player.MAX_HEALTH;
    }

    public void attack(Player playerB) {
    }

}


