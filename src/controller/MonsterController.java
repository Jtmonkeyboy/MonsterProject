package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Ni Ni", 2.0, 2, true, 4);
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
		Scanner inputMonster = new Scanner(System.in);
		
		System.out.println("Lets make a new monster!");
		System.out.println("What is your monster's name?");
		String name = inputMonster.nextLine();
		userMonster.setName(name);
		
		System.out.println("How many legs does your monster have?");
		String legCount = inputMonster.next();
		while(!validDouble(legCount))
		{
			System.out.println("Try again. How many legs does your monster have?");
			legCount = inputMonster.next();
		}
		userMonster.setLegCount(Double.parseDouble(legCount));
		
		System.out.println("How many eyes does your monster have?");
		String eyeCount = inputMonster.next();
		while(!validInt(eyeCount))
		{
			System.out.println("Try again. How many eyes does your monster have?");
			eyeCount = inputMonster.next();
		}
		userMonster.setEyeCount(Integer.parseInt(eyeCount));
		
		System.out.println("True or false? Does your monster have a noes?");
		String hasNoses = inputMonster.next();
		userMonster.setHasNoses(Boolean.parseBoolean(hasNoses.toLowerCase()));
		
		System.out.println("How many arms does your monster have?");
		String armCount = inputMonster.next();
		while(!validInt(armCount))
		{
			System.out.println("Try again. How many arms does your monster have?");
			armCount = inputMonster.next();
		}
		userMonster.setArmCount(Integer.parseInt(armCount));
		
		System.out.println("Your monster's name is " + name + ".");
		System.out.println("Your monster has " + legCount + " legs.");
		System.out.println("You gave your monster " + eyeCount + " eyes.");
		if(hasNoses.toLowerCase().equals("true"))
		{
			System.out.println("Your monster has a nose.");
		}
		else if(hasNoses.toLowerCase().equals("false"))
		{
			System.out.println("Your monster does not have a nose");
		}
		else
		{
			System.out.println("There was an error in understanding if you wanted a nose or not.");
		}
		System.out.println("Your monster has " + armCount + " arms.");
		
		inputMonster.close();
	}
	
	public boolean validInt(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}
		
		catch(NumberFormatException error)
		{
			System.out.println("This variable has to be a number.");
		}
		return isValid;
	}
	public boolean validDouble(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(sample);
			isValid = true;
		}
		
		catch(NumberFormatException error)
		{
			System.out.println("This variable has to be a number.");
			
		}
		return isValid;
	}
}
