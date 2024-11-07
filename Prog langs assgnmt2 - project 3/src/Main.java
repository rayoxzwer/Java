import actors.Player;
import inventory.Inventory;

public class Main {

    public static void main(String[] args) {
        //begin game
        Player rayox = new Player("Rayox", 10, 10, 10, new Inventory());
        Game game1 = new Game(10, 10, 10, rayox);
        game1.beginGame();
    }
}
