/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3ex1;

import java.util.ArrayList;

/**
 *
 * @author moon pc
 */
public class ComputerDriver 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Computer PC1 = new Computer("Apple","Macintosh");
        Computer PC2 = new Computer("Dell","Inspiron");
        Computer PC3 = new Computer("Sony","Vaio");

        
        Person Osama = new Person("Osama");

        Person Ahmed = new Person("Ahmed", PC1);
       
        Ahmed.buyComputer(PC2);
        Ahmed.buyComputer(PC3);
        Osama.borrowComputer(PC1);

        
        
        System.out.println(Osama.getName() +" borrowed a " 
                + Osama.getBorrowedComputer().getModel());
        System.out.println(Ahmed.toString());
        System.out.println(Osama.toString());
        System.out.println("heyhttps://www.youtube.com/watch?v=E8TXME3bzNs&ab_channel=ChrisLam");
        
        
        

    }
    
}
