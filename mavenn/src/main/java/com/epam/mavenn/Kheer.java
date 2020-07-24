package com.epam.mavenn;

public class Kheer extends Sweets
{
    public Kheer(int sugar_content, int weight, int price, String sweetname,String type) 
    {    
        super(sugar_content, weight, price, sweetname,type); 
    }
    @Override
    void description() 
    {
    	System.out.println("This is Kheer");
    }  
}