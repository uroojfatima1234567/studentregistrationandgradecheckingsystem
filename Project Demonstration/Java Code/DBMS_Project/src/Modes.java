

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


public class Modes{

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
					Modes window = new Modes();
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
	public Modes() {
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
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(509, 110, 101, 102);
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Lock.png"));
		lblNewLabel_2.setIcon(img2);
						
		JButton btnNewButton = new JButton("Admin login");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					     
				AdminLogin obj=new AdminLogin();
				obj.main(null);;
					//obj.setVisible(true);
				frame.dispose();
			
			
			}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(408, 238, 301, 53);
		frame.getContentPane().add(btnNewButton);
								
		JButton btnReset = new JButton("Faculty login");
		btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			FacultyLogin obj=new FacultyLogin();
			obj.main(null);;
			frame.dispose();

			
		}
		});	
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnReset.setBounds(408, 314, 301, 50);
		frame.getContentPane().add(btnReset);
										
		JButton btnCancel = new JButton("Student login");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StudentLogin obj=new StudentLogin();
				obj.main(null);;
				//obj.setVisible(true);
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCancel.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnCancel.setBounds(408, 392, 301, 50);
		frame.getContentPane().add(btnCancel);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Mode.png"));
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/mode.png"));
		
		
		
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBackground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setBounds(10, 10, 1081, 683);
		lblNewLabel.setIcon(img);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
