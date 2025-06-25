
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

public class MarksDB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	DefaultTableModel model;
	private JTable table;
	private JTextField ID;
	private JTextField MMarks;
	private JTextField SMarks;
	private JTextField FMarks;
	private JTextField getcourse;
	private JTextField getcourseL;
	private JTextField IDL;
	private JTextField MMarksL;
	private JTextField SMarksL;
	private JTextField FMarksL;
	JLabel Fname;
	JLabel FID;
	JLabel courseth;
	JLabel courselab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarksDB frame = new MarksDB();
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
	public MarksDB() {
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
		scrollPane.setBounds(38, 120, 646, 500);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		model=new DefaultTableModel();
		Object[] column = {"Student ID","Student Name","Father Name","Department"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(736, 164, 86, 22);
		panel.add(lblNewLabel);
		
		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.BOLD, 12));
		ID.setBounds(843, 164, 154, 22);
		panel.add(ID);
		ID.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ID.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Enter Student ID");
				}
				else 
				{
					String gcourse=getcourse.getText();
					String id=ID.getText();
					
					// Convert string values to float
					float midm=Float.parseFloat(MMarks.getText());
					float sessm=Float.parseFloat(SMarks.getText());
					float fim=Float.parseFloat(FMarks.getText());
					
					// Calculate total marks
					float totalMarks = midm + sessm + fim;
					float gpa=(float) 0.0;
					
					// GPA
					if(totalMarks<60)
					{
						gpa=Float.parseFloat("0.0");
					}
					else if(totalMarks>=60 && totalMarks<=63)
					{
						gpa=Float.parseFloat("1.67");
					}
					else if(totalMarks>=64 && totalMarks<=67)
					{
						gpa=Float.parseFloat("2.0");
					}
					else if(totalMarks>=68 && totalMarks<=71)
					{
						gpa=Float.parseFloat("2.33");
					}
					else if(totalMarks>=72 && totalMarks<=76)
					{
						gpa=Float.parseFloat("2.67");
					}
					else if(totalMarks>=77 && totalMarks<=81)
					{
						gpa=Float.parseFloat("3.0");
					}
					else if(totalMarks>=82.5 && totalMarks<=86)
					{
						gpa=Float.parseFloat("3.33");
					}
					else if(totalMarks>=87 && totalMarks<=92)
					{
						gpa=Float.parseFloat("3.67");
					}
					else if (totalMarks>=93 && totalMarks<=100)
					{
						gpa=Float.parseFloat("4.0");
					}

					
					
					
					try 
					{
						Conn c=new Conn();	//Object class Conn Database
						String query = "INSERT INTO thmarks VALUES ('" + id + "','" + gcourse + "','" + midm + "','" + sessm + "','" + fim + "','" + totalMarks + "','" + gpa + "')";
						c.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Marks Inserted");
					} 
					catch (SQLException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
				}
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(844, 350, 85, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Insert Marks");
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 40));
		lblNewLabel_1.setBounds(449, 10, 341, 48);
		panel.add(lblNewLabel_1);
		
		JLabel MidMarks = new JLabel("Mid Marks");
		MidMarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		MidMarks.setBounds(736, 201, 86, 22);
		panel.add(MidMarks);
		
		JLabel Sessionals = new JLabel("Sessionals");
		Sessionals.setFont(new Font("Tahoma", Font.BOLD, 14));
		Sessionals.setBounds(736, 240, 86, 22);
		panel.add(Sessionals);
		
		JLabel FinalMarks = new JLabel("Final Marks");
		FinalMarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		FinalMarks.setBounds(736, 280, 86, 22);
		panel.add(FinalMarks);
		
		MMarks = new JTextField();
		MMarks.setText("0");
		MMarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		MMarks.setColumns(10);
		MMarks.setBounds(843, 201, 154, 22);
		panel.add(MMarks);
		
		SMarks = new JTextField();
		SMarks.setText("0");
		SMarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		SMarks.setColumns(10);
		SMarks.setBounds(843, 240, 154, 22);
		panel.add(SMarks);
		
		FMarks = new JTextField();
		FMarks.setText("0");
		FMarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		FMarks.setColumns(10);
		FMarks.setBounds(843, 280, 154, 22);
		panel.add(FMarks);
		
		JLabel Course = new JLabel("Course");
		Course.setFont(new Font("Tahoma", Font.BOLD, 14));
		Course.setBounds(736, 120, 86, 22);
		panel.add(Course);
		
		getcourse = new JTextField();
		getcourse.setText("Database(Th)");
		getcourse.setFont(new Font("Tahoma", Font.BOLD, 12));
		getcourse.setColumns(10);
		getcourse.setBounds(843, 120, 154, 22);
		panel.add(getcourse);
		
		JLabel CourseL = new JLabel("Course");
		CourseL.setFont(new Font("Tahoma", Font.BOLD, 14));
		CourseL.setBounds(736, 404, 86, 22);
		panel.add(CourseL);
		
		getcourseL = new JTextField();
		getcourseL.setText("Database(Lab)");
		getcourseL.setFont(new Font("Tahoma", Font.BOLD, 12));
		getcourseL.setColumns(10);
		getcourseL.setBounds(843, 404, 154, 22);
		panel.add(getcourseL);
		
		IDL = new JTextField();
		IDL.setFont(new Font("Tahoma", Font.BOLD, 12));
		IDL.setColumns(10);
		IDL.setBounds(843, 448, 154, 22);
		panel.add(IDL);
		
		JLabel lblNewLabel_2 = new JLabel("Student ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(736, 448, 86, 22);
		panel.add(lblNewLabel_2);
		
		JLabel MidMarks_1 = new JLabel("Mid Marks");
		MidMarks_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		MidMarks_1.setBounds(736, 485, 86, 22);
		panel.add(MidMarks_1);
		
		MMarksL = new JTextField();
		MMarksL.setText("0");
		MMarksL.setFont(new Font("Tahoma", Font.BOLD, 12));
		MMarksL.setColumns(10);
		MMarksL.setBounds(843, 485, 154, 22);
		panel.add(MMarksL);
		
		JLabel Sessionals_1 = new JLabel("Sessionals");
		Sessionals_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Sessionals_1.setBounds(736, 524, 86, 22);
		panel.add(Sessionals_1);
		
		SMarksL = new JTextField();
		SMarksL.setText("0");
		SMarksL.setFont(new Font("Tahoma", Font.BOLD, 12));
		SMarksL.setColumns(10);
		SMarksL.setBounds(843, 524, 154, 22);
		panel.add(SMarksL);
		
		JLabel FinalMarks_1 = new JLabel("Final Marks");
		FinalMarks_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		FinalMarks_1.setBounds(736, 564, 86, 22);
		panel.add(FinalMarks_1);
		
		FMarksL = new JTextField();
		FMarksL.setText("0");
		FMarksL.setFont(new Font("Tahoma", Font.BOLD, 12));
		FMarksL.setColumns(10);
		FMarksL.setBounds(843, 564, 154, 22);
		panel.add(FMarksL);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ID.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Enter Student ID");
				}
				else 
				{
					String gcourse=getcourseL.getText();
					String id=ID.getText();
					
					// Convert string values to float
					float midm=Float.parseFloat(MMarksL.getText());
					float sessm=Float.parseFloat(SMarksL.getText());
					float fim=Float.parseFloat(FMarksL.getText());
					
					// Calculate total marks
					float totalMarks = midm + sessm + fim;
					float gpa= (float) 0.0;
					
					// GPA
					if(totalMarks<30)
					{
						gpa=(float) 0.0;
					}	
					else if(totalMarks>=30 && totalMarks<=31)
					{
						gpa=(float) 1.67;
					}
					else if(totalMarks>=32 && totalMarks<=34)
					{
						gpa=(float) 2.0;
					}
					else if(totalMarks>=35 && totalMarks<=36)
					{
						gpa=(float) 2.3;
					}
					else if(totalMarks>=37 && totalMarks<=38)
					{
						gpa=(float) 2.67;
					}
					else if(totalMarks>=39 && totalMarks<=41)
					{
						gpa=(float) 3.0;
					}
					else if(totalMarks>=42 && totalMarks<=43)
					{
						gpa=(float) 3.33;
					}
					else if(totalMarks>=44 && totalMarks<=45)
					{
						gpa=(float) 3.67;
					}
					else if (totalMarks>=46 && totalMarks<=50)
					{
					    gpa=(float) 4.0;
					}

					
					try 
					{
						Conn c=new Conn();	//Object class Conn Database
						String query = "INSERT INTO labmarks VALUES ('" + id + "','" + gcourse + "','" + midm + "','" + sessm + "','" + fim + "','" + totalMarks + "','" + gpa + "')";
						c.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Marks Inserted");
					} 
					catch (SQLException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(844, 600, 85, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Faculty ID");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 20, 94, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Faculty Name");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(10, 52, 94, 22);
		panel.add(lblNewLabel_3_1);
		
		FID = new JLabel("");
		FID.setFont(new Font("Tahoma", Font.BOLD, 14));
		FID.setBounds(124, 20, 86, 22);
		panel.add(FID);
		
		Fname = new JLabel("");
		Fname.setFont(new Font("Tahoma", Font.BOLD, 14));
		Fname.setBounds(124, 52, 161, 22);
		panel.add(Fname);
		
		JLabel lblNewLabel_3_2 = new JLabel("Course");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(769, 10, 73, 64);
		panel.add(lblNewLabel_3_2);
		
		courseth = new JLabel("");
		courseth.setFont(new Font("Tahoma", Font.BOLD, 14));
		courseth.setBounds(877, 10, 161, 22);
		panel.add(courseth);
		
		courselab = new JLabel("");
		courselab.setFont(new Font("Tahoma", Font.BOLD, 14));
		courselab.setBounds(877, 36, 161, 22);
		panel.add(courselab);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	FacultyLogin obj=new FacultyLogin();
					obj.main(null);;
					//obj.setVisible(true);
					dispose();
			    }
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(953, 650, 90, 30);
		panel.add(btnNewButton_2);
		
		
		try 
		{
		
			Conn c=new Conn();	//Object class Conn Database
			String query="SELECT std_id, std_name, std_fname, department_name from student join departments using(department_id)";
			ResultSet rs= c.s.executeQuery(query);
			
			while(rs.next()) 
			{
				
				String id=rs.getString("Std_ID");
				String name=rs.getString("Std_Name");
				String fname=rs.getString("Std_Fname");
				String dpt=rs.getString("Department_name");
				
				String tbData[]= {id, name, fname, dpt};
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				
				tblModel.addRow(tbData);
				
			}
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		try 
		{
		
			Conn c=new Conn();	//Object class Conn Database
			String query="SELECT faculty_id, faculty_name, course_name from faculty join courses using(course_id) where course_id=42";
			ResultSet rs= c.s.executeQuery(query);
			
			//Lab course
			Conn c1=new Conn();	//Object class Conn Database
			String query1="SELECT course_name from courses where course_id=421";
			ResultSet rs1= c1.s.executeQuery(query1);
			
			while(rs.next()) 
			{
				
				String fid=rs.getString("faculty_id");
				String fname=rs.getString("faculty_name");
				String course1=rs.getString("course_name");
				String course2=rs.getString("course_name");
				
				FID.setText(fid);
				Fname.setText(fname);
				courseth.setText(course1);
					
				
			}
			
			//Lab course
			while(rs1.next()) 
			{
				
				String course2=rs1.getString("course_name");
				courselab.setText(course2);
					
				
			}
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}

