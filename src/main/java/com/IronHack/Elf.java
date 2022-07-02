package com.IronHack;

    public class Elf extends Player {

        private int agility;

        public Elf(String name, int health, int strength, int lives) {
            super(name, health, strength, lives);
        }

        public Elf(String name, int health, int strength, int lives, int agility) {
            super(name, health, strength, lives);
            this.agility = agility;
        }

        public int getAgility() {
            return agility;
        }

        public void setAgility(int agility) {
            this.agility = agility;
        }
    }
