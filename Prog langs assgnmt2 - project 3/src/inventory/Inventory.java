package inventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> inventory;
    /**
     * Constructor of Inventory class, without parameters
     * But creates inside the list of the items
     */
    public Inventory (){
        inventory = new ArrayList<>();
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public void getRandomItems(){
        int min = 1;  
        int max = 10;
        
    }
    public void addInventoryForActor(int attackPower, int defencePower, int destroyPower, int healingPower){
        //adding equipments and consumables
        
    }

    /**
     * @param attackPower
     * @param defencePower
     * @param destroyPower
     * @param healingPower
     */
    public void addInventoryForRoom(int attackPower, int defencePower, int destroyPower, int healingPower){
        //adding equipments and consumables sometimes several times using Random
       
    }

   /**
     * Prints each item from the list of items
     * @return string message
     */
    @Override
    public String toString(){
        return "Inventory: " + getInventory();
    }

}
