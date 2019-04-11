
/**
 * Write a description of class ClimbINfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    private String name; 
    private int time; 
    public ClimbInfo (String peakName, int climbTime) {
     name = peakName; 
     time = climbTime; 
    }
    
    public String getName(){
        return name; 
    }
    
    public int getTime(){
        return time; 
    }
}
