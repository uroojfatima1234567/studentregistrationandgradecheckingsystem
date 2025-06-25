

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;


import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;


public class FacultyLogin {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField passwordField;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.

	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyLogin window = new FacultyLogin();
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
	public FacultyLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 50, 1095, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Pic2.jpg"));
		frame.getContentPane().setLayout(null);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Logo.png"));
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   	Modes obj=new Modes();
				   	obj.main(null);;
					//obj.setVisible(true);
					frame.dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(24, 651, 90, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(394, 265, 138, 58);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(394, 344, 138, 58);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtusername.setForeground(new Color(0, 0, 0));
		txtusername.setBounds(542, 277, 199, 33);
		txtusername.setBackground(SystemColor.activeCaptionBorder);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		

		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpassword.setBounds(542, 356, 199, 33);
		txtpassword.setBackground(SystemColor.activeCaptionBorder);
		frame.getContentPane().add(txtpassword);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(509, 120, 101, 102);
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Lock.png"));
		lblNewLabel_2.setIcon(img2);
				
		JLabel lblNewLabel_3 = new JLabel("Faculty Portal");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(466, 232, 212, 35);
		frame.getContentPane().add(lblNewLabel_3);
						
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String Password = txtpassword.getText();
				
				String Username = txtusername.getText();
				
				try {
					//////////////////////////////////////////////////
					Conn c=new Conn();	//Object class Conn Database
					String query="select * from faculty_login where username = '"+Username+ "' and password = '"+Password+"'";
					ResultSet rs=c.s.executeQuery(query);
					///////////////////////////////
					
					//Database
					
					if(rs.next())
					{
						
						int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log in?",
								"Confirm", JOptionPane.YES_NO_OPTION);
						 
					    if (result == JOptionPane.OK_OPTION) 
					    {
					    	if(Username.equals("601") && Password.equals("123"))
					    	{
					    		MarksCA obj=new MarksCA();
					    		obj.main(null);;
					    		//obj.setVisible(true);
					    		frame.dispose();
					    	}
					    	else if(Username.equals("602") && Password.equals("123"))
					    	{
					    		MarksOS obj=new MarksOS();
					    		obj.main(null);;
					    		//obj.setVisible(true);
					    		frame.dispose();
					    	}
					    	else if(Username.equals("603") && Password.equals("123"))
					    	{
					    		MarksDB obj=new MarksDB();
					    		obj.main(null);;
					    		//obj.setVisible(true);
					    		frame.dispose();
					    	}
					    	else if(Username.equals("604") && Password.equals("123"))
					    	{
					    		MarksTRW obj=new MarksTRW();
					    		obj.main(null);;
					    		//obj.setVisible(true);
					    		frame.dispose();
					    	}
					    	else if(Username.equals("605") && Password.equals("123"))
					    	{
					    		MarksLinear obj=new MarksLinear();
					    		obj.main(null);;
					    		//obj.setVisible(true);
					    		frame.dispose();
					    	}
					    	
					    	
					    	//Else
					    
					    }
					     
					}
					
					  else
						{
					 
							JOptionPane.showMessageDialog(null, "Invalid Username and Password");
							txtpassword.setText(null);
							txtusername.setText(null);
						}
					
				}
				
				catch(Exception h)
				{
					h.printStackTrace();
				}
			
				
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(394, 427, 85, 33);
		frame.getContentPane().add(btnNewButton);
								
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			txtpassword.setText(null);
			txtusername.setText(null);
			
		}
		});	
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(525, 427, 85, 33);
		frame.getContentPane().add(btnReset);
										
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	System.exit(0);	
			    	//dispose();
			    }
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnCancel.setBounds(656, 427, 85, 33);
		frame.getContentPane().add(btnCancel);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Mode.png"));
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Mode.png"));
		
		
		
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBackground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setBounds(10, 10, 1081, 683);
		lblNewLabel.setIcon(img);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
