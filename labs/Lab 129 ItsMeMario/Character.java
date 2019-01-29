
/**
 *lab 129 
 *super-sub class relationships
 * @elena campell
 */
public class Character
{
    String catchPhrase; 
    int speed; 

    public Character (String cp, int sp) {
        catchPhrase = cp;
        speed = sp;
    }

    public void setSpeed(int sp) {
        speed = sp; 
    }

    public void setCatchphrase (String cp){
       catchPhrase = cp; 
    }

    public int getSpeed (){
        return speed;   
    }

    public String getCatchphrase(){
        return catchPhrase;
    }
}
