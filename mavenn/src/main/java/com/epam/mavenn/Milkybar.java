package com.epam.mavenn;

class MilkyBar extends Chocolates
{
    public MilkyBar(int Chocolate_content, int weight, int price, String chocolate_name,String type) 
    {
        super(Chocolate_content, weight, price, chocolate_name, type);
    }

    @Override
    void description()
    {
        System.out.println( "This is MilkyBar");
    }
    
}
