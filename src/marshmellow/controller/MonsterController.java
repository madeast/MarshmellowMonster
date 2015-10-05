package marshmellow.controller;

import java.util.Scanner;

import marshmallows.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster ashMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;

	public MonsterController()
	{
		int Eyes = 4;
		double legs = 8;
		int nose = 1;
		double hair = 2;
		boolean hasBellyButton = false;
		String name = "Spindle the Spider";

		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		ashMonster = new MarshmallowMonster(name, eyes, nose, hair, legs, hasBellyButton);

	}

	public void start()
	{
		ashMonster.toString();
		myOutput.displayMonsterInfo(ashMonster.toString());
		myOutput.displayMonsterGUI(ashMonster.toString());
		myOutput.displayMonsterName(ashMonster.toString());
		// this.makeUserMonster();
		// myOutput.displayMonsterInfo("New Monster Info" +
		// userMonster.toString());
	}

	private void askQuestions()
	{
		String betterMonsterName = myOutput.grabAnswer("Type in a better name.");
		myOutput.showResponse("You typed in: " + betterMonsterName);

		String betterMonsterEyes = myOutput.grabAnswer("Type in how many eyes the monster have.");
		int inputEyes;
		
		while (!isInteger(betterMonsterEyes))
		{
			betterMonsterEyes = myOutput.grabAnswer("Type in a positive integer for the monster eyes.");
		}
		
		if (!isInteger(betterMonsterEyes))
		{
			inputEyes = Integer.parseInt(betterMonsterEyes);
		}
		else
		{
			inputEyes = -999;
		}

		System.out.println("Type in a new number of eyes");
		int betterMonsterEyes = monsterScanner.nextInt();

		System.out.println("Type in a new number of legs");
		double betterMonsterLegs = monsterScanner.nextDouble();

		System.out.println("Type in a new number of noses");
		int betterMonsterNose = monsterScanner.nextInt();

		System.out.println("Type in a new number of hair");
		double betterMonsterHair = monsterScanner.nextDouble();

		System.out.println("Will it have a bellybutton?(True/False)");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();

		ashMonster.setMonsterName(betterMonsterName);
		ashMonster.setMonsterEyes(betterMonsterEyes);
		ashMonster.setMonsterLegs(betterMonsterLegs);
		ashMonster.setMonsterNose(betterMonsterNose);
		ashMonster.setMonsterHair(betterMonsterHair);
		ashMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}

	/**
	 * This method will get the information to create an instance of a
	 * MarshmallowMonster.
	 */
	/*private void makeUserMonster()
	{
		// Step one: Get variables
		String userName;
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton;

		// Step two:Define variables by using Scanner to get inputs
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster.");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in number of Noses.");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("Type in number of hair.");
		userHair = monsterScanner.nextDouble();
		System.out.println("Type in new number of legs.");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does it have a bellybutton?(True/False)");
		userBellyButton = monsterScanner.nextBoolean();

		// Step three: Make a monster - use the Constructor!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);

	}*/
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int inputEyes = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			myOutput.showResponse("Not a valid Integer - bad value will be used.");
		}
		
		return isInt;
	}
}
