package inventory;

public class Poison extends Consumable{
    int destroyPower;
    /**
     * Constructor of class Poison
     * @param destroyPower - shows how much destroy power this posion has
     */
    public Poison(int destroyPower){
        this.destroyPower = destroyPower;
    }
    /**
     * Prints the type of the Consumable and its power
     * @return string message
     */
    @Override
    public String toString(){
        return "Poison destroy power: " + this.destroyPower;
    }
}
