package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Ni Ni", 2.0, 2, true, 4, "Mike Wazowski!");
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);
//		System.out.println(myMonster);
		
		Scanner inputMonster = new Scanner(System.in);
//		System.out.println("Lets make a new monster!");
		JOptionPane.showMessageDialog(null, "Let's make a new monster!");
//		System.out.println("What is your monster's name?");
		String name = JOptionPane.showInputDialog(null, "What is your monster's name?");
//		String name = inputMonster.nextLine();
		userMonster.setName(name);
		
//		System.out.println("How many legs does your monster have?");
		String legCount = JOptionPane.showInputDialog(null, String.format("How many legs does %s have?", name));
//		String legCount = inputMonster.next();
		while(!validDouble(legCount))
		{
			legCount = JOptionPane.showInputDialog(null, String.format("Try again. How many legs does %s have?", name));
		}
//		System.out.println(Math.abs(-5.0));
//		String guess = JOptionPane.showInputDialog(null, "Testing.. Testing");
//		System.out.println(Math.abs(Double.parseDouble(guess)));
//		System.out.println(Math.abs(Double.parseDouble("-5.0")));
		userMonster.setLegCount(Math.abs(Double.parseDouble(legCount)));
		
//		System.out.println("How many eyes does your monster have?");
		String eyeCount = JOptionPane.showInputDialog(null, String.format("How many eyes does %s have?", name));
//		String eyeCount = inputMonster.next();
		while(!validInt(eyeCount))
		{
			eyeCount = JOptionPane.showInputDialog(null, String.format("Try again. How many eyes does %s have?", name));
		}
		userMonster.setEyeCount(Math.abs(Integer.parseInt(eyeCount)));
		
//		System.out.println("True or false? Does your monster have a nose?");
		String hasNoses = JOptionPane.showInputDialog(null, String.format("True or false? Does %s have a nose?", name));
//		String hasNoses = inputMonster.next();
		userMonster.setHasNoses(Boolean.parseBoolean(hasNoses.toLowerCase()));
		
//		System.out.println("How many arms does your monster have?");
		String armCount = JOptionPane.showInputDialog(null, String.format("How many arms does %s have?", name));
//		String armCount = inputMonster.next();
		while(!validInt(armCount))
		{
			armCount = JOptionPane.showInputDialog(null, String.format("Try again. How many arms does %s have?", name));
		}
		userMonster.setArmCount(Math.abs(Integer.parseInt(armCount)));
		
		if(hasNoses.toLowerCase().equals("true"))
		{
			if(Math.abs(Double.parseDouble(legCount)) == 2.0 &&
			Math.abs(Integer.parseInt(eyeCount)) == 2 && Math.abs(Integer.parseInt(armCount)) == 2)
			{
				JOptionPane.showMessageDialog(null, "Your monster's name is " + name + ".\n"
						+ "Your monster has " + Math.abs(Double.parseDouble(legCount)) + " legs.\n"
						+ "You gave your monster " + Math.abs(Integer.parseInt(eyeCount)) + " eyes.\n"
						+ "Your monster has a nose.\n"
						+ "Your monster has " + Math.abs(Integer.parseInt(armCount)) + " arms.\n\n"
						+ "Your monster is a human!!!!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your monster's name is " + name + ".\n"
						+ "Your monster has " + Math.abs(Double.parseDouble(legCount)) + " legs.\n"
						+ "You gave your monster " + Math.abs(Integer.parseInt(eyeCount)) + " eyes.\n"
						+ "Your monster has a nose.\n"
						+ "Your monster has " + Math.abs(Integer.parseInt(armCount)) + " arms.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your monster's name is " + name + ".\n"
					+ "Your monster has " + Math.abs(Double.parseDouble(legCount)) + " legs.\n"
					+ "You gave your monster " + Math.abs(Integer.parseInt(eyeCount)) + " eyes.\n"
					+ "Your monster does not have a nose.\n"
					+ "Your monster has " + Math.abs(Integer.parseInt(eyeCount)) + " arms.");
		}
/*		System.out.println("Your monster's name is " + name + ".");
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
*/
		if(Math.abs(Double.parseDouble(legCount)) == 2.0 &&
		Math.abs(Integer.parseInt(eyeCount)) == 2 && Math.abs(Integer.parseInt(armCount)) == 2)
		{
			
		}

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
			JOptionPane.showMessageDialog(null, "This variable has to be a number.");
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
			JOptionPane.showMessageDialog(null, "This variable has to be a number.");
			
		}
		return isValid;
	}
}
