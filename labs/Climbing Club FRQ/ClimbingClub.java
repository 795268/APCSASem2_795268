
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class ClimbingClub
{
    private List<ClimbInfo> climbList; 

    public ClimbingClub() {
        climbList = new ArrayList <ClimbInfo>();
    }

    public void addClimb (String peakName, int climbTime){
        int i = 0; 

        while ( i < climbList.size() && peakName.compareTo (climbList.get(i).getName())>0){
            i++;
        }
        climbList.add(new ClimbInfo (peakName, climbTime)); 

    }

    public int distinctPeakNames()
    { 
        if (climbList.size() == 0)
        {
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++)
        {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0)
            {
                numNames++;
                prevName = currName;
            }
        }
        return numNames; 
    } 

    /* part c : 
     * i - no
     * ii - yes
     */
}
