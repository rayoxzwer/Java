import game.GameMap;
import actors.Player;

public class Game {
    private GameMap gameMap;
    private Player player;

    /**
     * Constructor of class Game with 2 parameters.
     *
     * @param width - width of the GameMap, i.e. size of the 2D array
     * @param height - height of the GameMap, i.e. size of the 2D array
     * @param maxNumofEnemies - maximum number of enemies allowed in this game
     * @param player - is the main actor of the game
     */
    public Game(int width, int height, int maxNumofEnemies, Player player){
        gameMap = new GameMap(width, height, maxNumofEnemies);
        this.player = player;
    }

    public void beginGame(){
        gameMap.fillRooms(); //it fills with inventory and enemies
        gameMap.printMap();
    }

}
