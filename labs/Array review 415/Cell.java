
/**
 * Write a description of class Cells here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Cell
{

    boolean occupied; 
    int id;
    ArrayList<Cell> neighbors;  
    // that will load the neighbors list with all cells that are not occupied (north, east, south, west only)
    public Cell(){
        neighbors = new ArrayList<Cell>();
        occupied = false; 
        id = 0; 
    }
     
    
    public boolean setOccupied (boolean occupied){
        return occupied; 
    }

    
}
