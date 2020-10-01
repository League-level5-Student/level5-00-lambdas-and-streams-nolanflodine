package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	// LambdaButtons lb = new LambdaButtons();
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Type number to add:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Type another number to add:"));
			JOptionPane.showMessageDialog(null, "The answer is " + (num1 + num2));
		});
		randNumber.addActionListener((e) -> {
			Random r = new Random();
			JOptionPane.showMessageDialog(null, "Your random number is " + r.nextInt(100));
		});
		tellAJoke.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, "Your face");
			JOptionPane.showMessageDialog(null, "Gottem");
		});
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

}
