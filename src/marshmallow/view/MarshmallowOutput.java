package marshmallow.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterInfo(String info)
	{
		System.out.println("My monster info is: " + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is: " + info);
		
	}
	
	public void displayMonsterName(String getMonsterName)
	{
		JOptionPane.showMessageDialog(null, "My monster has: " + getMonsterName + " eyes.");
	}
	
	public void showResponse(String wordsFromMonster)
	{
		JOptionPane.showMessageDialog(null, wordsFromMonster);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null,stuff);
		
		return answer;
	}

}
