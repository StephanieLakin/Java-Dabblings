import java.util.Scanner;
import java.util.*;


public class Item
{
	private String name;
	private double price;
	
	public static final double TOLERANCE = 0.0000001;
	
	public Item(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public Item()
	{
		this("",0.0);
	}
	
	public Item(Item other)
	{
		this.name = other.name;
		this.price = other.price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void input()
	{
	   // Code to be written by student
	   
            Scanner keyboard = new Scanner(System.in);
             System.out.println("Enter the item name: ");
            name = keyboard.next();
            System.out.println("Enter the price of the item: ");
            price = keyboard.nextDouble();
	}
	
	public void show()
	{
		// Code to be written by student
            System.out.println("The name of the item is  " + name);
            System.out.println("The cost of the item is  " + price);
	}

	public String toString()
	{
		return "Item: " + name + " Price: " + price;
	}
	
	public boolean equals(Object other)
	{
		if(other == null)
			return false; 
			return false;
		else
		{
			Item otherItem = (Item)other;
			return(name.equals(otherItem.name)
				&& equivalent(price, otherItem.price));
		}
		
	}
	
	private static boolean equivalent(double a, double b)
	{
		return ( Math.abs(a - b) <= TOLERANCE );
	}
	

}
