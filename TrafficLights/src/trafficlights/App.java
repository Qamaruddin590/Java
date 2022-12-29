package trafficlights;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class App implements ItemListener {
	//Creating Instances
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel heading = new JLabel();
	JRadioButton red_button = new JRadioButton("Red");
	JRadioButton yellow_button = new JRadioButton("Yellow");
	JRadioButton green_button = new JRadioButton("Green");
	JRadioButton exit_button = new JRadioButton("Exit Lights");
	ButtonGroup bg = new ButtonGroup(); 
	Font font = new Font("Verdana", Font.BOLD, 30);
	
	App() {
		
		//Top Heading
		heading.setText("Select Lights");
		heading.setForeground(Color.BLACK);
		heading.setBounds(295, 0, 300, 100);
		heading.setFont(font);
		panel.add(heading);
		
		//Red Button
		red_button.setForeground(Color.RED);
		red_button.setBackground(new Color(210,180,140));
		red_button.setBounds(260, 150, 100, 100);
		red_button.setFocusable(false);
		red_button.addItemListener(this);
		bg.add(red_button);
		panel.add(red_button);
		
		//Yellow Button
		yellow_button.setForeground(Color.YELLOW);
		yellow_button.setBackground(new Color(210,180,140));
		yellow_button.setBounds(360, 150, 100, 100);
		yellow_button.setFocusable(false);
		yellow_button.addItemListener(this);
		bg.add(yellow_button);
		panel.add(yellow_button);
		
		//Green Button
		green_button.setForeground(Color.GREEN);
		green_button.setBackground(new Color(210,180,140));
		green_button.setBounds(470, 150, 100, 100);
		green_button.setFocusable(false);
		green_button.addItemListener(this);
		bg.add(green_button);
		panel.add(green_button);
		
		//Exit Button
		exit_button.setForeground(Color.BLACK);
		exit_button.setBackground(new Color(210,180,140));
		exit_button.setBounds(350, 250, 100, 100);
		exit_button.setFocusable(false);
		exit_button.addItemListener(this);
		bg.add(exit_button);
		panel.add(exit_button);
		
		//Frame
		frame.setSize(800,500);
		frame.setTitle("Traffic Lights");
		frame.getContentPane().setBackground(Color.green);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setBackground(new Color(210,180,140));
		panel.setLayout(null);
	}
	
	public void itemStateChanged(ItemEvent e) {
		JRadioButton selected = (JRadioButton) e.getSource();
		String textOnButton = selected.getText();
		if (textOnButton.equals("Red")) {
			heading.setForeground(Color.RED);
			heading.setText("STOP!");
			heading.setBounds(360, 0, 300, 100);
		}
		else if (textOnButton.equals("Yellow")) {
			heading.setForeground(Color.YELLOW);
			heading.setText("READY!");
			heading.setBounds(350, 0, 300, 100);
		}
		else if (textOnButton.equals("Green")) {
			heading.setForeground(Color.GREEN);
			heading.setText("GO!");
			heading.setBounds(380, 0, 300, 100);
		}
		else {
			heading.setForeground(Color.BLACK);
			heading.setText("Select Lights");
			heading.setBounds(295, 0, 300, 100);
		}
	}
}