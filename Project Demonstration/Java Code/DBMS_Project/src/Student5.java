
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Student5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	DefaultTableModel model;
	private JTable table;
	String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student5 frame = new Student5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1095, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1095, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 115, 1000, 400);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		model=new DefaultTableModel();
		Object[] column = {"Student ID","Course","Mid Marks","Sessional Marks", "Final Marks", "Total Marks", "GPA"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Student Portal");
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 40));
		lblNewLabel_1.setBounds(449, 15, 341, 48);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Show Results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
				
					Conn c=new Conn();	//Object class Conn Database
					String query="SELECT * from thmarks where std_id=105";
					ResultSet rs= c.s.executeQuery(query);
					
					while(rs.next()) 
					{
						
						String id=rs.getString("Std_ID");
						String course=rs.getString("Course");
						String mmarks=rs.getString("Mid_Marks");
						String smarks=rs.getString("Sessional_Marks");
						String fmarks=rs.getString("Final_Marks");
						String tmarks=rs.getString("Total_Marks");
						String gpa=rs.getString("gpa");
						
						String tbData[]= {id, course, mmarks, smarks, fmarks, tmarks, gpa};
						DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
						
						tblModel.addRow(tbData);
						
					}
					
					
					//Lab Marks
					Conn c1=new Conn();	//Object class Conn Database
					String query1="SELECT * from labmarks where std_id=105";
					ResultSet rs1= c.s.executeQuery(query1);
					
					while(rs1.next()) 
					{
						
						String id=rs1.getString("Std_ID");
						String course=rs1.getString("Course");
						String mmarks=rs1.getString("Mid_Marks");
						String smarks=rs1.getString("Sessional_Marks");
						String fmarks=rs1.getString("Final_Marks");
						String tmarks=rs1.getString("Total_Marks");
						String gpa=rs1.getString("gpa");
						
						String tbData[]= {id, course, mmarks, smarks, fmarks, tmarks, gpa};
						DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
						
						tblModel.addRow(tbData);
						
					}
					
				}

				catch(Exception e1)
				{
					e1.printStackTrace();
				}
						

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(90, 555, 140, 40);
		panel.add(btnNewButton);
		
		JLabel LaSID = new JLabel("ID");
		LaSID.setFont(new Font("Tahoma", Font.BOLD, 20));
		LaSID.setBounds(38, 25, 50, 17);
		panel.add(LaSID);
		
		JLabel LaSName = new JLabel("Name");
		LaSName.setFont(new Font("Tahoma", Font.BOLD, 20));
		LaSName.setBounds(38, 70, 70, 17);
		panel.add(LaSName);
		
		JLabel LaGpa = new JLabel("CGPA");
		LaGpa.setFont(new Font("Tahoma", Font.BOLD, 20));
		LaGpa.setBounds(850, 40, 60, 30);
		panel.add(LaGpa);
		
		JLabel SID = new JLabel("");
		SID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SID.setBounds(125, 20, 200, 30);
		panel.add(SID);
		
		JLabel SNAME = new JLabel("");
		SNAME.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SNAME.setBounds(118, 61, 200, 30);
		panel.add(SNAME);
		
		JLabel gpa = new JLabel("");
		gpa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gpa.setBounds(930, 41, 100, 25);
		panel.add(gpa);
		
		JButton btnNewButton_1 = new JButton("Show");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Theory GPA Variables
				float gp1=(float) 0.0;
				float gp2=(float) 0.0;
				float gp3=(float) 0.0;
				float gp4=(float) 0.0;
				float gp5=(float) 0.0;
				float storegp=(float) 0.0;
				
				//Lab GPA Variables
				float lgp1=(float) 0.0;
				float lgp2=(float) 0.0;
				float lgp3=(float) 0.0;
				float lstoregp=(float) 0.0;
				
				//Theory and Lab GPA sum
				float sumgp=(float) 0.0;
				
				//CGPA fetch
				float cgpa=(float) 0.0;
				
				try 
				{
					
					//Theory GPA
					Conn c=new Conn();	//Object class Conn Database
					String query="SELECT gpa from thmarks where std_id=105";
					ResultSet rs= c.s.executeQuery(query);
					
					
					while(rs.next()) 
					{
						if(gp1==0.0)
						{	
							gp1=Float.parseFloat(rs.getString("gpa"));
						}
						else if(gp2==0.0)
						{	
							gp2=Float.parseFloat(rs.getString("gpa"));
						}
						else if(gp3==0.0)
						{	
							gp3=Float.parseFloat(rs.getString("gpa"));
						}
						else if(gp4==0.0)
						{	
							gp4=Float.parseFloat(rs.getString("gpa"));
						}
						else if(gp5==0.0)
						{	
							gp5=Float.parseFloat(rs.getString("gpa"));
						}
										
					}
					
							storegp=(3*gp1)+(3*gp2)+(3*gp3)+(3*gp4)+(3*gp5);
							
						//Lab GPA
						Conn c1=new Conn();	//Object class Conn Database
						String query1="SELECT gpa from labmarks where std_id=105";
						ResultSet rs1= c1.s.executeQuery(query1);
						
						
						while(rs1.next()) 
						{
							if(lgp1==0.0)
							{	
								lgp1=Float.parseFloat(rs1.getString("gpa"));
							}
							else if(lgp2==0.0)
							{	
								lgp2=Float.parseFloat(rs1.getString("gpa"));
							}
							else if(lgp3==0.0)
							{	
								lgp3=Float.parseFloat(rs1.getString("gpa"));
							}
											
						}
						
								lstoregp=(1*lgp1)+(1*lgp2)+(1*lgp3);
								
								
								sumgp=(storegp+lstoregp)/18;
								
								
						//CGPA Inserted		
						Conn c2=new Conn();	//Object class Conn Database
						String query2 = "INSERT INTO cgpa VALUES ('" + id + "','" + sumgp + "')";
						c2.s.executeUpdate(query2);
						//JOptionPane.showMessageDialog(null, "GPA Inserted");
						
						
						
						//CGPA fetch
						Conn c3=new Conn();	//Object class Conn Database
						String query3="SELECT gpa from cgpa where std_id=105";
						ResultSet rs3= c3.s.executeQuery(query3);
						
						
						while(rs3.next()) 
						{
							String gppaa=rs3.getString("gpa");
							//cgpa=Float.parseFloat(rs3.getString("gpa"));
							gpa.setText(gppaa);
							
						}
								
							
					
				}

				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(908, 80, 75, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	StudentLogin obj=new StudentLogin();
					obj.main(null);;
					//obj.setVisible(true);
					dispose();
			    }
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(953, 650, 90, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Policy");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Policy obj=new Policy();
				obj.main(null);;
				//obj.setVisible(true);
				//frame.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(38, 650, 90, 30);
		panel.add(btnNewButton_3);
		
		try 
		{
		
			Conn c=new Conn();	//Object class Conn Database
			String query="SELECT Std_ID, Std_Name from student where std_id=105";
			ResultSet rs= c.s.executeQuery(query);
			
			while(rs.next()) 
			{
				
				id=rs.getString("Std_ID");
				String name=rs.getString("Std_Name");
			
				SID.setText(id);
				SNAME.setText(name);
				
			}
			
		}

		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
			
	}
}

