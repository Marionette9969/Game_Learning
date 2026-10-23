package entities;


public class Player {
    public String name;
    public int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Player: " + name + " (HP: " + health + ")");
    }
}