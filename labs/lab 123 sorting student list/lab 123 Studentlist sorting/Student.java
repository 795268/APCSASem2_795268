
/**
 * 
 * @Elena Campell 
 * @adding sorting method to student list
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studNumber;
    private double gpa;
    private String firstName;
    private String middleName;
    private String lastName;
    // setters
    public void setStudNumber(int number) {
        studNumber = number;
    }

    public void setgpa (double GPA) {
        gpa = GPA;
    }

    public void setFirstName (String name) {
       firstName = name; 
    }

    public void setMiddleName (String name){
      middleName = name;
    }

    public void  setLastName (String name) {
        lastName = name;
    }
    // getters
    public int getStudNumber() {
        return studNumber;

    }

    public double getgpa () {
        return gpa;
    }
    
    public String getLastName() {
        
      return lastName; 
    }

    public String getfullName () {
        return lastName + ", " + firstName + "" + middleName; 
    }
    
}

