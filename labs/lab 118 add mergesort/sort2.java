
/**
 * Write a description of class sort2 here.
 *
 *Elena Campell
 *adding merge sort with arraylists 
 */
import java.util.ArrayList;
public class sort2
{
    public static void mySort(){
        int small = 0; //int to find the smallest unsorted values
        int swap = 0; 
        int compare = 0; 
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        nums.add(9);
        nums.add(1);
        nums.add(7);
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(0);

        ArrayList<Integer> order = new ArrayList <Integer> ();
        double time = System.nanoTime();

        for (int i = 0; i< nums.size(); i++){ //keeps track of length of sorted array
            for (int x = 0; x<nums.size(); x++){ //traverses nums

                if (nums.get(i) == small){ // if the value = small
                    small = order.get(i); //assign that value to order
                    swap++;
                }
                compare ++; 

            }
            small ++; // increment small - looking for next biggest int
        }
        double timeEnd = System.nanoTime();
        for (int j = 0; j< order.size(); j++){ // loop to print all values of sorted array
            System.out.println(order.get(j)); 
        }
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }

    public static void bubbleSort(){
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        nums.add(9);
        nums.add(1);
        nums.add(7);
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(0);
        int temp;
        int swap = 0; 
        int compare = 0; 
        double time = System.nanoTime();
        for (int j=nums.size()-1; j >0; j--){
            for (int i = 0; i< j; i++){
                if (nums.get(i) > nums.get(i+1) ){ 
                    temp = nums.get(i);
                    nums.set(i, nums.get(i+1));
                    nums.set(i+1,temp); //uses holding cell of value at i
                    swap++;
                }
                compare++; 
            }

        }
        double timeEnd = System.nanoTime();
        for (int x = 0; x< nums.size(); x++){ // loop to print all values of sorted array
            System.out.print(nums.get(x)); 
        }
        System.out.println("\n");
        System.out.println("swap:" + swap);
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 

    }

    public static void selectSort(){
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        nums.add(9);
        nums.add(1);
        nums.add(7);
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(0);
        int temp; 
        int swap = 0; 
        int compare = 0; 
        double time = System.nanoTime();
        for (int i  = 0; i < nums.size() -1; i++){ //keeps track of length of sorted array
            int small = i; //int to find the smallest unsorted values
            for (int j = i+1; j <nums.size(); j++){ //traverses nums

                if (nums.get(j) < nums.get(small)){ // if the value = small
                    small =j; 
                }
                compare++;

            }
            temp = nums.get(small);
            nums.set(small, nums.get(i));
            nums.set(i,temp); //uses holding cell of value at i
            swap++;

        }
        double timeEnd = System.nanoTime();
        for (int k = 0; k< nums.size(); k++){ // loop to print all values of sorted array
            System.out.print(nums.get(k)); 
        }
        System.out.println("\n");
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }

    public static void insertSort() {
        ArrayList<Integer> nums = new ArrayList <Integer> (); 
        nums.add(9);
        nums.add(1);
        nums.add(7);
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(0);
        int temp;
        int swap = 0; 
        int compare =0; 
        double time = System.nanoTime();
        for (int i = 1; i < nums.size(); i++){ 
            for (int j = i; j > 0; j--){
                if (nums.get(j) < nums.get(j-1)) { // if the current value is less, swap
                    temp = nums.get(j);
                    nums.set(j, nums.get(j-1));
                    nums.set(j-1, temp);
                    swap++;
                }
                compare++;
            }
        }
        double timeEnd = System.nanoTime();
        for (int k = 0; k< nums.size(); k++){ // loop to print all values of sorted array
            System.out.print(nums.get(k)); 
        }
        System.out.println("\n");
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }
    
    public static void mergeSort(ArrayList<Integer> a, int n) {
        if (n < 2) { //  Base Case
            return;
        }
        int mid = n / 2;
        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < mid; i++) {
         l.set(i,a.get(i)); 
         
        }
        for (int i = mid; i < n; i++) {
            r.set((i-mid), a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }

    
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> l, ArrayList<Integer> r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i) <= r.get(j)) {
               a.set(k++, l.get(i++));
            }else {
                a.set(k++, r.get(j++)); 
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++)); 
        }

        for (int x =0; x< a.size(); x ++){
            System.out.println(a.get(x));
        }
    } 
    
}
