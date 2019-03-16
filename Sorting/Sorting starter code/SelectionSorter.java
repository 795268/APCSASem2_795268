
/**
 * Write a description of class SelectionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSorter extends Sorter
{public  void sort(int [] a){

        for (int i  = 0; i < a.length -1; i++){ //keeps track of length of sorted array
            int small = i; //int to find the smallest unsorted values
            for (int j = i+1; j <a.length; j++){ //traverses nums

                if (less (j, small)){
                    small = j; 

                }

            }
            swap (a , i , small); 
        }
        
        for (int k = 0; k<a.length; k++){
            System.out.println(a[k]); 
        }
    }
}

