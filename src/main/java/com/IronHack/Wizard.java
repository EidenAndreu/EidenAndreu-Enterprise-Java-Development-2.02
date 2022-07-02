package com.IronHack;

public class Wizard extends Player {

    private int mana;

    public Wizard(String name, int health, int strength, int lives) {
        super(name, health, strength, lives);
    }

    public Wizard(String name, int health, int strength, int lives, int mana) {
        super(name, health, strength, lives);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}