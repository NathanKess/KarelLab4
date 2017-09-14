
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        move();
        move();
        tuchWall();
    }
    public void tuchWall(){
        if (!frontIsClear()){
            turnLeft();
            move();
            if(frontIsClear()){
                 turnRight();
                 tuchWall();
            }
            else{
                turnLeft();
                move();
                turnRight();
                tuchWall();
            }
        }
        else{
            exit();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void exit(){
        move();
        turnOff();
    }
}

