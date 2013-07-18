package gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {

	public MainWindow(String s) {
		setTitle(s);
		setSize(300, 300);
		setLocation(10,200);
		JPanel panel = new JPanel();
		
		JButton startGameButton = new JButton("Start Game");
		startGameButton.addActionListener(this);
		panel.add(startGameButton);
		
		panel.setBackground(Color.WHITE);
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		JFrame f = new MainWindow("Main Frame");
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		JFrame game = new GameMainWindow();
		setVisible(false);
		dispose();
		
	}
	
}
