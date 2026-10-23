package Game_Learning.src.entities;


public class player {
    public String name;
    public int health;

    public player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Player: " + name + " (HP: " + health + ")");
    }
}