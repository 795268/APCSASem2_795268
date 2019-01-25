
/**
 * Write a description of class StudList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class StudList
{
    ArrayList<Student> studList = new ArrayList<Student>(); 
    // declares and initializes an array list of student objects 
    public void addStudentToList (String name, int number, double gpa) { // method for adding a new student to list 
        Student s = new Student(); 
        s.setFirstName(name);
        s.setMiddleName(name);
        s.setLastName(name); 
        s.setStudNumber(number);
        s.setgpa(gpa);
        studList.add(s);

    }

    public  boolean deleteStudent(String last){
        boolean deleted = false;
        for(int i = 0; i < studList.size(); i++){
            if(studList.get(i).getLastName().equals(last)){
                studList.remove(i); //if the last name searched is the same as i, get rid of that student
                deleted = true; //if it is deleted then the action is complete
            }
        }

        return deleted;
    }//if the student was or was not deleted (true if yes, false if no)

    public boolean editStudentList(int number, String name, double gpa){
        boolean edited = false; //starts unedited
        for (int i = 0; i < studList.size(); i++){
            if(studList.get(i).getStudNumber() == number){
                Student student = new Student();// creates new student object to edit
                student.setFirstName(name); //gives new student first last and middle name, gpa and number
                student.setMiddleName(name);
                student.setLastName(name);
                student.setgpa(gpa);
                studList.set(i, student);
                edited = true; //once edited boolen equals true
            }
        }
        return edited;
    }

    public void clearList(){
        studList.clear(); //uses ArrayList method clear() to get rid of all objects in arraylist
    }

    public void printStudentList() { // method for printing student list 
        if(studList.size() > 0){
            for( int i = 0; i< studList.size(); i ++) {
                System.out.println (i+1 + ". Name " + studList.get(i).getfullName() + ", Student Number: " + studList.get(i).getStudNumber() + ", GPA: " + studList.get(i).getgpa());
            }
        }else{
            System.out.println("Your list is empty"); 
        }
    }
    
    public Student printStudent(int number, String last, String name, double gpa) {
        for(int i = 0; i < studList.size(); i++) {
            if(number != 0) {
                if(studList.get(i).getStudNumber() == number) {
                    return studList.get(i);
                }
            } else {
                if(studList.get(i).getLastName() == last) {
                    return studList.get(i);
                }
            }
        }
        return null;
    }

    public void parseUserInput (Student s, String name){
        int comma = name.indexOf(","); 
        int space = name.indexOf (" "); 
        if (comma == -1 && findSpace(name)==2){ // if no comma and two spaces -> First middle last
            s.setFirstName(name.substring(0,space)); 
            s.setMiddleName(null); 
            s.setLastName(name.substring(name.indexOf(" ", space +1)+1)); 
        }else if (comma != -1 && findSpace(name)==1){ // if comma and one space -> last, first
            s.setFirstName(name.substring(comma +2, name.indexOf (" ", comma+ 2))); 
            s.setMiddleName(name.substring(name.indexOf(" ", comma+2)+1)); 
            s.setLastName(name.substring(0, comma)); 

        } else if (comma != -1 && findSpace(name)==2 || findSpace(name)==1) { // if comma and two spaces -> last, first middl e
            s.setFirstName(name.substring(0, space)); 
            s.setMiddleName(name.substring(space +1, name.indexOf(" ", space +1))); 
            s.setLastName(name.substring(name.indexOf(" ", space +1)+1)); 

        } else{
            s.setFirstName(null); 
            s.setMiddleName(null); 
            s.setLastName(null);
        }
    }

    public int findSpace (String name){ // method for finding where the space in a method is 
        String changeName = name.toLowerCase();
        int count = 0; 
        for (int i = 0 ; i < (changeName.length() -1); i++){
            if (changeName.substring(i, i+1).equals(" ")) {

                count ++; 
            }
        }if (changeName.substring(changeName.length() - 1).equals(changeName)){
            count++;
        }

        return count; 
    }
    
     public void sortList() {
     if (studList.size() ==0){
         System.out.print ("List has not students");
        }else {
            mergeSort(studList, studList.size());
            System.out.println("Students sorted by number:");
            printStudentList();
        }
    }
    
    public static void mergeSort(ArrayList<Student> a , int n) {
        if (n < 2) { //  Base Case
            return;
        }
        int mid = n / 2;
        ArrayList<Student> l = new ArrayList<Student>();
        ArrayList<Student> r = new ArrayList<Student>();
        for (int i = 0; i < mid; i++) {
         l.add(a.get(i)); 
        }
        for (int i = mid; i < n; i++) {
            r.add(a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }

   
    public static void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).getStudNumber()<= r.get(j).getStudNumber()) {
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
    } 
}

