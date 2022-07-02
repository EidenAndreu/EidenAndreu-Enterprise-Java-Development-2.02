package com.IronHack;

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player("Hola", 20,40,15);
        Player playerB = new Player("Adeu", 20,40,20);

        playerA.attack(playerB);
        System.out.println(playerB.getHealth());
    }
}