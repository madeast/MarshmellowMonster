package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNose;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;

	private MarshmallowMonster()
	{

	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNose, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNose = monsterNose;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	//Getters & Setters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNose()
	{
		return monsterNose;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNose(int monsterNose)
	{
		this.monsterNose = monsterNose;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + " eyes, and its' name is " + monsterName + ".";
		System.out.println ("His legend starts in Grevwald, when his father was killed by his mother.");
		System.out.println ("His mother had also killed most of his siblings, Spindle could not save any of his siblings, he tried valiantly, but failed.");
		System.out.println ("The screams of his siblings haunted him for his entire life, he began to 'hear' things.");
		System.out.println ("After he could no longer bear it, he dicide to find his mother and end her life.");
		System.out.println ( "His" + monsterLegs + "  legs had been torn off by his mother.");
		return monster;
	}

}
