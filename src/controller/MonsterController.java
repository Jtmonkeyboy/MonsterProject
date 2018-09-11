package controller;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Ni Ni", 2.0, 2, true, 4);
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
