
/**
 * Write a description of class Cells here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Cell
{

    // that will load the neighbors list with all cells that are not occupied (north, east, south, west only)
    boolean occupied; 
    int id;
    ArrayList<Cell> neighbors = new ArrayList<Cell>(); 

    public void loadNeighbors(){
        for (int r = 0; r < neighbors.length ; r ++){
            for (int c = 0 ; c < neighbors[r].length; c ++){
                if ( neighbors [r][c] ==null){
                    neighbors[r][c] = new Cell();     
                }
            }

        }

    }
}
