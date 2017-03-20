import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class ScoreWindow
{
	// Global variables for the GUI so they can be used in all methods - improves scope
	
	Racer r;
	
	JFrame scoreWindow;
	JPanel sPanel;
	JPanel nameField;
	JPanel highScoreList;
	JTextField enterName;
	
	public ScoreWindow()
	{
		/* Below is the GUI for the high score window, like Game.java, it would follow a Border Layout
		   if I was able to finish the task */
		
		
		scoreWindow = new JFrame();
		scoreWindow.setTitle("High Scores:");
		scoreWindow.setSize(500,650);
		scoreWindow.setLocation(800,0);
		scoreWindow.setVisible(false);
		scoreWindow.setContentPane(sPanel);
		
		sPanel = new JPanel(new BorderLayout());
		nameField = new JPanel();
		highScoreList = new JPanel();
		
		sPanel.add(highScoreList,BorderLayout.NORTH);
		sPanel.add(nameField,BorderLayout.SOUTH);
		
		enterName = new JTextField(30);
		nameField.add(enterName);
	}
	
	public void scoreWindowOpen()
	{
		// this method is designed to only show the score window after a game ends
		
		if(r.isPlaying())
		{
			scoreWindow.setVisible(false);
		}
		
		if(!r.isPlaying())
		{
			scoreWindow.setVisible(true);
		}
	}
}