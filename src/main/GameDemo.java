// File: src/main/GameDemo.java
package main;

// 1. Import the Player class from the 'entities' directory
import entities.Player;

public class GameDemo {
    public static void main(String[] args) {
        // 2. Now you can use Player freely!
        Player hero = new Player("Arthur", 100);
        hero.display();
    }
}