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
public class Person 
{
    //Attributes
    private String name;
    private ArrayList<Computer> ownedComputers;
    private Computer borrowedComputer;
    
    //Constructors
    public Person(String name, Computer newComputer) 
    {
        this.ownedComputers = new ArrayList<Computer>();
        this.name = name;
        ownedComputers.add(newComputer);
    }
    
    public Person(String name)
    {
        this.ownedComputers = new ArrayList<Computer>();
        this.name = name;
    }
    //Getters

    public String getName() 
    {
        return name;
    }
    
    
    public Computer getBorrowedComputer()
    {
        return borrowedComputer;
    }
    
    //sets the borrowedComputer value from the param
    public void borrowComputer(Computer borrowedComputer)
    {
        this.borrowedComputer = borrowedComputer;
    }
    
    //Adds a computer object to the owned arraylist
    public void buyComputer(Computer newComputer)
    {
        ownedComputers.add(newComputer);
    }
    
    //Prints all the owned computers
    @Override
    public String toString()
    {
        //String used to store all the required info
        String listOfOwnedComputers = "";
        
        if(ownedComputers.size() <= 0)
        {
            listOfOwnedComputers = getName()+ " does not own any computers.";
        }
        else
        {
            listOfOwnedComputers += getName()+"'s Computers:\n";
            //for loop to print all the computers in the array list
            for (int i = 0; i < ownedComputers.size(); i++) 
            {
                //Adds a row that contains each computer's make and model
                listOfOwnedComputers +=  "Make: " + ownedComputers.get(i).getMake();
                listOfOwnedComputers +=  ", Model: " +
                        ownedComputers.get(i).getModel() + "\n";
            }
        }
        
        return listOfOwnedComputers;
    }
    
    
}
