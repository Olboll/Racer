import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class ScoreWindow
{
	JFrame scoreWindow;
	Racer r;
	
	public ScoreWindow()
	{
		scoreWindow = new JFrame();
		scoreWindow.setTitle("High Scores:");
		scoreWindow.setSize(500,650);
		scoreWindow.setLocation(800,0);
	}
	
	public void scoreWindowOpen()
	{
		if(!r.isPlaying())
		{
			scoreWindow.setVisible(true);
		}
		
		if(r.isPlaying())
		{
			scoreWindow.setVisible(false);
		}
	}
}