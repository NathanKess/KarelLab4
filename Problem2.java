
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        TraceWall();
    }
    public void TraceWall(){
        turnLeft();
        if(!frontIsClear()){
            turnRight();
            if(frontIsClear()){
                putBeeper();
                move();
                TraceWall();
            }
            else if(!frontIsClear()){
                if(!nextToABeeper()){
                    turnRight();
                    putBeeper();
                    move();
                    TraceWall();
                }
            }
        }
        else if(frontIsClear()){
            putBeeper();
            move();
            if(frontIsClear()){
                putBeeper();
                turnLeft();
                move();
                TraceWall();
            }
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

