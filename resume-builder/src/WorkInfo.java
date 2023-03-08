import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class WorkInfo implements ActionListener{

	public JFrame frame3;
	private JTextField jobText, employerText, cityText, stateText, jobstartText, jobendText, workdesText;
	private JLabel page3Label, page3ExtraLabel, jobTitleLabel, employerLabel, cityLabel, stateLabel, jobstartDate, jobendLabel, workdesLabel;
	private JButton backButton3, nextButton3, exitButton3;
	public String jobString, employerString, cityworkString, stateworkString, jobstartString, jobendString, workdesString;
	private JPanel panel3;
	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkInfo window = new WorkInfo();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public WorkInfo() {
		initialize();
	}

	// Initialize the contents of the frame.
	private void initialize() {
		frame3 = new JFrame();
		frame3.getContentPane().setBackground(new Color(79, 176, 198));
		frame3.getContentPane().setForeground(new Color(79, 176, 198));
		frame3.getContentPane().setLayout(null);
		frame3.setBounds(100, 100, 901, 550);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		page3Label = new JLabel("JOB EXPERIENCE");
		page3Label.setForeground(Color.BLACK);
		page3Label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page3Label.setBackground(Color.BLACK);
		page3Label.setBounds(281, -9, 298, 91);
		frame3.getContentPane().add(page3Label);
		
		page3ExtraLabel = new JLabel("Tell us about your recent work.");
		page3ExtraLabel.setForeground(Color.WHITE);
		page3ExtraLabel.setFont(new Font("Arial", Font.PLAIN, 19));
		page3ExtraLabel.setBounds(303, 50, 287, 42);
		frame3.getContentPane().add(page3ExtraLabel);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new LineBorder(new Color(215, 248, 254)));
		panel3.setBackground(new Color(146, 207, 220));
		panel3.setBounds(21, 97, 843, 395);
		frame3.getContentPane().add(panel3);
		
		jobTitleLabel = new JLabel("Job Title");
		jobTitleLabel.setForeground(Color.BLACK);
		jobTitleLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		jobTitleLabel.setBackground(Color.BLACK);
		jobTitleLabel.setBounds(20, 21, 136, 31);
		panel3.add(jobTitleLabel);
		
		jobText = new JTextField();
		jobText.setColumns(10);
		jobText.setBounds(20, 48, 373, 31);
		panel3.add(jobText);
		
		employerLabel = new JLabel("Employer");
		employerLabel.setForeground(Color.BLACK);
		employerLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		employerLabel.setBackground(Color.BLACK);
		employerLabel.setBounds(403, 21, 136, 31);
		panel3.add(employerLabel);
		
		employerText = new JTextField();
		employerText.setColumns(10);
		employerText.setBounds(403, 48, 415, 31);
		panel3.add(employerText);
		
		cityLabel = new JLabel("City");
		cityLabel.setForeground(Color.BLACK);
		cityLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		cityLabel.setBackground(Color.BLACK);
		cityLabel.setBounds(20, 89, 92, 31);
		panel3.add(cityLabel);
		
		cityText = new JTextField();
		cityText.setColumns(10);
		cityText.setBounds(20, 118, 373, 31);
		panel3.add(cityText);
		
		stateLabel = new JLabel("State");
		stateLabel.setForeground(Color.BLACK);
		stateLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		stateLabel.setBackground(Color.BLACK);
		stateLabel.setBounds(403, 89, 164, 31);
		panel3.add(stateLabel);
		
		stateText = new JTextField();
		stateText.setColumns(10);
		stateText.setBounds(403, 118, 415, 31);
		panel3.add(stateText);
		
		jobstartText = new JTextField();
		jobstartText.setColumns(10);
		jobstartText.setBounds(20, 185, 374, 31);
		panel3.add(jobstartText);
		
		jobstartDate = new JLabel("Start Date");
		jobstartDate.setForeground(Color.BLACK);
		jobstartDate.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		jobstartDate.setBackground(Color.BLACK);
		jobstartDate.setBounds(21, 159, 209, 31);
		panel3.add(jobstartDate);
		
		jobendLabel = new JLabel("End Date");
		jobendLabel.setForeground(Color.BLACK);
		jobendLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		jobendLabel.setBackground(Color.BLACK);
		jobendLabel.setBounds(404, 159, 170, 31);
		panel3.add(jobendLabel);
		
		jobendText = new JTextField();
		jobendText.setColumns(10);
		jobendText.setBounds(403, 185, 415, 31);
		panel3.add(jobendText);
		
		backButton3 = new JButton("BACK");
		backButton3.setForeground(Color.BLACK);
		backButton3.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton3.setBackground(new Color(215, 248, 254));
		backButton3.setBounds(149, 342, 171, 38);
		panel3.add(backButton3);
		
		nextButton3 = new JButton("NEXT");
		nextButton3.setForeground(Color.BLACK);
		nextButton3.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton3.setBackground(new Color(215, 248, 254));
		nextButton3.setBounds(511, 342, 171, 38);
		panel3.add(nextButton3);
		
		exitButton3 = new JButton("EXIT");
		exitButton3.setForeground(Color.BLACK);
		exitButton3.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton3.setBackground(new Color(215, 248, 254));
		exitButton3.setBounds(330, 342, 171, 38);
		panel3.add(exitButton3);
		
		workdesLabel = new JLabel("Work Description");
		workdesLabel.setForeground(Color.BLACK);
		workdesLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		workdesLabel.setBackground(Color.BLACK);
		workdesLabel.setBounds(20, 226, 209, 31);
		panel3.add(workdesLabel);
		
		workdesText = new JTextField();
		workdesText.setColumns(10);
		workdesText.setBounds(19, 252, 799, 72);
		panel3.add(workdesText);
		
		// adding action listeners to the buttons for a click event
		backButton3.addActionListener(this);
		exitButton3.addActionListener(this);
		nextButton3.addActionListener(this);
		
		// storing the inputs to required variables
		jobString = jobText.getText();
		employerString = employerText.getText();
		cityworkString = cityText.getText();
		stateworkString = stateText.getText();
		jobstartString = jobstartText.getText();
		jobendString = jobendText.getText();
		workdesString = workdesText.getText();
	}
	@Override
	public void actionPerformed(ActionEvent e3) {
		if (e3.getSource() == exitButton3) {
			System.exit(0);
		}
		else if (e3.getSource() == nextButton3) {
			LanguagesInfo li = new LanguagesInfo();
			li.frame4.setVisible(true);
			frame3.dispose();
		}
		else if (e3.getSource()== backButton3) {
			EducationDetails ed = new EducationDetails();
			ed.frame2.setVisible(true);
			frame3.dispose();
		}
	}
}
