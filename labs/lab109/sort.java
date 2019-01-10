
/**
 * Write a description of class lan109 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sort
{
    public static void sort(){
        int small = 0; 
        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1};
        int order[] = new int [nums.length];
        int i  = 0;
        while(i< nums.length){
            for (int x = 0; x<nums.length; x++){

                if (nums[x] == small){
                    order[i] =small;
                    i++;
                }

            }
            small ++; 
        }
        for (int j = 0; j< order.length; j++){
        System.out.println(order[j]); 
    }
}
}
