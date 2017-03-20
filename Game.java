import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class Game
{
	// Global variables for the GUI so they can be used in all methods - improves scope
	
	Racer r;
	JButton playButton;
	JButton stopButton;
	JLabel scoreLabel;
	JFrame window;
	JPanel panel;
	JPanel scorePanel;
	JPanel buttonPanel;
	
	public Game() 
	{
		// The gui for the game and layout for the buttons, labels and r.getPanel, also provides an instance of racer
		
		window = new JFrame();
		panel = new JPanel(new BorderLayout());
		scorePanel = new JPanel();
		buttonPanel = new JPanel();
		r = new Racer();
		scoreLabel = new JLabel("");
		playButton = new JButton("PLAY");
		stopButton = new JButton("STOP");
		
		window.setTitle("Racer");
		window.setSize(800,650);
		window.setContentPane(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(0,0);
		window.setVisible(true);

		panel.add(scorePanel,BorderLayout.NORTH);
		panel.add(r.getPanel(),BorderLayout.CENTER);
		panel.add(buttonPanel,BorderLayout.SOUTH);
	
		scorePanel.add(scoreLabel);
		buttonPanel.add(playButton);
		buttonPanel.add(stopButton);
		
		// Action listeners below are used to start and stop the program from running
		
		stopButton.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e){
			if(r.isPlaying())
				r.stop();
		}
		});
		
		playButton.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e){
			if(!r.isPlaying()){
				r.start();
				r.getPanel().requestFocus(); // <- small improvement
			}
		}
		});
		r.start();	
	}
	
	/* the method below is called in the driver to start the game, it is within a while
	   loop within the driver itself and allows the score to update within the JLabel as
	   the game runs */
	
	public void gameStart()
	{
		if(r.isPlaying())
		{
			r.update();
			scoreLabel.setText("Score: "+Integer.toString(r.getScore()));
		}
	}
}