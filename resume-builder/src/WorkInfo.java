import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WorkInfo {

	private JFrame frame;
	private JTextField jobText;
	private JTextField employerText;
	private JTextField cityText;
	private JTextField stateText;
	private JTextField jobstartText;
	private JTextField jobendText;
	private JTextField workdesText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkInfo window = new WorkInfo();
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
	public WorkInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(79, 176, 198));
		frame.getContentPane().setForeground(new Color(79, 176, 198));
		frame.getContentPane().setLayout(null);
		
		JLabel page3Label = new JLabel("JOB EXPERIENCE");
		page3Label.setForeground(Color.BLACK);
		page3Label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page3Label.setBackground(Color.BLACK);
		page3Label.setBounds(281, -9, 298, 91);
		frame.getContentPane().add(page3Label);
		
		JLabel page3ExtraLabel = new JLabel("Tell us about your recent work.");
		page3ExtraLabel.setForeground(Color.WHITE);
		page3ExtraLabel.setFont(new Font("Arial", Font.PLAIN, 19));
		page3ExtraLabel.setBounds(303, 50, 287, 42);
		frame.getContentPane().add(page3ExtraLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(215, 248, 254)));
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(21, 97, 843, 395);
		frame.getContentPane().add(panel);
		
		JLabel jobTitleLabel = new JLabel("Job Title");
		jobTitleLabel.setForeground(Color.BLACK);
		jobTitleLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		jobTitleLabel.setBackground(Color.BLACK);
		jobTitleLabel.setBounds(20, 21, 136, 31);
		panel.add(jobTitleLabel);
		
		jobText = new JTextField();
		jobText.setColumns(10);
		jobText.setBounds(20, 48, 373, 31);
		panel.add(jobText);
		
		JLabel employerLabel = new JLabel("Employer");
		employerLabel.setForeground(Color.BLACK);
		employerLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		employerLabel.setBackground(Color.BLACK);
		employerLabel.setBounds(403, 21, 136, 31);
		panel.add(employerLabel);
		
		employerText = new JTextField();
		employerText.setColumns(10);
		employerText.setBounds(403, 48, 415, 31);
		panel.add(employerText);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setForeground(Color.BLACK);
		cityLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		cityLabel.setBackground(Color.BLACK);
		cityLabel.setBounds(20, 89, 92, 31);
		panel.add(cityLabel);
		
		cityText = new JTextField();
		cityText.setColumns(10);
		cityText.setBounds(20, 118, 373, 31);
		panel.add(cityText);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setForeground(Color.BLACK);
		stateLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		stateLabel.setBackground(Color.BLACK);
		stateLabel.setBounds(403, 89, 164, 31);
		panel.add(stateLabel);
		
		stateText = new JTextField();
		stateText.setColumns(10);
		stateText.setBounds(403, 118, 415, 31);
		panel.add(stateText);
		
		jobstartText = new JTextField();
		jobstartText.setColumns(10);
		jobstartText.setBounds(20, 185, 374, 31);
		panel.add(jobstartText);
		
		JLabel jobstartDate = new JLabel("Start Date");
		jobstartDate.setForeground(Color.BLACK);
		jobstartDate.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		jobstartDate.setBackground(Color.BLACK);
		jobstartDate.setBounds(21, 159, 209, 31);
		panel.add(jobstartDate);
		
		JLabel jobendLabel = new JLabel("End Date");
		jobendLabel.setForeground(Color.BLACK);
		jobendLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		jobendLabel.setBackground(Color.BLACK);
		jobendLabel.setBounds(404, 159, 170, 31);
		panel.add(jobendLabel);
		
		jobendText = new JTextField();
		jobendText.setColumns(10);
		jobendText.setBounds(403, 185, 415, 31);
		panel.add(jobendText);
		
		JButton backButton3 = new JButton("BACK");
		backButton3.setForeground(Color.BLACK);
		backButton3.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton3.setBackground(new Color(215, 248, 254));
		backButton3.setBounds(149, 342, 171, 38);
		panel.add(backButton3);
		
		JButton nextButton3 = new JButton("NEXT");
		nextButton3.setForeground(Color.BLACK);
		nextButton3.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton3.setBackground(new Color(215, 248, 254));
		nextButton3.setBounds(511, 342, 171, 38);
		panel.add(nextButton3);
		
		JButton exitButton3 = new JButton("EXIT");
		exitButton3.setForeground(Color.BLACK);
		exitButton3.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton3.setBackground(new Color(215, 248, 254));
		exitButton3.setBounds(330, 342, 171, 38);
		panel.add(exitButton3);
		
		JLabel workdesLabel = new JLabel("Work Description");
		workdesLabel.setForeground(Color.BLACK);
		workdesLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		workdesLabel.setBackground(Color.BLACK);
		workdesLabel.setBounds(20, 226, 209, 31);
		panel.add(workdesLabel);
		
		workdesText = new JTextField();
		workdesText.setColumns(10);
		workdesText.setBounds(19, 252, 799, 72);
		panel.add(workdesText);
		frame.setBounds(100, 100, 901, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
