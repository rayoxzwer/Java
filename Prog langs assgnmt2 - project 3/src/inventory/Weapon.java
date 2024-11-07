package inventory;

public class Weapon extends Equipment {

    int attackPower;
    /**
     * Constructor for Weapon class 
     * @param attackPower
     */
    public Weapon(int attackPower){
        this.attackPower = attackPower;
    }
    
    private int getWeaponPower(){
        return this.attackPower;
    }

    /**
     * Prints the type of the Equipment and its power
     * @return string message
     */
    @Override
    public String toString(){
        return "weapon attack power: " + getWeaponPower();
    }

}
