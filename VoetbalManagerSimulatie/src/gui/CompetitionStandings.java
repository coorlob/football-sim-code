package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CompetitionStandings extends JFrame {

	public CompetitionStandings(){
		
		setSize(150, 500);
		setLocation(100,100);
		
		Container c;
		c=getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new FlowLayout());
		
		JPanel rankingList = new JPanel();
		String numbers[] = {"1","2","3","4","5"};
		JList ranking= new JList(numbers);
		rankingList.add(ranking);
		
		JPanel teamListPanel = new JPanel();
		String teams[] = {"a","b","c","d","e"};
		JList teamList = new JList(teams);
		teamList.addMouseListener(new ActionList(teamList));
		teamListPanel.add(teamList);
		
		c.add(rankingList);
		c.add(teamListPanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	class ActionList extends MouseAdapter{
		private JList list;
		
		public ActionList(JList l){
			list = l;
		}
		
		public void mouseClicked(MouseEvent e){
			if(e.getClickCount() == 2){
				int index = list.locationToIndex(e.getPoint());
				ListModel dlm = list.getModel();
				Object item = dlm.getElementAt(index);
				list.ensureIndexIsVisible(index);
				System.out.println(item);
			}
		}
	}
}
