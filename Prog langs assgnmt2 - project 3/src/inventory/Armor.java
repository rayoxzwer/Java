package inventory;

public class Armor extends Equipment{
    int defencePower;
    /**
     * Constructor for Armor class
     * @param defencePower - shows how much defence power this armor has
     */
    public Armor(int defencePower){
        this.defencePower=defencePower;
    }
    private int getDefensePower(){
        return this.defencePower;
    }

    /**
     * Prints the type of the Equipment and its power
     * @return string message
     */
    @Override
    public String toString(){
        return "Armor defense power:" + getDefensePower();
    }
}
