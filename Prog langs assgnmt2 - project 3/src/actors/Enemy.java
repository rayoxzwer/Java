package actors;

import inventory.Inventory;

public class Enemy extends Actor{
    private Actor actor;
    private Inventory inventory;

    public Enemy(String name, int health, int attackPower, int defensivePower, Inventory inventory) {
        super(name, health, attackPower, defensivePower, inventory);
    }
     
    @Override
    public String toString(){
        return "Enemy: " + inventory;
    }
}
