
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

public class CourseEnroll extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	DefaultTableModel model;
	private JTable table;
	private JTextField ID;
	JComboBox comboBox1;
	JComboBox comboBox2;
	JComboBox comboBox3;
	JComboBox comboBox4;
	JComboBox comboBox5;
	JComboBox comboBox6;
	JComboBox comboBox7;
	JComboBox comboBox8;
	JComboBox comboBox9;
	String id1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseEnroll frame = new CourseEnroll();
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
	public CourseEnroll() {
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
		scrollPane.setBounds(38, 68, 646, 500);
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
		lblNewLabel.setBounds(737, 93, 86, 22);
		panel.add(lblNewLabel);
		
		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.BOLD, 12));
		ID.setBounds(844, 93, 154, 22);
		panel.add(ID);
		ID.setColumns(10);
		
		JButton btnNewButton = new JButton("Enroll");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ID.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Enter Student ID");
				}
				else 
				{
					String id=ID.getText();
					String box1=(String) comboBox1.getSelectedItem();
					String box2=(String) comboBox2.getSelectedItem();
					String box3=(String) comboBox3.getSelectedItem();
					String box4=(String) comboBox4.getSelectedItem();
					String box5=(String) comboBox5.getSelectedItem();
					String box6=(String) comboBox6.getSelectedItem();
					String box7=(String) comboBox7.getSelectedItem();
					String box8=(String) comboBox8.getSelectedItem();
					String box9=(String) comboBox9.getSelectedItem();
					
					
					try 
					{
						
						
						
						
						Conn c1=new Conn();	//Object class Conn Database
						String query1="insert into EnrolledCourses values('"+id+"','"+box1+"','"+box2+"','"+box3+"','"+box4+"','"+box5+"','"+box6+"','"+box7+"','"+box8+"','"+box9+"')";
						c1.s.executeUpdate(query1);
						JOptionPane.showMessageDialog(null, "Courses Enrolled");
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
		btnNewButton.setBounds(844, 580, 85, 25);
		panel.add(btnNewButton);
		
		JLabel lblCourse = new JLabel("Course 1");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse.setBounds(739, 131, 86, 22);
		panel.add(lblCourse);
		
		JLabel lblCourse_6 = new JLabel("Course 2");
		lblCourse_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_6.setBounds(737, 175, 86, 22);
		panel.add(lblCourse_6);
		
		JLabel lblCourse_1 = new JLabel("Course 3");
		lblCourse_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_1.setBounds(737, 217, 86, 22);
		panel.add(lblCourse_1);
		
		JLabel lblCourse_2 = new JLabel("Course 4");
		lblCourse_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_2.setBounds(737, 260, 86, 22);
		panel.add(lblCourse_2);
		
		JLabel lblCourse_3 = new JLabel("Course 5");
		lblCourse_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_3.setBounds(737, 309, 86, 22);
		panel.add(lblCourse_3);
		
		JLabel lblCourse_4 = new JLabel("Course 6");
		lblCourse_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_4.setBounds(737, 357, 86, 22);
		panel.add(lblCourse_4);
		
		comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Th)", "OS(Th)", "Database(Th)", "TRW", "Linear Algebra"}));
		comboBox1.setBounds(844, 134, 154, 21);
		panel.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Th)", "OS(Th)", "Database(Th)", "TRW", "Linear Algebra"}));
		comboBox2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox2.setBounds(844, 175, 154, 21);
		panel.add(comboBox2);
		
		comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Th)", "OS(Th)", "Database(Th)", "TRW", "Linear Algebra"}));
		comboBox3.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox3.setBounds(844, 217, 154, 21);
		panel.add(comboBox3);
		
		comboBox4 = new JComboBox();
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Th)", "OS(Th)", "Database(Th)", "TRW", "Linear Algebra"}));
		comboBox4.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox4.setBounds(844, 260, 154, 21);
		panel.add(comboBox4);
		
		comboBox5 = new JComboBox();
		comboBox5.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Th)", "OS(Th)", "Database(Th)", "TRW", "Linear Algebra"}));
		comboBox5.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox5.setBounds(844, 309, 154, 21);
		panel.add(comboBox5);
		
		comboBox6 = new JComboBox();
		comboBox6.setModel(new DefaultComboBoxModel(new String[] {"Null", "TRW", "DataBase", "Linear Algebra", "Operating System", "Comp Architecture"}));
		comboBox6.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox6.setBounds(844, 357, 154, 21);
		panel.add(comboBox6);
		
		JLabel lblNewLabel_1 = new JLabel("Course Enrollment");
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 40));
		lblNewLabel_1.setBounds(449, 10, 341, 48);
		panel.add(lblNewLabel_1);
		
		comboBox7 = new JComboBox();
		comboBox7.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Lab)", "OS(Lab)", "Database(Lab)"}));
		comboBox7.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox7.setBounds(844, 409, 154, 21);
		panel.add(comboBox7);
		
		JLabel lblCourse_4_1 = new JLabel("Lab 1");
		lblCourse_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_4_1.setBounds(737, 409, 86, 22);
		panel.add(lblCourse_4_1);
		
		comboBox8 = new JComboBox();
		comboBox8.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Lab)", "OS(Lab)", "Database(Lab)"}));
		comboBox8.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox8.setBounds(844, 461, 154, 21);
		panel.add(comboBox8);
		
		JLabel lblCourse_4_2 = new JLabel("Lab 2");
		lblCourse_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_4_2.setBounds(737, 461, 86, 22);
		panel.add(lblCourse_4_2);
		
		comboBox9 = new JComboBox();
		comboBox9.setModel(new DefaultComboBoxModel(new String[] {"Null", "Cmp Arch(Lab)", "OS(Lab)", "Database(Lab)"}));
		comboBox9.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox9.setBounds(844, 510, 154, 21);
		panel.add(comboBox9);
		
		JLabel lblCourse_4_3 = new JLabel("Lab 3");
		lblCourse_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourse_4_3.setBounds(737, 510, 86, 22);
		panel.add(lblCourse_4_3);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				AdminDashboard obj=new AdminDashboard();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();	
			
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(28, 650, 90, 30);
		panel.add(btnNewButton_2);
		
		
		try 
		{
		
			Conn c=new Conn();	//Object class Conn Database
			String query="SELECT std_ID,std_name,std_fname,department_name from student s join departments d on s.department_id = d.department_id";
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
		
		
	}
}

