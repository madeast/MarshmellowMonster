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
			betterMonsterNose = myOutput.grabAnswer("Type in a positive integer for the monsters nostrils.");
		}
		
		while (!isDouble(betterMonsterLegs))
		{
			betterMonsterLegs = myOutput.grabAnswer("Type in a positive integer for the monsters legs.");
		}
		while (!isDouble(betterMonsterHair))
		{
			betterMonsterHair = myOutput.grabAnswer("Type in a positive integer for the monsters hair.");
		}



	
		
		if (isInteger(betterMonsterEyes))

		{
			inputEyes = Integer.parseInt(betterMonsterEyes);
			myOutput.showResponse("The monster has " + betterMonsterEyes + " eyes.");

		}
		else
		{
			inputEyes = -999;
		}
		
		
		
		
		if(isInteger(betterMonsterNose))
		{
			inputNose = Integer.parseInt(betterMonsterNose);
			myOutput.showResponse("The monster has " + inputNose + "nostrils.");
		}
		else
		{
			inputNose = -999;
		}
		
		


		if (isInteger(betterMonsterNose))
		{
			inputNose = Integer.parseInt(betterMonsterNose);
		}
		else
		{
			inputNose = -999;
		}
		

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

	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			double inputLegs = Double.parseDouble(input);
		}
		catch (NumberFormatException error)
		{
			myOutput.showResponse("Not a valid Integer - bad value will be used.");
		}

		return isDouble;
	}
}
