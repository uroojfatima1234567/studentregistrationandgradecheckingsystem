

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class Policy extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Policy frame = new Policy();
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
	public Policy() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	//	ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		//ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Icon1.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(0, -36, 470, 759);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel(" GradingPolicy");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(140, 50, 190, 35);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(" Grades");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_3_1.setBounds(10, 176, 86, 35);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel(" GPA");
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_3_1_1.setBounds(181, 176, 86, 35);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel(" Percentage ");
		lblNewLabel_3_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_3_1_1_1.setBounds(334, 176, 126, 35);
		panel_2.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel(" A");
		lblNewLabel_3_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2.setBounds(10, 233, 86, 35);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel(" A-");
		lblNewLabel_3_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_1.setBounds(10, 279, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_1_2_2 = new JLabel(" B+");
		lblNewLabel_3_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2.setBounds(10, 325, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2);
		
		JLabel lblNewLabel_3_1_2_2_1 = new JLabel(" B");
		lblNewLabel_3_1_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1.setBounds(10, 371, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1);
		
		JLabel lblNewLabel_3_1_2_2_1_1 = new JLabel(" B-");
		lblNewLabel_3_1_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_1.setBounds(10, 417, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_1);
		
		JLabel lblNewLabel_3_1_2_2_1_2 = new JLabel("C+");
		lblNewLabel_3_1_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_2.setBounds(10, 463, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_2);
		
		JLabel lblNewLabel_3_1_2_2_1_3 = new JLabel("C");
		lblNewLabel_3_1_2_2_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_3.setBounds(10, 509, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_3);
		
		JLabel lblNewLabel_3_1_2_2_1_4 = new JLabel("C-");
		lblNewLabel_3_1_2_2_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_4.setBounds(10, 555, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_4);
		
		JLabel lblNewLabel_3_1_2_2_1_5 = new JLabel("  4.0");
		lblNewLabel_3_1_2_2_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5.setBounds(181, 233, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5);
		
		JLabel lblNewLabel_3_1_2_2_1_5_1 = new JLabel("  3.67");
		lblNewLabel_3_1_2_2_1_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_1.setBounds(181, 279, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_1);
		
		JLabel lblNewLabel_3_1_2_2_1_5_2 = new JLabel(" 3.33");
		lblNewLabel_3_1_2_2_1_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_2.setBounds(181, 325, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_2);
		
		JLabel lblNewLabel_3_1_2_2_1_5_3 = new JLabel(" 2.67");
		lblNewLabel_3_1_2_2_1_5_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_3.setBounds(181, 417, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_3);
		
		JLabel lblNewLabel_3_1_2_2_1_5_4 = new JLabel(" 2.3");
		lblNewLabel_3_1_2_2_1_5_4.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_4.setBounds(181, 463, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_4);
		
		JLabel lblNewLabel_3_1_2_2_1_5_5 = new JLabel(" 2.0");
		lblNewLabel_3_1_2_2_1_5_5.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_5.setBounds(181, 509, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_5);
		
		JLabel lblNewLabel_3_1_2_2_1_5_6 = new JLabel("  1.67");
		lblNewLabel_3_1_2_2_1_5_6.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_6.setBounds(168, 555, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_6);
		
		JLabel lblNewLabel_3_1_2_2_1_5_7 = new JLabel("  0.0");
		lblNewLabel_3_1_2_2_1_5_7.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_7.setBounds(178, 601, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_7);
		
		JLabel lblNewLabel_3_1_2_2_1_5_8 = new JLabel(" F");
		lblNewLabel_3_1_2_2_1_5_8.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_8.setBounds(10, 601, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_8);
		
		JLabel lblNewLabel_3_1_2_2_1_5_9 = new JLabel(" 4.0");
		lblNewLabel_3_1_2_2_1_5_9.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_9.setBounds(181, 371, 86, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_9);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11 = new JLabel("  93 and above");
		lblNewLabel_3_1_2_2_1_5_11.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11.setBounds(324, 233, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1 = new JLabel("  87-92");
		lblNewLabel_3_1_2_2_1_5_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1.setBounds(324, 279, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_1 = new JLabel(" 82-86");
		lblNewLabel_3_1_2_2_1_5_11_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_1.setBounds(334, 325, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_1);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_2 = new JLabel(" 77-81");
		lblNewLabel_3_1_2_2_1_5_11_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_2.setBounds(334, 371, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_2);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_3 = new JLabel("  72-76");
		lblNewLabel_3_1_2_2_1_5_11_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_3.setBounds(334, 417, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_3);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_3_1 = new JLabel("  68-71");
		lblNewLabel_3_1_2_2_1_5_11_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_3_1.setBounds(334, 463, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_3_1);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_3_2 = new JLabel("  64-67");
		lblNewLabel_3_1_2_2_1_5_11_1_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_3_2.setBounds(334, 516, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_3_2);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_3_3 = new JLabel("  60-63");
		lblNewLabel_3_1_2_2_1_5_11_1_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_3_3.setBounds(334, 555, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_3_3);
		
		JLabel lblNewLabel_3_1_2_2_1_5_11_1_3_4 = new JLabel("  0-59");
		lblNewLabel_3_1_2_2_1_5_11_1_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_11_1_3_4.setBounds(334, 601, 126, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_11_1_3_4);
		
		JLabel lblNewLabel_3_1_2_2_1_5_10_1 = new JLabel("The following grades are applied on students per-");
		lblNewLabel_3_1_2_2_1_5_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_10_1.setBounds(10, 97, 450, 35);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_10_1);
		
		JLabel lblNewLabel_3_1_2_2_1_5_10_2 = new JLabel("formance and then computed gpa. ");
		lblNewLabel_3_1_2_2_1_5_10_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3_1_2_2_1_5_10_2.setBounds(10, 131, 420, 28);
		panel_2.add(lblNewLabel_3_1_2_2_1_5_10_2);
		
		JLabel lblNewLabel_1 = new JLabel(" Close");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
			{
			}			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 37, 63, 28);
		panel_2.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 358, 450, 48);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 404, 450, 48);
		panel_2.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 450, 450, 35);
		panel_2.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 496, 450, 48);
		panel_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 542, 450, 48);
		panel_2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 588, 450, 2);
		panel_2.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 263, 450, 66);
		panel_2.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(-1, 307, 461, 35);
		panel_2.add(separator_7);
	
	}
}


