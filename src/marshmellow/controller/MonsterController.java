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
		int eyes = 4;
		double legs = 8;
		int nose = 1;
		double hair = 2;
		boolean hasBellyButton = false;
		String name = "Murray the Monster";

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

		String betterMonsterEyes = myOutput.grabAnswer("Type in how many eyes you want the monster have.");
		int inputEyes;


		String betterMonsterNose = myOutput.grabAnswer("Type in how many nostirls you want the monster to have.");
		int inputNose;

		String betterMonsterLegs = myOutput.grabAnswer("Type in how many legs you want your monster to have.");
		double inputLegs;

		String betterMonsterHair = myOutput.grabAnswer("Type in how many strands of hair you want your monster to have.");
		double inputHair;

		while (!isInteger(betterMonsterEyes))
		{
			betterMonsterEyes = myOutput.grabAnswer("Type in a positive integer for the monster eyes.");
		}

		while (!isInteger(betterMonsterNose))
		{
			betterMonsterNose = myOutput.grabAnswer("Type in a positive integer for the monster legs.");
		}

		while (!isDouble(betterMonsterLegs))
		{
			betterMonsterLegs = Double.parseDouble(betterMonsterLegs);
		}
		while (!isDouble(betterMonsterHair))
		{
			betterMonsterHair = Double.parseDouble(betterMonsterHair);
		}

		if (isInteger(betterMonsterEyes))
=======
		
		while (!isEyeInteger(betterMonsterEyes))
		{
			betterMonsterEyes = myOutput.grabAnswer("Type in a positive integer for the monster eyes.");
		}
		
		if (!isEyeInteger(betterMonsterEyes))
>>>>>>> Stashed changes
		{
			inputEyes = Integer.parseInt(betterMonsterEyes);

		}
		else
		{
			inputEyes = -999;
		}
		myOutput.showResponse("The monster has " + betterMonsterEyes + " eyes.");
		
		String betterMonsterNose = myOutput.grabAnswer("Type in how many nostrils the monster has.");
		int inputNose;
		while (!isNoseInteger(betterMonsterNose))
		{
			inputNose = Integer.parseInt(betterMonsterNose);
		}
		
		if(!isNoseInteger(betterMonsterNose))
		{
			inputNose = Integer.parseInt(betterMonsterNose);
		}
		else
		{
			inputNose = -999;
		}
		myOutput.showResponse("The monster has " + inputNose + "nostrils.");
		
		String betterMonsterLegs


		if (isInteger(betterMonsterNose))
		{
			inputNose = Integer.parseInt(betterMonsterNose);
		}
		else
		{
			inputNose = -999;
		}
=======

		
>>>>>>> Stashed changes

		if (isDouble(betterMonsterLegs))
		{
			inputLegs = Double.parseDouble(betterMonsterLegs);
		}
		else
		{
			inputLegs = -999;
		}

		if (isDouble(betterMonsterHair))
		{
			inputHair = Double.parseDouble(betterMonsterHair);
		}
		else
		{
			inputHair = -999;
		}

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

	/*
	 * private void makeUserMonster() { // Step one: Get variables String
	 * userName; int userEyes; int userNoseCount; double userHair; double
	 * userLegs; boolean userBellyButton;
	 * 
	 * // Step two:Define variables by using Scanner to get inputs
	 * System.out.println("Type in your name for your monster."); userName =
	 * monsterScanner.nextLine();
	 * System.out.println("Type in the number of eyes for your monster.");
	 * userEyes = monsterScanner.nextInt();
	 * System.out.println("Type in number of Noses."); userNoseCount =
	 * monsterScanner.nextInt(); System.out.println("Type in number of hair.");
	 * userHair = monsterScanner.nextDouble();
	 * System.out.println("Type in new number of legs."); userLegs =
	 * monsterScanner.nextDouble();
	 * System.out.println("Does it have a bellybutton?(True/False)");
	 * userBellyButton = monsterScanner.nextBoolean();
	 * 
	 * // Step three: Make a monster - use the Constructor! userMonster = new
	 * MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs,
	 * userBellyButton);
	 * 
	 * }
	 */

	private boolean isInteger(String input)
	{
		boolean isInt = false;

		try
		{
			int validInt = Integer.parseInt(input);
			isInt = true;
=======
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
	
	private boolean isEyeInteger(String input)
	{
		boolean isEyeInt = false;
		
		try
		{
			int inputEyes = Integer.parseInt(input);
			isEyeInt = true;
>>>>>>> Stashed changes
		}
		catch (NumberFormatException error)
		{
			myOutput.showResponse("Not a valid Integer - bad value will be used.");
		}


		return isInt;

	}

	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			double inputLegs = Integer.parseDouble(input);
		}
		catch (NumberFormatException error)
		{
			myOutput.showResponse("Not a valid Integer - bad value will be used.");
		}
=======
		
		return isEyeInt;
>>>>>>> Stashed changes
	}
	private boolean isNoseInteger(String input)
	{
		boolean isNoseInt = false;
		
		try
		{
			int inputNose = Integer.parseInt(input);
			isNoseInt = true;
		}
		catch (NumberFormatException error)
		{
			myOutput.showResponse("not a valid Integer - bad value will be used.");
		}
		
		return isNoseInt;
	}
	
}
