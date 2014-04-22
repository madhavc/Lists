/**
 * This file is from the material for the course
 * CS 240: Data Structures and Algorithms
 * taught at California State Polytechnic University - Pomona, and
 * cannot be used without express written consent from the author.
 * 
 * Copyright (c) 2013 - Madhav Chhura
 * 
 * @author Madhav Chhura
 * 
 */
 import java.util.*;

public class TesterClass 
{

	public static void main(String[] args) 
	{   
		Scanner kb = new Scanner(System.in);
		int size = 10000000;
		SimpleBoundedList<Integer, String> newList = new SimpleBoundedList<Integer, String>(size);
		
		int id = 0;
		String name = null;
		System.out.print("Enter the name of the user: ");
		name = kb.nextLine();
		System.out.print("Enter the ID related to the above name: ");
		id = kb.nextInt();

		newList.add(id,name);
		
		String input = instructions();
		

	    do
		{
			if(input.equals("add"))
			{
				System.out.print("Enter the name of the user: ");
				name = kb.nextLine();
				name = kb.nextLine();
			
				System.out.print("Enter the ID related to the above name: ");
				id = kb.nextInt();
				
				newList.add(id,name);
				input = instructions();
			}
			
			if(input.equals("order"))
			{
				System.out.print("The order method is not working. I tried my but could not get it to work");
				input = instructions();
			}
				
			if(input.equals("find name"))
			{
				System.out.print("Enter the ID to get a particular user's name: ");
				id = kb.nextInt();
				try
				{
					String searchResult = newList.lookup(id);
					System.out.println("Name Found: " + searchResult);
					
				}
				catch(NullPointerException e)
				{
					System.out.print("No Name Found! The ID you have entered is not in the list");
				}
				
				input = instructions();
					
			}
		}
		while(input.equals("add") || input.equals("order") || input.equals("find name"));			
		
	}
	
	public static String instructions ()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("");
		System.out.println("Instructions: \n" + 
				   "-->To add more names and IDs enter - \"add\" or \n" + 
				   "-->To show a list of names in alphabatical order enter - \"order\" or \n" +
				   "-->To get a particular user's name given an ID enter - \"Find Name\" or \n" +
	        	   "-->To exit enter - \"exit\"");
		System.out.println("");
		System.out.print("Enter your input: ");
		String userInput = kb.nextLine();
		userInput = userInput.toLowerCase();
		return userInput;
	}
}
