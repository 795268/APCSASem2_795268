
/**
 * Write a description of class lan109 here.
 *
 *Elena Campell
 *Same as lab 114, but with arraylists instead of arrays
 * 
 */
import java.util.ArrayList; 
public class sort
{
    public static void mySort(){
        int small = 0; //int to find the smallest unsorted values
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        nums.add(4);
        nums.add(7);
        nums.add(29);
        nums.add(1);
        nums.add(3);
        ArrayList<Integer> order = new ArrayList <Integer> ();
        int i  = 0; 
        while(i< nums.size()){ //keeps track of length of sorted array
            for (int x = 0; x<nums.size(); x++){ //traverses nums

                if (nums.get(i) == small){ // if the value = small
                    order.get(i) =small; //assign that value to order
                    i++; //increment to keep track of length of sorted array
                }

            }
            small ++; // increment small - looking for next biggest int
        }
        for (int j = 0; j< order.size(); j++){ // loop to print all values of sorted array
            System.out.println(order.get(j)); 
        }
    }

    public static void bubbleSort(){
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        int temp;
        for (int j=nums.size()-1; j >0; j--){
            for (int i = 0; i< j; i++){
                if (nums.get(i) > nums.get(i+1) ){ 
                    temp = nums.get(i);
                    nums.get(i) = nums.get(i+1); 
                    nums.get(i+1) = temp; 
                }
            }
            for (int x = 0; x< nums.size(); x++){ // loop to print all values of sorted array
                System.out.print(nums.get(x)); 
            }
            System.out.print("\n");
        }
        // for (int x = 0; x< nums.size(); x++){ // loop to print all values of sorted array
        // System.out.print(nums[x]); 
        // }
        //System.out.print("\n");
    }

    public static void selectSort(){
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        int temp; 
        for (int i  = 0; i < nums.size() -1; i++){ //keeps track of length of sorted array
            int small = i; //int to find the smallest unsorted values
            for (int j = i+1; j <nums.size(); j++){ //traverses nums

                if (nums.get(j) < nums.get(small)){ // if the value = small
                    small =j; 
                }

            }
            temp = nums.get(small);
            nums.get(small) = nums.get(i); 
            nums.get(i) = temp; 
        }
        for (int k = 0; k< nums.size(); k++){ // loop to print all values of sorted array
            System.out.println(nums.get(i)); 
        }
    }

    public static void insertSort() {
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        int temp;
        int swap = 0; 
        int compare =0; 
        for (int i = 1; i < nums.size(); i++){
            for (int j = i; j > 0; j--){
                if (nums.get(j) < nums.get(j-1)) { // if the current value is less, swap
                    temp = nums.get(j);
                    nums.get(j) = nums.get(j-1); 
                    nums.get(j-1) = temp; 
                    swap++;
                }
                compare++;
            }
        }
        for (int k = 0; k< nums.size(); k++){ // loop to print all values of sorted array
            System.out.println(nums.get(k)); 
        }
        System.out.println("swap:" + swap); 
        System.out.print("compare:" + compare); 
    }

}
