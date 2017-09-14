 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        Start();
    }
    public void Start(){
        while (frontIsClear()){
            move();
            turnLeft();
            if (frontIsClear()){
                Close();
            }
        }
        if (!frontIsClear()){
            turnRight();
            if (!frontIsClear()){
                turnRight();
                move();
                turnLeft();
                if (frontIsClear()){
                    Close();
                }
                else{
                    turnRight();
                    Start();
                }
            }
        }
    }
    public void Close(){
        if (!nextToABeeper()){
            putBeeper();
            turnRight();
            Start();
        }
        else{
            turnOff();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

