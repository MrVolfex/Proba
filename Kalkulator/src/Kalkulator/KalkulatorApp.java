package Kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class KalkulatorApp {

	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnC;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulatorApp window = new KalkulatorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KalkulatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 0, 293, 22);
		frame.getContentPane().add(textArea);
		
		btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("7");
			
			}
		});
		
		btnNewButton.setBounds(10, 31, 56, 36);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("8");
			}
		});
		btnNewButton_1.setBounds(88, 31, 56, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("9");
			}
		});
		btnNewButton_2.setBounds(169, 31, 56, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("4");
			}
		});
		btnNewButton_3.setBounds(10, 91, 56, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("5");
			}
		});
		btnNewButton_4.setBounds(88, 91, 56, 36);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("6");
			}
		});
		btnNewButton_5.setBounds(169, 91, 56, 36);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("1");
				
				String br=textArea.getText();
				String k=br+1;
				textArea.setText(k);
			}
		});
		btnNewButton_6.setBounds(10, 148, 56, 36);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("3");
			}
		});
		btnNewButton_7.setBounds(169, 148, 56, 36);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("2");
				String br=textArea.getText();
				String k=br+1;
				textArea.setText(k);
			}
		});
		btnNewButton_8.setBounds(91, 146, 56, 36);
		frame.getContentPane().add(btnNewButton_8);
		
		btnC = new JButton("C");
		btnC.setBounds(10, 198, 56, 36);
		frame.getContentPane().add(btnC);
		
		btnNewButton_10 = new JButton("0");
		btnNewButton_10.setBounds(92, 200, 56, 36);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("=");
		btnNewButton_11.setBounds(169, 198, 56, 36);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("/");
		btnNewButton_12.setBounds(245, 198, 56, 36);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("*");
		btnNewButton_13.setBounds(244, 147, 56, 36);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("-");
		btnNewButton_14.setBounds(241, 88, 56, 36);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.setBounds(239, 30, 56, 36);
		frame.getContentPane().add(btnNewButton_15);
		
		
	}
}
