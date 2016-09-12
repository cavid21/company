import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
public class EmployeeÝnfo1 extends JFrame {

	private JPanel YeniQrup;
	private JTable table_5;
	private enum Bazaya_Yukle { Yukle, Yukleme };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeÝnfo1 frame = new EmployeeÝnfo1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn=null; 
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JScrollPane scrollPane_1;
	private JTextField textFieldEid;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	Bazaya_Yukle bazaya_yukle;
	public EmployeeÝnfo1() {
		bazaya_yukle = Bazaya_Yukle.Yukle;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cavid\\Downloads\\ok-icon (1).png"));
		conn=SqliteConnection.dbConnector();
		setTitle("Qrup 637.3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 485);
		YeniQrup = new JPanel();
		YeniQrup.setBackground(new Color(0, 0, 0));
		YeniQrup.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon("C:\\Users\\Cavid\\Downloads\\Hopstarter-Sleek-Xp-Basic-Ok.ico"));
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnFile.add(mnNew);
		
		JMenuItem QrupProject = new JMenuItem("Qrup Project");
		mnNew.add(QrupProject);
		
		JSeparator separator = new JSeparator();
		mnNew.add(separator);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Other");
		mnNew.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenu mnNewMenu = new JMenu("Save");
		mnFile.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save as.");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save all");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JRadioButtonMenuItem rdbtnmntmRadioButton = new JRadioButtonMenuItem("Radio Button");
		mnEdit.add(rdbtnmntmRadioButton);
		
		JCheckBoxMenuItem chckbxmntmCheckBox = new JCheckBoxMenuItem("Check Box");
		mnEdit.add(chckbxmntmCheckBox);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		YeniQrup.setForeground(Color.YELLOW);
		YeniQrup.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(YeniQrup);
		YeniQrup.setLayout(null);
		
		JButton btnLoadTable = new JButton("\u0130\u015F\u0259 q\u0259bul olunanlar\u0131n siyah\u0131s\u0131\r\n");
		btnLoadTable.setForeground(Color.BLACK);
		btnLoadTable.setBackground(Color.WHITE);
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select EID,Name,Surname,Age from EmployeeInfo";
					PreparedStatement pst=conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_4.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnLoadTable.setBounds(549, -2, 200, 27);
		YeniQrup.add(btnLoadTable);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(496, 34, 304, 323);
		YeniQrup.add(scrollPane_1);
		
		
		table_4 = new JTable();
		scrollPane_1.setViewportView(table_4);
		
		JLabel lblNewLabel = new JLabel("EID");
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setBounds(10, 37, 70, 31);
		YeniQrup.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(10, 84, 70, 31);
		YeniQrup.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBounds(10, 131, 70, 31);
		YeniQrup.add(lblSurname);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.WHITE);
		lblAge.setBounds(10, 176, 70, 31);
		YeniQrup.add(lblAge);
		
		textFieldEid = new JTextField();
		textFieldEid.setBackground(Color.WHITE);
		textFieldEid.setBounds(89, 34, 134, 36);
		YeniQrup.add(textFieldEid);
		textFieldEid.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBackground(Color.WHITE);
		textFieldName.setColumns(10);
		textFieldName.setBounds(89, 81, 134, 36);
		YeniQrup.add(textFieldName);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBackground(Color.WHITE);
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(90, 128, 134, 36);
		YeniQrup.add(textFieldSurname);
		
		textFieldAge = new JTextField();
		textFieldAge.setBackground(Color.WHITE);
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(89, 173, 134, 36);
		YeniQrup.add(textFieldAge);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.BLACK);
		btnSave.setBackground(Color.WHITE);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bazaya_yukle == Bazaya_Yukle.Yukle)
				{
					try {
						String query="insert into EmployeeInfo (EID,Name,Surname,Age) values (?,?,?,?)";
						PreparedStatement pst=conn.prepareStatement(query);
						pst.setString(1,textFieldEid.getText());
						pst.setString(2,textFieldName.getText());
						pst.setString(3,textFieldSurname.getText());
						pst.setString(4,textFieldAge.getText());
						
						pst.execute();
						JOptionPane.showMessageDialog(null,"Data Saved");
						
						pst.close();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSave.setBounds(147, 326, 93, 31);
		YeniQrup.add(btnSave);
		
		JButton btnUpdate = new JButton("D\u00FCz\u0259li\u015F et\r\n");
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="Update EmployeeInfo set EID='"+textFieldEid.getText()+"',Name='"+textFieldName.getText()+"',Surname='"+textFieldSurname.getText()+"',Age='"+textFieldAge.getText()+"' where EID='"+textFieldEid.getText()+"' ";
					PreparedStatement pst=conn.prepareStatement(query);
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"Data Updated");
					
					pst.close();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUpdate.setBounds(250, 326, 93, 31);
		YeniQrup.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action=JOptionPane.showConfirmDialog(null,"Do you really want to delete","delete",JOptionPane.YES_NO_OPTION);
				if(action==0){
				try {
					String query="delete from EmployeeInfo where EID='"+textFieldEid.getText()+"' ";
					PreparedStatement pst=conn.prepareStatement(query);
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"Data Deleted");
					
					pst.close();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			  }
		   }
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(353, 326, 93, 31);
		YeniQrup.add(btnDelete);
		
		JButton btnInformasiya = new JButton("\u0130nformasiya");
		btnInformasiya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null," Dil bilikleri en az 2." + "\n" + " Tecrube en az 2 il." + "\n" + " Yas 25 yuxari.");
			}
		});
		btnInformasiya.setForeground(Color.BLACK);
		btnInformasiya.setBackground(Color.WHITE);
		btnInformasiya.setBounds(0, 0, 112, 23);
		YeniQrup.add(btnInformasiya);
		
		JLabel lblNewLabel_1 = new JLabel("Dil");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 232, 46, 14);
		YeniQrup.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(89, 220, 134, 33);
		YeniQrup.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tecrube");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 272, 46, 14);
		YeniQrup.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(89, 264, 134, 31);
		YeniQrup.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnYoxla = new JButton("Yoxla");
		btnYoxla.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnYoxla.setForeground(Color.BLACK);
		btnYoxla.setBackground(Color.WHITE);
		btnYoxla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(textField.getText()) >= 2  &&
				   Integer.parseInt(textField_1.getText()) >= 2 &&
				   Integer.parseInt(textFieldAge.getText()) > 25)
				{
					bazaya_yukle = Bazaya_Yukle.Yukle;
					JOptionPane.showMessageDialog(null, "Qebul olundunuz!!!");
				}
				else
				{
					bazaya_yukle = Bazaya_Yukle.Yukleme;
					JOptionPane.showMessageDialog(null, "Qebul olunmadiniz!!!");
				}
			}
		});
		btnYoxla.setBounds(49, 326, 88, 31);
		YeniQrup.add(btnYoxla);		
	}
}