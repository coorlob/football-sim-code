package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GameMainWindow extends JFrame implements ActionListener {

	private JButton showCompetition;
	private JButton teamButton;
	
	public GameMainWindow(){
		
		setSize(900,900);
		setLocation(450,100);
		Container c;
		c=getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new BorderLayout());
		
		JPanel menu = new JPanel();
		JPanel messageList = new JPanel(new FlowLayout());
		JPanel about = new JPanel(new FlowLayout());
		
		messageList.setBackground(Color.BLUE);
		
		about.setBackground(Color.CYAN);
		
		menu.setBackground(Color.WHITE);
		
		c.add(menu, BorderLayout.WEST);
		c.add(about, BorderLayout.NORTH);
		c.add(messageList, BorderLayout.EAST);
		
		showCompetition = new JButton("Competitie");
		showCompetition.addActionListener(this);
		menu.add(showCompetition);
		
		teamButton = new JButton("Eigen Team");
		teamButton.addActionListener(this);
		menu.add(teamButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		if(a.getSource() == showCompetition){
			JFrame CompetitionStanding = new CompetitionStandings();
		}
		
		else if(a.getSource() == teamButton){
			JFrame teamWindow = new TeamWindow();
		}
		
	}
}
