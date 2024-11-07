package inventory;

public class HealthPotion extends Consumable{
    int healingPower;
    /**
     * Constructor of class HealthPotion
     * @param healingPower - shows how much healing power this health potion has
     */
    public HealthPotion(int healingPower){
        this.healingPower = healingPower;
    }
    /**
     * Prints the type of the Consumable and its power
     * @return string message
     */
    @Override
    public String toString(){
        return "Healing power: " + this.healingPower;
    }
}
