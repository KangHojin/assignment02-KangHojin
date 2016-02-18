/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author DAESUN
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 2, 0, Direction.EAST);
        new Wall(A, 2, 0, Direction.SOUTH);
        new Wall(A, 2, 1, Direction.SOUTH);
        new Wall(A, 2, 2, Direction.SOUTH);
        new Wall(A, 2, 3, Direction.SOUTH);
        new Wall(A, 2, 4, Direction.SOUTH);
        new Wall(A, 2, 5, Direction.SOUTH);
        new Wall(A, 2, 6, Direction.SOUTH);
        new Wall(A, 2, 7, Direction.SOUTH);
        new Wall(A, 2, 8, Direction.SOUTH);
        new Wall(A, 2, 0, Direction.EAST);
        new Wall(A, 2, 1, Direction.EAST);
        new Wall(A, 2, 3, Direction.EAST);
        new Wall(A, 2, 6, Direction.EAST);
        new Thing(A, 2, 8);

        while (!a.canPickThing()) {
           
            if (!a.frontIsClear()) {
                a.turnLeft();
                a.move();
                a.turnLeft();
                a.turnLeft();
                a.turnLeft();
                a.move();
                a.turnLeft();
                a.turnLeft();
                a.turnLeft();
                a.move();
                a.turnLeft();
            } else {
                a.move();
            }

        }

    }

}
