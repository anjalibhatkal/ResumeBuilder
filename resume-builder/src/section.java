import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

public class MyResume extends JFrame {
	MyResume(){
		setLayout(new BorderLayout());
		JLabel l1=new JLabel("My Resume Builder");
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		jp2.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		
		JLabel l2=new JLabel("Name :");
		gbc.gridx=0;
		gbc.gridy=0;
		jp2.add(l2,gbc);
		
		JTextField t2= new JTextField(15);
	}
}
