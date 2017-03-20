import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Driver
{
	public static void main(String[ ] args)
	{
		Game g = new Game();
		ScoreWindow sw = new ScoreWindow();
		
		while(true)
		{
			g.gameStart();
			sw.scoreWindowOpen();
		}
	}
}