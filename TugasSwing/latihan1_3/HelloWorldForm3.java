package latihan1_3;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class HelloWorldForm3 extends JFrame implements ActionListener {
	private JLabel label;
	private JButton button;

	public HelloWorldForm3() {
		label = new JLabel();
		label.setText("Hello world!");

		button = new JButton("Klik Me!");
		button.addActionListener(this); 

		setLayout(new GridLayout(2, 1));
		add(label);
		add(button);

		setTitle("My First Program");
		setVisible(true);
		setSize(300, 200);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("Hallo Dunia");
	}
}
