package actors;

import inventory.Inventory;

public abstract class Actor {
    
    String name;
    int health;
    int attackPower;
    int defensivePower;
    Inventory inventory;

    
    Actor(String name,int health, int attackPower, int defensivePower, Inventory inventory){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensivePower = defensivePower;
        this.inventory = inventory;
    }

}
