/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author DAESUN
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A =new City();
        Robot a = new Robot (A, 1, 0, Direction.EAST);
        new Wall (A, 0, 0, Direction.NORTH);
        new Wall (A, 0, 1, Direction.NORTH);
        new Wall (A, 0, 0, Direction.WEST);
        new Wall (A, 1, 0, Direction.WEST);
        new Wall (A, 1, 0, Direction.SOUTH);
        new Wall (A, 1, 1, Direction.SOUTH);
        new Wall (A, 1, 1, Direction.EAST);
        new Wall (A, 0, 1, Direction.EAST);
        
        while(a.frontIsClear())
        {
            a.move();
            if(!a.frontIsClear())
            {a.turnLeft();}
        }
    }
    
}
