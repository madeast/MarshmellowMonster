package marshmellow.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallow.view.MarshmallowsOutput;

public class MarshmallowController
{
	private MarshmallowMonster eastMonster;
	private MarshmallowsOutput myOutput;

	public MarshmallowController()
	{
		int eyes = 3;
		double legs = 2.5;
		double hair = 1.2;
		int ears = 2;
		boolean hasBellyButton = true;
		String name = "Steve";

		myOutput = new MarshmallowsOutput();
		eastMonster = new MarshmallowMonster(name, eyes, ears, hair, legs, hasBellyButton);
	}

	public void start()
	{
		myOutput.displayMonsterInfo(eastMonster.toString());
	}
}
