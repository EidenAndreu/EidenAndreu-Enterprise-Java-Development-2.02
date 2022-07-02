package com.IronHack;

public class Warrior extends Player {

    private int armor;

    public Warrior(String name, int health, int strength, int lives, int armor) {

        super(name, health, strength, lives);

        this.armor = armor;

    }

    public int getArmor() {

        return armor;

    }

    public void setArmor(int armor) {

        this.armor = armor;

    }

    public void attack() {

    }

}
