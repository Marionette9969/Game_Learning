package Game_Learning.src.entities;

public class enemy {
    
    public String name;
    public int health;

    public enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Player: " + name + " (HP: " + health + ")");
    }

}
