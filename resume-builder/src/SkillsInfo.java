import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class SkillsInfo {

	private JFrame frame;
	private JTextField skill1text;
	private JTextField skill2text;
	private JTextField skill3text;
	private JTextField skill4text;
	private JTextField skill5text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkillsInfo window = new SkillsInfo();
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
	public SkillsInfo() {
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
		frame.getContentPane().setLayout(null);
		
		JLabel page4ExtraLabel = new JLabel("What skills do you want to highlight?");
		page4ExtraLabel.setForeground(Color.WHITE);
		page4ExtraLabel.setFont(new Font("Arial", Font.PLAIN, 19));
		page4ExtraLabel.setBounds(287, 37, 316, 42);
		frame.getContentPane().add(page4ExtraLabel);
		
		JLabel page4Label = new JLabel("SKILLS");
		page4Label.setForeground(Color.BLACK);
		page4Label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page4Label.setBackground(Color.BLACK);
		page4Label.setBounds(371, 1, 131, 55);
		frame.getContentPane().add(page4Label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(15, 89, 856, 409);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel skillsLabel = new JLabel("Skill");
		skillsLabel.setForeground(Color.BLACK);
		skillsLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		skillsLabel.setBackground(Color.BLACK);
		skillsLabel.setBounds(25, 10, 79, 31);
		panel.add(skillsLabel);
		
		skill1text = new JTextField();
		skill1text.setColumns(10);
		skill1text.setBounds(25, 41, 620, 38);
		panel.add(skill1text);
		
		JLabel lblSkill = new JLabel("Skill");
		lblSkill.setForeground(Color.BLACK);
		lblSkill.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill.setBackground(Color.BLACK);
		lblSkill.setBounds(25, 80, 79, 31);
		panel.add(lblSkill);
		
		skill2text = new JTextField();
		skill2text.setColumns(10);
		skill2text.setBounds(25, 110, 620, 38);
		panel.add(skill2text);
		
		JLabel lblSkill_1 = new JLabel("Skill");
		lblSkill_1.setForeground(Color.BLACK);
		lblSkill_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill_1.setBackground(Color.BLACK);
		lblSkill_1.setBounds(25, 161, 79, 31);
		panel.add(lblSkill_1);
		
		skill3text = new JTextField();
		skill3text.setColumns(10);
		skill3text.setBounds(25, 192, 620, 38);
		panel.add(skill3text);
		
		JLabel lblSkill_2 = new JLabel("Skill");
		lblSkill_2.setForeground(Color.BLACK);
		lblSkill_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill_2.setBackground(Color.BLACK);
		lblSkill_2.setBounds(25, 240, 79, 31);
		panel.add(lblSkill_2);
		
		skill4text = new JTextField();
		skill4text.setColumns(10);
		skill4text.setBounds(25, 271, 620, 38);
		panel.add(skill4text);
		
		JLabel lblSkill_3 = new JLabel("Skill");
		lblSkill_3.setForeground(Color.BLACK);
		lblSkill_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill_3.setBackground(Color.BLACK);
		lblSkill_3.setBounds(25, 318, 79, 31);
		panel.add(lblSkill_3);
		
		skill5text = new JTextField();
		skill5text.setColumns(10);
		skill5text.setBounds(25, 349, 620, 38);
		panel.add(skill5text);
		
		JButton exitButton4 = new JButton("EXIT");
		exitButton4.setForeground(Color.BLACK);
		exitButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton4.setBackground(new Color(215, 248, 254));
		exitButton4.setBounds(663, 349, 171, 38);
		panel.add(exitButton4);
		
		JButton nextButton4 = new JButton("NEXT");
		nextButton4.setForeground(Color.BLACK);
		nextButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton4.setBackground(new Color(215, 248, 254));
		nextButton4.setBounds(663, 295, 171, 38);
		panel.add(nextButton4);
		
		JButton backButton4 = new JButton("BACK");
		backButton4.setForeground(Color.BLACK);
		backButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton4.setBackground(new Color(215, 248, 254));
		backButton4.setBounds(663, 242, 171, 38);
		panel.add(backButton4);
		
		JButton addButton4 = new JButton("ADD");
		addButton4.setForeground(Color.BLACK);
		addButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		addButton4.setBackground(new Color(215, 248, 254));
		addButton4.setBounds(663, 189, 171, 38);
		panel.add(addButton4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
