import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Driver
{
	public static void main(String[ ] args)
	{
		JFrame window = new JFrame();
		JPanel panel = new JPanel(new BorderLayout());
		JPanel gamePanel = new JPanel();
		JPanel scorePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		Racer r = new Racer();
		JLabel scoreLabel = new JLabel("Score: " + r.getScore());
		JButton playButton = new JButton("PLAY");
		JButton stopButton = new JButton("STOP");
		
		window.setTitle("Racer");
		window.setSize(800,650);
		window.setContentPane(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		panel.add(scorePanel,BorderLayout.NORTH);
		panel.add(r.getPanel(),BorderLayout.CENTER);
		panel.add(buttonPanel,BorderLayout.SOUTH);
	
		
		playButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				r.start();
			}
		});

		stopButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				r.stop();
			}
		});
		
	
		scorePanel.add(scoreLabel);
		buttonPanel.add(playButton);
		buttonPanel.add(stopButton);
			
		r.start();
		
		while(r.isPlaying())
		{
			r.update();	
		}
	}
}