package entities;

public class Enemy {
    
    public String name;
    public int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Player: " + name + " (HP: " + health + ")");
    }

}
