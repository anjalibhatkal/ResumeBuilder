import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EducationDetails {

	public JFrame frame;
	private JTextField schoolnametText;
	private JTextField schoollocText;
	private JTextField degreeText;
	private JTextField fostudyText;
	private JTextField gstartText;
	private JTextField gendText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationDetails window = new EducationDetails();
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
	public EducationDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(79, 176, 198));
		frame.getContentPane().setForeground(new Color(79, 176, 198));
		frame.setBounds(100, 100, 901, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel page2Head = new JLabel("EDUCATION INFO");
		page2Head.setBounds(305, 0, 298, 91);
		page2Head.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page2Head.setBackground(new Color(0, 0, 0));
		page2Head.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(page2Head);
		
		JLabel page2Extra = new JLabel("Tell us about your education.");
		page2Extra.setForeground(new Color(255, 255, 255));
		page2Extra.setFont(new Font("Arial", Font.PLAIN, 19));
		page2Extra.setBounds(326, 61, 250, 42);
		frame.getContentPane().add(page2Extra);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(215, 248, 254)));
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(21, 113, 843, 374);
		frame.getContentPane().add(panel);
		
		JLabel schoolNameLabel = new JLabel("School Name");
		schoolNameLabel.setForeground(Color.BLACK);
		schoolNameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		schoolNameLabel.setBackground(Color.BLACK);
		schoolNameLabel.setBounds(20, 21, 136, 31);
		panel.add(schoolNameLabel);
		
		schoolnametText = new JTextField();
		schoolnametText.setColumns(10);
		schoolnametText.setBounds(20, 48, 373, 31);
		panel.add(schoolnametText);
		
		JLabel SchoolLocationLabel = new JLabel("School Location");
		SchoolLocationLabel.setForeground(Color.BLACK);
		SchoolLocationLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		SchoolLocationLabel.setBackground(Color.BLACK);
		SchoolLocationLabel.setBounds(403, 21, 136, 31);
		panel.add(SchoolLocationLabel);
		
		schoollocText = new JTextField();
		schoollocText.setColumns(10);
		schoollocText.setBounds(403, 48, 415, 31);
		panel.add(schoollocText);
		
		JLabel degreeLabel = new JLabel("Degree\r\n");
		degreeLabel.setForeground(Color.BLACK);
		degreeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		degreeLabel.setBackground(Color.BLACK);
		degreeLabel.setBounds(20, 89, 92, 31);
		panel.add(degreeLabel);
		
		degreeText = new JTextField();
		degreeText.setColumns(10);
		degreeText.setBounds(20, 118, 798, 31);
		panel.add(degreeText);
		
		JLabel fieldOfStudyLabel = new JLabel("Field of Study");
		fieldOfStudyLabel.setForeground(Color.BLACK);
		fieldOfStudyLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		fieldOfStudyLabel.setBackground(Color.BLACK);
		fieldOfStudyLabel.setBounds(20, 159, 164, 31);
		panel.add(fieldOfStudyLabel);
		
		fostudyText = new JTextField();
		fostudyText.setColumns(10);
		fostudyText.setBounds(20, 187, 798, 31);
		panel.add(fostudyText);
		
		gstartText = new JTextField();
		gstartText.setColumns(10);
		gstartText.setBounds(20, 254, 374, 31);
		panel.add(gstartText);
		
		JLabel gdstartDate = new JLabel("Graduation Start Date");
		gdstartDate.setForeground(Color.BLACK);
		gdstartDate.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		gdstartDate.setBackground(Color.BLACK);
		gdstartDate.setBounds(21, 228, 209, 31);
		panel.add(gdstartDate);
		
		JLabel graduationEndDateLabel = new JLabel("Graduation End Date");
		graduationEndDateLabel.setForeground(Color.BLACK);
		graduationEndDateLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		graduationEndDateLabel.setBackground(Color.BLACK);
		graduationEndDateLabel.setBounds(404, 228, 170, 31);
		panel.add(graduationEndDateLabel);
		
		gendText = new JTextField();
		gendText.setColumns(10);
		gendText.setBounds(404, 254, 415, 31);
		panel.add(gendText);
		
		JButton backButton2 = new JButton("BACK");
		backButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButton2.setForeground(Color.BLACK);
		backButton2.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton2.setBackground(new Color(215, 248, 254));
		backButton2.setBounds(149, 314, 171, 38);
		panel.add(backButton2);
		
		JButton nextButton2 = new JButton("NEXT");
		nextButton2.setForeground(Color.BLACK);
		nextButton2.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton2.setBackground(new Color(215, 248, 254));
		nextButton2.setBounds(511, 314, 171, 38);
		panel.add(nextButton2);
		
		JButton exitButton2 = new JButton("EXIT");
		exitButton2.setForeground(Color.BLACK);
		exitButton2.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton2.setBackground(new Color(215, 248, 254));
		exitButton2.setBounds(330, 314, 171, 38);
		panel.add(exitButton2);
	}
}
