import java.awt.EventQueue;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Login1 {

	private JFrame frmProgram;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
					window.frmProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		Connection connection=null;
		private JTextField textFieldUN;
		private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Login1() {
		initialize();
		connection=SqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgram = new JFrame();
		frmProgram.getContentPane().setBackground(new Color(0, 255, 255));
		frmProgram.setTitle("Program");
		frmProgram.setBounds(100, 100, 815, 464);
		frmProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgram.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(92, 80, 72, 14);
		frmProgram.getContentPane().add(lblNewLabel);
		
		textFieldUN = new JTextField();
		textFieldUN.setForeground(new Color(0, 0, 0));
		textFieldUN.setBackground(new Color(240, 230, 140));
		textFieldUN.setBounds(163, 67, 148, 40);
		frmProgram.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 0, 128));
		btnLogin.setBackground(new Color(255, 0, 0));
		Image image1=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnLogin.setIcon(new ImageIcon(image1));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="select * from EmployeeInfo where username=? and password=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldUN .getText() );
					pst.setString(2,passwordField.getText() );
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next())
					{
						count=count+1;
					}
					if(count == 1)
					{
						frmProgram.dispose();
						Employee›nfo1 emplInfo=new Employee›nfo1();
						emplInfo.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Username and Password isn't correct! and TRY AGAIN");
					}
					rs.close();
					pst.close();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
					
			}
		});
		btnLogin.setBounds(180, 199, 110, 40);
		frmProgram.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(92, 136, 72, 14);
		frmProgram.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBackground(new Color(240, 230, 140));
		passwordField.setBounds(163, 123, 148, 40);
		frmProgram.getContentPane().add(passwordField);
		
		JLabel label = new JLabel();
		label.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		Image image=new ImageIcon(this.getClass().getResource("/Programming%20Language%20Smalltalk-80_edited-1.jpg")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(0, 0, 799, 404);
		frmProgram.getContentPane().add(label);
		
	
		
		JMenuBar menuBar = new JMenuBar();
		frmProgram.setJMenuBar(menuBar);
		
		JMenu mnBalHesabla = new JMenu("Bal Hesabla");
		menuBar.add(mnBalHesabla);
		
		JMenuItem mntmGed = new JMenuItem("ged");
		mntmGed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmProgram.dispose();
				Hesab hsb=new Hesab();
				hsb.setVisible(true);
			}
		});
		mnBalHesabla.add(mntmGed);
		
	
		
		
	}
}
