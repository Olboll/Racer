import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class Game //implements ActionListener
{
	Racer r;
	JButton playButton;
	JButton stopButton;
	JLabel scoreLabel;
	JFrame window;
	JPanel panel;
	JPanel scorePanel;
	JPanel buttonPanel;
	
	JFrame scoreWindow;
	JPanel sPanel;
	JPanel nameField;
	JPanel highScoreList;
	JTextField enterName;
	
	public Game() 
	{
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
	///////////////////////////////////////////////////////////	
		scoreWindow = new JFrame();
		sPanel = new JPanel(new BorderLayout());
		nameField = new JPanel();
		highScoreList = new JPanel();
		
		sPanel.add(highScoreList,BorderLayout.NORTH);
		sPanel.add(nameField,BorderLayout.SOUTH);
		
		enterName = new JTextField(30);
		nameField.add(enterName);
		
		scoreWindow.setTitle("High Scores:");
		scoreWindow.setSize(500,650);
		scoreWindow.setContentPane(sPanel);
		scoreWindow.setLocation(800,0);
		scoreWindow.setVisible(true);
	
		
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
				r.getPanel().requestFocus();
			}
		}
		});
		r.start();	
	}
	
	public void gameStart()
	{
		if(r.isPlaying())
		{
			r.update();
			scoreLabel.setText("Score: "+Integer.toString(r.getScore()));
		}
	}
	
	/*public void actionPerformed(ActionEvent e)
	{
		
			if (e.getSource() == playButton)
			{ if(!r.isPlaying()){
				r.start();
				}
			}
				
			if (e.getSource() == stopButton)
			{ 
				if(r.isPlaying())
					r.stop();
			}
		
	}*/
}