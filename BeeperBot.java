
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while (frontIsClear()){
            collectBeepers();
        }
    }
    public void collectBeepers(){
        faceEast();
        findABeeperColum();
        returnToFloor();
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void findABeeperColum(){
        if (nextToABeeper()){
            pickBeeper();
            turnLeft();
            move();
            while(nextToABeeper()){
                pickBeeper();
                move();
            }
        }
        else{
            move();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void returnToFloor(){
        faceSouth();
        while(frontIsClear()){
            move();
        }
        turnLeft();
    }
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
}