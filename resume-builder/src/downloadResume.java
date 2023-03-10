import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;

public class downloadResume implements ActionListener{

	public JFrame frame6;
	private JTextField fileNameText;
	private JLabel page6label, filenamelabel;
	private JPanel panel;
	private JButton exitButton6, dwldbutton6;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					downloadResume window = new downloadResume();
					window.frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public downloadResume() {
		initialize();
	}

	// Initialize the contents of the frame6.
	private void initialize() {
		frame6 = new JFrame();
		frame6.getContentPane().setBackground(new Color(79, 176, 198));
		frame6.setBounds(100, 100, 455, 246);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		
		page6label = new JLabel("DOWNLOAD");
		page6label.setForeground(Color.BLACK);
		page6label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page6label.setBackground(Color.BLACK);
		page6label.setBounds(122, 0, 214, 55);
		frame6.getContentPane().add(page6label);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(8, 55, 425, 139);
		frame6.getContentPane().add(panel);
		
		exitButton6 = new JButton("EXIT");
		exitButton6.setForeground(Color.BLACK);
		exitButton6.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton6.setBackground(new Color(215, 248, 254));
		exitButton6.setBounds(211, 87, 171, 38);
		panel.add(exitButton6);
		
		dwldbutton6 = new JButton("DOWNLOAD");
		dwldbutton6.setForeground(Color.BLACK);
		dwldbutton6.setFont(new Font("Arial", Font.PLAIN, 19));
		dwldbutton6.setBackground(new Color(215, 248, 254));
		dwldbutton6.setBounds(30, 87, 171, 38);
		panel.add(dwldbutton6);
		
		fileNameText = new JTextField();
		fileNameText.setBounds(10, 38, 399, 38);
		panel.add(fileNameText);
		fileNameText.setColumns(10);
		
		filenamelabel = new JLabel("File Name");
		filenamelabel.setForeground(Color.BLACK);
		filenamelabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		filenamelabel.setBackground(Color.BLACK);
		filenamelabel.setBounds(10, 10, 79, 31);
		panel.add(filenamelabel);
		
		// adding action listeners to the buttons for a click event
		dwldbutton6.addActionListener(this);
		exitButton6.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e6) {
		if (e6.getSource() == exitButton6) {
			System.exit(0);
		}
		else if (e6.getSource() == dwldbutton6) {
			// to download pdf
			InfoPage ip2 = new InfoPage();
			EducationDetails ed2 = new EducationDetails();
			WorkInfo wi2 = new WorkInfo();
			SkillsInfo si2 = new SkillsInfo();
			LanguagesInfo li2 = new LanguagesInfo();
			
			try {
				hii.Generate_Pdf(ip2.fnameString, ip2.lnameString, ip2.profString, ip2.cityString, ip2.stateString, ip2.zipCode, ip2.phoneNumber, ip2.emailString, si2.skill1String, si2.skill2String, si2.skill3String, si2.skill4String, si2.skill5String, li2.lang1String, li2.lang2String, li2.lang3String, li2.lang4String, li2.lang5String, wi2.jobString, wi2.employerString, wi2.cityworkString, wi2.stateworkString, wi2.jobstartString, wi2.jobendString, wi2.workdesString, ed2.schoolnameString, ed2.schoollocString, ed2.degreeString, ed2.fosString, ed2.gstartString, ed2.gendString);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			String path = "anki.pdf";
//	        File file = new File(path);
//            try {
//                Desktop.getDesktop().open(file);
//            }
//            catch (java.io.IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
