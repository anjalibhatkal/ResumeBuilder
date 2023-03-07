import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LanguagesInfo {

	private JFrame frame;
	private JTextField lang1text;
	private JTextField lang2text;
	private JTextField lang3text;
	private JTextField lang4text;
	private JTextField lang5text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LanguagesInfo window = new LanguagesInfo();
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
	public LanguagesInfo() {
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
		
		JLabel page5extra = new JLabel("Add the languages that you know.");
		page5extra.setForeground(Color.WHITE);
		page5extra.setFont(new Font("Arial", Font.PLAIN, 19));
		page5extra.setBounds(295, 46, 316, 42);
		frame.getContentPane().add(page5extra);
		
		JLabel page5label = new JLabel("LANGUAGES");
		page5label.setForeground(Color.BLACK);
		page5label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page5label.setBackground(Color.BLACK);
		page5label.setBounds(327, 10, 214, 55);
		frame.getContentPane().add(page5label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(16, 90, 856, 409);
		frame.getContentPane().add(panel);
		
		JLabel lang1 = new JLabel("Language");
		lang1.setForeground(Color.BLACK);
		lang1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang1.setBackground(Color.BLACK);
		lang1.setBounds(25, 10, 79, 31);
		panel.add(lang1);
		
		lang1text = new JTextField();
		lang1text.setColumns(10);
		lang1text.setBounds(25, 41, 620, 38);
		panel.add(lang1text);
		
		JLabel lang2 = new JLabel("Language");
		lang2.setForeground(Color.BLACK);
		lang2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang2.setBackground(Color.BLACK);
		lang2.setBounds(25, 80, 79, 31);
		panel.add(lang2);
		
		lang2text = new JTextField();
		lang2text.setColumns(10);
		lang2text.setBounds(25, 110, 620, 38);
		panel.add(lang2text);
		
		JLabel lang3 = new JLabel("Language");
		lang3.setForeground(Color.BLACK);
		lang3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang3.setBackground(Color.BLACK);
		lang3.setBounds(25, 161, 79, 31);
		panel.add(lang3);
		
		lang3text = new JTextField();
		lang3text.setColumns(10);
		lang3text.setBounds(25, 192, 620, 38);
		panel.add(lang3text);
		
		JLabel lang4 = new JLabel("Language");
		lang4.setForeground(Color.BLACK);
		lang4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang4.setBackground(Color.BLACK);
		lang4.setBounds(25, 240, 79, 31);
		panel.add(lang4);
		
		lang4text = new JTextField();
		lang4text.setColumns(10);
		lang4text.setBounds(25, 271, 620, 38);
		panel.add(lang4text);
		
		JLabel lang5 = new JLabel("Language");
		lang5.setForeground(Color.BLACK);
		lang5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang5.setBackground(Color.BLACK);
		lang5.setBounds(25, 318, 79, 31);
		panel.add(lang5);
		
		lang5text = new JTextField();
		lang5text.setColumns(10);
		lang5text.setBounds(25, 349, 620, 38);
		panel.add(lang5text);
		
		JButton exitButton5 = new JButton("EXIT");
		exitButton5.setForeground(Color.BLACK);
		exitButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton5.setBackground(new Color(215, 248, 254));
		exitButton5.setBounds(663, 349, 171, 38);
		panel.add(exitButton5);
		
		JButton nextButton5 = new JButton("NEXT");
		nextButton5.setForeground(Color.BLACK);
		nextButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton5.setBackground(new Color(215, 248, 254));
		nextButton5.setBounds(663, 295, 171, 38);
		panel.add(nextButton5);
		
		JButton backButton5 = new JButton("BACK");
		backButton5.setForeground(Color.BLACK);
		backButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton5.setBackground(new Color(215, 248, 254));
		backButton5.setBounds(663, 242, 171, 38);
		panel.add(backButton5);
		
		JButton addButton5 = new JButton("ADD");
		addButton5.setForeground(Color.BLACK);
		addButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		addButton5.setBackground(new Color(215, 248, 254));
		addButton5.setBounds(663, 189, 171, 38);
		panel.add(addButton5);
	}
}
