import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class High Score extends JFrame
{
	public High Score()
	{
		super("Highscore Example");
		setBounds(0,0,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
		scoreTable = new JTable(10,2);
		scoreTable.setEnabled(false);
		scoreTable.setBounts(20,20,250,80);
		
		nameLabel = new JLabel("Enter Your Name:");
		nameLabel.setLocation(10,140);
		nameLabel.setSize(nameLabel.getPreferredSize());
		
		scoreLabel = new JLabel("Enter Your Score:");
		scoreLabel.setLocation(10,170);
		scoreLabel.setSize(scoreLabel.getPreferredSize());
		
		nameField = new JTextField();
		nameField.setBounds(120,140,140,20);
		
		scoreField = new JTextField();
		scoreField.setBounds(120,170,140,20);
		
		submitButton = new Jbutton("Submit your Score!");
		submitButton.setBounds(20, 220, 250, 30);
		
		Container content = getContentPane();
		
		content.add(scoreTable);
		content.add(nameLabel);
		content.add(scoreLabel);
		content.add(nameField);
		content.add(scoreField);
		content.add(submitButton);
		
		setVisible(true);
	}
	
	JTable scoreTable;
	JLabel nameLabel;
	JLabel scoreLabel;
	JTextField nameField;
	JTextField scoreField;
	JButton submitButton;
}