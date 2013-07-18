package gui;

import gui.CompetitionStandings.ActionList;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TeamWindow extends JFrame {
	
	private String switchPlayer = "";
	private int indexPlayerToBeSwitched = -1 ;
	private JList listOfPlayerToBeSwitched = null;
	
	private String[] arrayToBeSwitched = null;
	
	private String players[] = {"a","b","c","d","e"};
	private String otherPlayers[] = {"wat", "is", "deze", "?", "!"};
	
	private JList teamList;
	private JList otherPlayersList;

	public TeamWindow(){
		
		setSize(150, 500);
		setLocation(100,100);
		
		Container c;
		c=getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new FlowLayout());
		
		JTextField teamName = new JTextField("aaba", 20);
		teamName.setEditable(false);
		teamName.setName("Teamnaam");
		
		JPanel teamListPanel = new JPanel();
		teamList = new JList(players);
		teamList.addMouseListener(new ActionList(teamList, players));
		teamListPanel.add(teamList);
		
		otherPlayersList = new JList(otherPlayers);
		otherPlayersList.addMouseListener(new ActionList(otherPlayersList, otherPlayers));
		teamListPanel.add(otherPlayersList);
		
		
		c.add(teamListPanel);
		c.add(teamName);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class ActionList extends MouseAdapter{
		private JList list;
		private String[] res;
		
		public ActionList(JList l, String[] r){
			list = l;
			res = r;
		}
		
		public void mouseClicked(MouseEvent e){
			int index = list.locationToIndex(e.getPoint());
			ListModel dlm = list.getModel();
			Object item = dlm.getElementAt(index);
			list.ensureIndexIsVisible(index);
			if(e.getClickCount() == 1){
							if(indexPlayerToBeSwitched >-1){
								String resItem = (String) item;
								System.out.println("und hier?");
								if(arrayToBeSwitched[indexPlayerToBeSwitched].equals(players[indexPlayerToBeSwitched])){
									arrayToBeSwitched[indexPlayerToBeSwitched] = resItem;
									players = arrayToBeSwitched;
									res[index] = switchPlayer;
									System.out.println("doet sie het");
									otherPlayers = res;
									indexByList(indexPlayerToBeSwitched, players, index, otherPlayers);
								}
								else{
									arrayToBeSwitched[indexPlayerToBeSwitched] = resItem;
									otherPlayers = arrayToBeSwitched;
									res[index] = switchPlayer;
									players = res;
									System.out.println("was does het hier?");
									indexByList(indexPlayerToBeSwitched, otherPlayers, index, players);
								}
								switchPlayer = "";
								indexPlayerToBeSwitched = -1;
								listOfPlayerToBeSwitched = null;
								arrayToBeSwitched = null;

							}
							
							else if(indexPlayerToBeSwitched == -1){
								switchPlayer = (String) item;
								indexPlayerToBeSwitched = index;
								listOfPlayerToBeSwitched = list;
								arrayToBeSwitched = res;
								System.out.println("doet ie het");
								
				}
				
			}
			if(e.getClickCount() == 2){
				System.out.println(item);
			}
		}
		
		public void showList(JList list, int index){
			ListModel dlm = list.getModel();
			Object item = dlm.getElementAt(index);
			list.ensureIndexIsVisible(index);
		}
		
		public void indexByList(int a, String[] ab, int c, String[] cd){
			teamList = new JList(ab);
			otherPlayersList = new JList(cd);
			showList(teamList, a);
			showList(otherPlayersList, c);
		}
	}
	
}
