
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*; 
public class GridTester
{
    /*
    Create a 2D array of Cell objects with the number of rows and
    columns specified by the input parameters.
    Write a GridTester  method : 
    public void loadOccupied() that will randomly set 30% of the c
    ell's occupied property to true and the rest to false;

     */
    public Cell[][] cells; 
    public GridTester (int rows, int columns){

        cells = new Cell[rows][columns];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell ();

            }
        }
    }

    public void loadOccupied( Cell[][] cells){

        for (int r = 0; r < cells.length ; r ++){
            for (int c = 0 ; c < cells[r].length; c ++){
                if (Math.random() > .7  ){
                    cells[r][c].setOccupied(true); 
                }
                else{
                    cells[r][c].setOccupied(false); 
                }

            }
        }
    }

    public void loadNeighbors(){
        ArrayList<Cell> neighbors = new ArrayList<Cell> ();

        for (int r = 0; r < cells.length ; r ++){
            for (int c = 0 ; c < cells[r].length; c ++){
                if (r != 0) {
                   // neighbors = neighbors.add(r-1,c);
                }
                if (r != cells.length-1) {
                  //  neighbors = neighbors.add(r+1,c);
                }
                if (c != 0) {
                    //neighbors = neighbors.add(r,c-1);
                }
                if (c != cells[0].length-1){
                   // neighbors = neighbors.add(r,c+1);
                }
            }
        }

    }

}

