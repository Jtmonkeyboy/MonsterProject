package model;

public class MarshmallowMonster
{
	//Declaration Section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	private String catchphrase;
	
	public MarshmallowMonster()
	{
		//Default constructor.
		//Generally boring and not as helpful.
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms, String catchphrase)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
		this.catchphrase = catchphrase;
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
	
	public String getCatchphrase()
	{
		return catchphrase;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNose)
	{
		this.hasNoses = hasNose;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	public void setCatchphrase(String catchphrase)
	{
		this.catchphrase = catchphrase;
	}
	
	public String toString()
	{
		String description = "This monster is named " +name
								+ " and it has " + legCount + " legs....."
								+ " its favorite spooky thing to say is: "
								+ catchphrase;
		return description;
	}
	
}
