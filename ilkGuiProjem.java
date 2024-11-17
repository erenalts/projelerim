package main.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class form01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form01 frame = new form01();
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
	public form01() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Eren Altaş\\Downloads\\pngtree-hospital-logo-icon-abstract-alliance-png-image_5638734.png"));
		setBackground(SystemColor.inactiveCaption);
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 454);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(159, 50, 120, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(446, 50, 120, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 100, 120, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(446, 100, 120, 25);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(446, 150, 120, 25);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(159, 150, 120, 25);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Hesap oluştur");
		btnNewButton_1.setBounds(110, 275, 150, 38);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gizlilik politikasını kabul ediyorum");
		chckbxNewCheckBox.setBackground(SystemColor.text);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(100, 184, 249, 38);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Şartlar ve Koşulları kabul ediyorum .");
		chckbxNewCheckBox_1.setBackground(SystemColor.text);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_1.setBounds(100, 221, 221, 48);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel = new JLabel("Kimlik Numaranıız giriniz");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 44, 165, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblEpostanzGirin = new JLabel("Ev adresinizi girin");
		lblEpostanzGirin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEpostanzGirin.setBounds(316, 94, 120, 34);
		contentPane.add(lblEpostanzGirin);
		
		JLabel lblNewLabel_1_1 = new JLabel("Parolanızı tekrar girin");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(316, 144, 120, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Telefon numaranızı");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(34, 94, 180, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Parolanızı girin");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(55, 144, 120, 34);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblEpostanzGirin_1 = new JLabel("E-postanızı girin");
		lblEpostanzGirin_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEpostanzGirin_1.setBounds(319, 44, 120, 34);
		contentPane.add(lblEpostanzGirin_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Hesabınız varsa giriş yapın");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_2.setBounds(100, 341, 180, 34);
		contentPane.add(lblNewLabel_1_2_2);
		
		JButton btnNewButton_2 = new JButton("Giriş yap");
		btnNewButton_2.setBounds(264, 342, 95, 34);
		contentPane.add(btnNewButton_2);
	}
}
