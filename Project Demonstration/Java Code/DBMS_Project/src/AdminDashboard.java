

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


public class AdminDashboard {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.

	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
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
	public AdminDashboard() {
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
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Lock.png"));
		
		JButton btnNewButton_1_1 = new JButton("Log Out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	AdminLogin obj=new AdminLogin();
					obj.main(null);;
					//obj.setVisible(true);
					frame.dispose();
			    }
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(975, 655, 90, 30);
		frame.getContentPane().add(btnNewButton_1_1);
				
		JLabel lblNewLabel_3 = new JLabel("Admin Dashboard");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 34));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(450, 50, 300, 50);
		frame.getContentPane().add(lblNewLabel_3);
						
		JButton btnNewButton = new JButton("Student Account");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
					    	StudentAccount obj=new StudentAccount();
							obj.main(null);;
							//obj.setVisible(true);
							//frame.dispose();		
				
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(450, 320, 290, 40);
		frame.getContentPane().add(btnNewButton);
								
		JButton btnReset = new JButton("Course Enroll");
		btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			CourseEnroll obj=new CourseEnroll();
			obj.main(null);;
			//obj.setVisible(true);
			frame.dispose();
			
		}
		});	
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(450, 250, 290, 40);
		frame.getContentPane().add(btnReset);
										
		JButton btnCancel = new JButton("Faculty Account");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		    	FacultyAccount obj=new FacultyAccount();
				obj.main(null);;
				//obj.setVisible(true);
				//frame.dispose();		
	
			
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnCancel.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnCancel.setBounds(450, 390, 290, 40);
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
