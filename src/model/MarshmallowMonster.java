package model;

public class MarshmallowMonster
{
	//Declaration Section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public MarshmallowMonster()
	{
		//Default constructor.
		//Generally boring and not as helpful.
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
	public String toString()
	{
		String description = "This monster is named " +name
								+ " and it has " + legCount + " legs....."
								+ " its favorite silly/scary/ spooky thing to say is: "
								+ "Mike Wazowski!";
		
		return description;
	}
}
