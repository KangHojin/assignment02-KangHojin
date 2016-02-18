/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author DAESUN
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot (A, 0, 2, Direction.SOUTH);
        new Wall (A,0,0,Direction.WEST);
        new Wall (A,1,0,Direction.WEST);
        new Wall (A,2,0,Direction.WEST);
        new Wall (A,3,0,Direction.WEST);
        new Wall (A,4,0,Direction.WEST);
        new Wall (A,5,0,Direction.WEST);
        new Wall (A,6,0,Direction.WEST);
        new Wall (A,7,0,Direction.WEST);
        new Wall (A,8,0,Direction.WEST);
        new Wall (A,9,0,Direction.WEST);
        new Wall (A,0,1,Direction.EAST);
        new Wall (A,1,1,Direction.EAST);
        new Wall (A,2,1,Direction.EAST);
        new Wall (A,3,1,Direction.EAST);
        new Wall (A,4,1,Direction.EAST);
        new Wall (A,5,1,Direction.EAST);
        new Wall (A,6,1,Direction.EAST);
        new Wall (A,7,1,Direction.EAST);
        new Wall (A,8,1,Direction.EAST);
        new Wall (A,9,1,Direction.EAST);
        new Wall (A,0,2,Direction.EAST);
        new Wall (A,1,3,Direction.NORTH);
        new Wall (A,1,4,Direction.NORTH);
        new Wall (A,1,5,Direction.NORTH);
        new Wall (A,1,6,Direction.NORTH);
        new Wall (A,1,6,Direction.EAST);
        new Wall (A,2,6,Direction.EAST);
        new Wall (A,2,6,Direction.SOUTH);
        new Wall (A,2,5,Direction.SOUTH);
        new Wall (A,2,4,Direction.SOUTH);
        new Wall (A,2,3,Direction.SOUTH);
        new Wall (A,3,2,Direction.EAST);
        new Wall (A,4,3,Direction.SOUTH);
        new Wall (A,4,4,Direction.SOUTH);
        new Wall (A,4,5,Direction.SOUTH);
        new Wall (A,4,3,Direction.NORTH);
        new Wall (A,4,4,Direction.NORTH);
        new Wall (A,4,5,Direction.NORTH);
        new Wall (A,4,5,Direction.EAST);
        new Wall (A,5,2,Direction.EAST);
        new Wall (A,6,2,Direction.EAST);
        new Wall (A,7,3,Direction.NORTH);
        new Wall (A,7,4,Direction.NORTH);
        new Wall (A,7,5,Direction.NORTH);
        new Wall (A,7,6,Direction.NORTH);
        new Wall (A,7,7,Direction.NORTH);
        new Wall (A,7,7,Direction.EAST);
        new Wall (A,8,7,Direction.EAST);
        new Wall (A,8,7,Direction.SOUTH);
        new Wall (A,8,6,Direction.SOUTH);
        new Wall (A,8,5,Direction.SOUTH);
        new Wall (A,8,4,Direction.SOUTH);
        new Wall (A,8,3,Direction.SOUTH);
        new Wall (A,9,2,Direction.EAST);
        new Wall (A,9,2,Direction.SOUTH);
        new Thing (A,1,2);
        new Thing (A,1,3);
        new Thing (A,1,4);
        new Thing (A,1,5);
        new Thing (A,2,2);
        new Thing (A,2,4);
        new Thing (A,2,6);
        new Thing (A,4,2);
        new Thing (A,4,3);
        new Thing (A,4,4);
        new Thing (A,7,2);
        new Thing (A,7,3);
        new Thing (A,7,7);
        new Thing (A,8,3);
        new Thing (A,8,4);
        new Thing (A,8,6);
        
        while(a.frontIsClear())
        {
            a.move();
             if(a.getStreet()==1&&a.getAvenue()==2){
                 a.turnLeft();
             }
             if(a.getStreet()==2&&a.getAvenue()==2){
                 a.turnLeft();
             }            
             if(a.getStreet()==4&&a.getAvenue()==2){
                 a.turnLeft();
             }
              if(a.getStreet()==4&&a.getAvenue()==5){
                 a.turnLeft();
                 a.turnLeft();            
             }
               if(a.getStreet()==7&&a.getAvenue()==2){
                 a.turnLeft();
             }
                if(a.getStreet()==8&&a.getAvenue()==2){
                 a.turnLeft();
             }
                 if(a.getStreet()==9&&a.getAvenue()==2){
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 a.putThing();
                 break;
                 
             }
            if(a.canPickThing())
            {
                a.pickThing();
            }
           if(!a.frontIsClear()){
               a.turnLeft();
               a.turnLeft();
               a.turnLeft();
           }
            
            
        }
        
        
        
        
    }
    
}
