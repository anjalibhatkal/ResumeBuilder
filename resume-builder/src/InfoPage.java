import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
//import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
//import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class InfoPage implements ActionListener {

	private JFrame frame;
	private JTextField fnameText,lnameText,profText,cityText,stateText,zipcodeText,phoneText,emailText;
	private JLabel lblNewLabel,lblNewLabel_1,lnameLabel,professionLabel,phoneLabel,emailLabel;
	private JPanel panel;
	private JButton exitButton1,nextButton1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPage window = new InfoPage();
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
	public InfoPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(79, 176, 198));
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frame.setBounds(100, 100, 901, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("PERSONAL INFORMATION");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(224, 0, 439, 91);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("What is the best way for employers to contact you?");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(224, 64, 439, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(215, 248, 254)));
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(21, 116, 843, 374);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fnameLabel = new JLabel("First Name");
		fnameLabel.setBackground(new Color(0, 0, 0));
		fnameLabel.setForeground(new Color(0, 0, 0));
		fnameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		fnameLabel.setBounds(20, 21, 82, 31);
		panel.add(fnameLabel);
		
		fnameText = new JTextField();
		fnameText.setBounds(20, 48, 373, 31);
		panel.add(fnameText);
		fnameText.setColumns(10);
		
		lnameLabel = new JLabel("Last Name");
		lnameLabel.setBackground(new Color(0, 0, 0));
		lnameLabel.setForeground(new Color(0, 0, 0));
		lnameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lnameLabel.setBounds(403, 21, 82, 31);
		panel.add(lnameLabel);
		
		lnameText = new JTextField();
		lnameText.setColumns(10);
		lnameText.setBounds(403, 48, 415, 31);
		panel.add(lnameText);
		
		professionLabel = new JLabel("Profession");
		professionLabel.setBackground(new Color(0, 0, 0));
		professionLabel.setForeground(new Color(0, 0, 0));
		professionLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		professionLabel.setBounds(20, 89, 92, 31);
		panel.add(professionLabel);
		
		profText = new JTextField();
		profText.setColumns(10);
		profText.setBounds(20, 118, 798, 31);
		panel.add(profText);
		
		JLabel cityLabel = new JLabel("City/Town/District");
		cityLabel.setBackground(new Color(0, 0, 0));
		cityLabel.setForeground(new Color(0, 0, 0));
		cityLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		cityLabel.setBounds(20, 159, 164, 31);
		panel.add(cityLabel);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setBackground(new Color(0, 0, 0));
		stateLabel.setForeground(new Color(0, 0, 0));
		stateLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		stateLabel.setBounds(277, 159, 92, 31);
		panel.add(stateLabel);
		
		JLabel zipcodeLabel = new JLabel("Zip Code");
		zipcodeLabel.setBackground(new Color(0, 0, 0));
		zipcodeLabel.setForeground(new Color(0, 0, 0));
		zipcodeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		zipcodeLabel.setBounds(542, 159, 92, 31);
		panel.add(zipcodeLabel);
		
		cityText = new JTextField();
		cityText.setColumns(10);
		cityText.setBounds(20, 187, 247, 31);
		panel.add(cityText);
		
		stateText = new JTextField();
		stateText.setColumns(10);
		stateText.setBounds(277, 187, 255, 31);
		panel.add(stateText);
		
		zipcodeText = new JTextField();
		zipcodeText.setColumns(10);
		zipcodeText.setBounds(542, 187, 276, 31);
		panel.add(zipcodeText);
		
		phoneText = new JTextField();
		phoneText.setColumns(10);
		phoneText.setBounds(20, 254, 374, 31);
		panel.add(phoneText);
		
		phoneLabel = new JLabel("Phone");
		phoneLabel.setBackground(new Color(0, 0, 0));
		phoneLabel.setForeground(new Color(0, 0, 0));
		phoneLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		phoneLabel.setBounds(21, 228, 82, 31);
		panel.add(phoneLabel);
		
		emailLabel = new JLabel("Email address");
		emailLabel.setBackground(new Color(0, 0, 0));
		emailLabel.setForeground(new Color(0, 0, 0));
		emailLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		emailLabel.setBounds(404, 228, 145, 31);
		panel.add(emailLabel);
		
		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(404, 254, 415, 31);
		panel.add(emailText);
		
		exitButton1 = new JButton("EXIT");
		exitButton1.setForeground(new Color(0, 0, 0));
		exitButton1.setBackground(new Color(215, 248, 254));
		exitButton1.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton1.setBounds(222, 314, 171, 38);
		panel.add(exitButton1);
		
		nextButton1 = new JButton("NEXT");
		nextButton1.setBackground(new Color(215, 248, 254));
		nextButton1.setForeground(new Color(0, 0, 0));
		nextButton1.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton1.setBounds(403, 314, 171, 38);
		panel.add(nextButton1);
		
		exitButton1.addActionListener(this);
		nextButton1.addActionListener(this);
	}
	public void exitAction(ActionEvent e) {
		String fnameString = fnameText.getText();
		String lnameString = lnameText.getText();
		String cityString = cityText.getText();
		String stateString = stateText.getText();
		int zipCode = zipcodeText.getText();
		int phoneNumber = phoneText.getText();
		String emailString = emailText.getText();
	}
}
