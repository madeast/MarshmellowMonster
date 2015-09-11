package marshmallows.model;

public class MarshmallowMonster
{

	private String monsterName;
	private int monsterEyes;
	private int monsterEars;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;

	private MarshmallowMonster()
	{

	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterEars, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterEars = monsterEars;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
	}

	public String toString()
	{
		String monster = "This monster has " + monsterEyes + " eyes, and its' name is " + monsterName + ". He grew up in America and was treated very poorly due to his look. Since he had " + monsterLegs + " legs. When he turned 18 he moved to Italy where they loved the fact that he only had " + monsterHair + " strands of hair. They did find it weird that he had " + monsterBellyButton + " belly button, but they got past that." ;
	

		return monster;
	}
}
