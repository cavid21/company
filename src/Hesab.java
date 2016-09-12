import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Hesab extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hesab frame = new Hesab();
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
	public Hesab() {
		setTitle("Bal hesabla");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 414);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSerbestIs = new JLabel("Serbest is");
		lblSerbestIs.setForeground(Color.WHITE);
		lblSerbestIs.setFont(new Font("Dotum", Font.PLAIN, 18));
		lblSerbestIs.setBounds(10, 46, 109, 38);
		contentPane.add(lblSerbestIs);
		
		JLabel lblMonitoring = new JLabel("Monitoring");
		lblMonitoring.setForeground(Color.WHITE);
		lblMonitoring.setFont(new Font("Dotum", Font.PLAIN, 18));
		lblMonitoring.setBounds(10, 96, 109, 38);
		contentPane.add(lblMonitoring);
		
		JLabel lblDevamiyyet = new JLabel("Devamiyyet");
		lblDevamiyyet.setForeground(Color.WHITE);
		lblDevamiyyet.setFont(new Font("Dotum", Font.PLAIN, 18));
		lblDevamiyyet.setBounds(10, 145, 109, 38);
		contentPane.add(lblDevamiyyet);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(142, 48, 164, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBounds(142, 94, 164, 40);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBounds(142, 143, 164, 40);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Hesabla");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,num3,num4,ans;
				try{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					num3=Integer.parseInt(textField_2.getText());
					num4=Integer.parseInt(textField_4.getText());
					ans=num1 + num2+num3+num4;
					textField_3.setText(Integer.toString(ans));
				}
				catch (Exception e1){
					JOptionPane.showMessageDialog(null,"Error!");
				}
						}
		});
		
			
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(390, 124, 117, 54);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(211, 275, 95, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCavab = new JLabel("Cavab");
		lblCavab.setForeground(Color.WHITE);
		lblCavab.setFont(new Font("Dotum", Font.PLAIN, 18));
		lblCavab.setBounds(144, 273, 98, 38);
		contentPane.add(lblCavab);
		
		JLabel lblLaboratoriya = new JLabel("Laboratoriya");
		lblLaboratoriya.setForeground(Color.WHITE);
		lblLaboratoriya.setFont(new Font("Dotum", Font.PLAIN, 18));
		lblLaboratoriya.setBounds(10, 194, 109, 38);
		contentPane.add(lblLaboratoriya);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBounds(142, 192, 164, 40);
		contentPane.add(textField_4);
	}

}
