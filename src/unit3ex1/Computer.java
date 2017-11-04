/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3ex1;

/**
 *
 * @author moon pc
 */
public class Computer 
{
    //Attributes
    private String make;
    private String model;

    
    //Constructors
    public Computer()
    {
        this.make = "";
        this.model = "";

    }
    public Computer(String make, String model) 
    {
        this.make = make;
        this.model = model;

    }
    
    //Getters

    public String getMake() 
    {
        return make;
    }

    public String getModel() 
    {
        return model;
    }
    
    //Setters 
    public void setMake(String make) 
    {
        this.make = make;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    
    
}
