// File: src/main/GameDemo.java
package main;

// 1. Import the Player class from the 'entities' directory
import Game_Learning.src.entities.player;

public class GameDemo {
    public static void main(String[] args) {
        // 2. Now you can use Player freely!
        player hero = new player("Arthur", 100);
        hero.display();
    }
}