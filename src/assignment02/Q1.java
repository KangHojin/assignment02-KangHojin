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

/**
 *
 * @author DAESUN
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot (A, 1, 1, Direction.EAST);
        new Thing (A,1,2);
        new Thing (A,1,3);
        new Thing (A,1,4);
        new Thing (A,1,5);
        new Thing (A,1,6);
        new Thing (A,1,7);
        new Thing (A,1,8);
        new Thing (A,1,9);
        new Thing (A,1,10);
        new Thing (A,1,11);
        
        while(a.frontIsClear())
        {
            a.move();
            a.pickThing();
            if(a.countThingsInBackpack()==7)
            {break;}
            
                    
        }
        a.move();
        a.move();
        a.move();
        a.move();
    }
    
}
