package game;

import inventory.Inventory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameMap {
    private int row, column;
    private int maxNumEnemies;
    private Room newGame[][];
    List<Integer> arr_row = new ArrayList<>();
    List<Integer> arr_column = new ArrayList<>();
    
    Room[][] cell;
    
    public GameMap (int i, int j) {
        this.row = i;
        this.column = j;
    }
    private void forPrintMap () {
        int n = row;
        int m = column;
        cell = new Room[n][m];
        int i = 0;
        while(i != n) {
            for (int j = 0; j < m; j++) {
                cell[i][j] = new Room(i, j);
            }
            i++;
        }
    }
    
    public GameMap(int width,int height,int maxNumEnemies){
        width = row;
        height = column;
        this.maxNumEnemies=maxNumEnemies;
        this.newGame=new Room[width][height];
    }
    
    public void getRandomArray(){
        Random rnd = new Random();
        int randomsize = rnd.nextInt(20)+1;
        
        for(int i = 0; i < randomsize; i++){ 
            arr_row.add(rnd.nextInt(20));
            arr_column.add(rnd.nextInt(20));
        }  
    }
    
    public void fillRooms(){
        for(int i=0;i < newGame.length;i++){
            for(int j=0;j < newGame[i].length;j++){
                //fills the room with players and items
            }
        }

    }
    
    public void printMap () {
        forPrintMap();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //print players and room
            }
            System.out.println();
        }
    }
}
