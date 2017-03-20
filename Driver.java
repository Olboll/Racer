import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Driver
{
	public static void main(String[ ] args)
	{
		Game g = new Game();
		
		while(true)
		{
			g.gameStart();
			// g.scoreWindowOpen();
		}
	}
}