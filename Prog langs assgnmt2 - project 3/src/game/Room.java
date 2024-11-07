package game;

import java.util.ArrayList;

import actors.Actor;
import inventory.Inventory;

public class Room {
    private ArrayList<Actor> Actors;
    private Inventory inventory;
    private boolean isFilled;
    private int enemyCounter;

    public int row, column;

    Room (int i, int j) {
        this.row = i;
        this.column = j;
    }

    public Room(Inventory inventory){
        this.inventory=inventory;

    }


    public boolean isFilled(){
        return isFilled;
    }

    public void addActor(){

    }

    public void addInventory(){

    }


    public int getEnemyCounter(){
        return enemyCounter;
    }



    /**
     * Prints the all items int this room
     * @return string message
     */
    @Override
    public String toString () {
        return "room: " + row + " " + column + " ";
    }


}
