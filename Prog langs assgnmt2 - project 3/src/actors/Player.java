package actors;

import inventory.Inventory;


public class Player extends Actor{
    private Inventory inventory;
    /**
     * Constructor inherited from Actor
     * @param name
     * @param health
     * @param attackPower
     * @param defensivePower
     * @param inventory
     */

    public Player(String name, int health, int attackPower, int defensivePower, Inventory inventory) {
        super(name, health, attackPower, defensivePower, inventory);
    }

    @Override
    public String toString(){
        return "Player: " + inventory;
    }

}
