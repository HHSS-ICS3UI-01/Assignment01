
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        //Walls
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.WEST);
        
        //Make am Robot
        Robot Ralphie = new Robot (kw, 0, 2, Direction.WEST);
        Ralphie.move();
        Ralphie.move();
        Ralphie.turnLeft();
        Ralphie.move();
        Ralphie.move();
        Ralphie.move();
        Ralphie.turnLeft();
        Ralphie.move();
        Ralphie.move();
        Ralphie.move();
        Ralphie.turnLeft();
        Ralphie.move();
        Ralphie.move();
        Ralphie.move();
        Ralphie.turnLeft();
        Ralphie.move();
    }
}
