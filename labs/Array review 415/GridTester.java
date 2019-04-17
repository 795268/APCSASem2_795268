
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridTester
{
    /*
    Create a 2D array of Cell objects with the number of rows and
    columns specified by the input parameters.
    Write a GridTester  method : 
    public void loadOccupied() that will randomly set 30% of the c
    ell's occupied property to true and the rest to false;

     */

    public GridTester (int rows, int columns){

        Cell[][] cells = new Cell[rows][columns];

    }

    public void loadOccupied( Cell[][] cells){

        int sum = 0; 
        for (int r = 0; r < cells.length ; r ++){
            for (int c = 0 ; c < cells[r].length; c ++){
                sum++; // counts the total number of cells 
            }
        }

        double setTrue = sum * 0.3 ; 
        for (int r = 0; r < cells.length ; r ++){
            for (int c = 0 ; c < cells[r].length; c ++){
                if (cells[r][c] != null  ){
                    // i dont know lol
                }
            }

        }}}
