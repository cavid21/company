import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import java.awt.Choice;
import java.awt.Canvas;
import java.awt.TextArea;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Qeydiyyat extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qeydiyyat frame = new Qeydiyyat();
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
	public Qeydiyyat() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cavid\\Downloads\\ok-icon (1).png"));
		setFont(null);
		setBackground(Color.CYAN);
		setTitle("Shom Company");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setForeground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qeydiyyat");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(320, 0, 89, 47);
		contentPane.add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(91, 105, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setForeground(Color.WHITE);
		lblAd.setBackground(new Color(127, 255, 0));
		lblAd.setBounds(10, 108, 71, 14);
		contentPane.add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setForeground(Color.WHITE);
		lblSoyad.setBackground(Color.RED);
		lblSoyad.setBounds(10, 139, 46, 14);
		contentPane.add(lblSoyad);
		
		textField2 = new JTextField();
		textField2.setBounds(91, 136, 86, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblYas = new JLabel("Yas");
		lblYas.setForeground(Color.WHITE);
		lblYas.setBounds(10, 170, 46, 14);
		contentPane.add(lblYas);
		
		textField3 = new JTextField();
		textField3.setBounds(91, 167, 86, 20);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		JLabel lblDilBiliklri = new JLabel("Dil bilikl\u0259ri");
		lblDilBiliklri.setForeground(Color.WHITE);
		lblDilBiliklri.setBounds(320, 118, 54, 20);
		contentPane.add(lblDilBiliklri);
		
		JLabel lblTcrb = new JLabel("T\u0259cr\u00FCb\u0259");
		lblTcrb.setForeground(Color.WHITE);
		lblTcrb.setBounds(320, 149, 54, 20);
		contentPane.add(lblTcrb);
		
		JLabel lblNewLabel_1 = new JLabel("Dil bilikl\u0259ri \u0259n az 2\r\nT\u0259cr\u00FCb\u0259 \u0259n az 1 il\r\nYa\u015F is\u0259 25-d\u0259n yuxar\u0131 olmal\u0131d\u0131r");
		lblNewLabel_1.setBounds(91, 198, 205, 87);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNedilBiliklrin = new JLabel("Dil bilikl\u0259ri \u0259n az 2 dil");
		lblNedilBiliklrin.setForeground(Color.RED);
		lblNedilBiliklrin.setBounds(10, 0, 107, 35);
		contentPane.add(lblNedilBiliklrin);
	}
}
