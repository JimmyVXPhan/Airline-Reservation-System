package net.Airlineticket.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class SignupSystem extends JFrame {

	private JPanel contentPane;
	private JTextField txtuserName;
	private JTextField txtPassword;
	private JTextField txtRePassword;
	private JTextField txtfirstName;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupSystem frame = new SignupSystem();
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
	public SignupSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setBounds(182, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lbluserName = new JLabel("Username");
		lbluserName.setBounds(6, 70, 80, 16);
		contentPane.add(lbluserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(6, 110, 61, 16);
		contentPane.add(lblPassword);
		
		JLabel lblRePassword = new JLabel("Re-enter Password");
		lblRePassword.setBounds(6, 150, 127, 16);
		contentPane.add(lblRePassword);
		
		JLabel lblfirstName = new JLabel("First Name");
		lblfirstName.setBounds(6, 190, 80, 16);
		contentPane.add(lblfirstName);
		
		JLabel lbllastName = new JLabel("Last Name");
		lbllastName.setBounds(6, 230, 106, 16);
		contentPane.add(lbllastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(6, 270, 61, 16);
		contentPane.add(lblAddress);
		
		JLabel lblzip = new JLabel("zip");
		lblzip.setBounds(6, 310, 61, 16);
		contentPane.add(lblzip);
		
		JLabel lblstate = new JLabel("state");
		lblstate.setBounds(6, 350, 61, 16);
		contentPane.add(lblstate);
		
		JLabel lblemail = new JLabel("email");
		lblemail.setBounds(6, 390, 61, 16);
		contentPane.add(lblemail);
		
		JLabel lblssn = new JLabel("SSN");
		lblssn.setBounds(6, 430, 61, 16);
		contentPane.add(lblssn);
		
		txtuserName = new JTextField();
		txtuserName.setBounds(145, 65, 216, 26);
		contentPane.add(txtuserName);
		txtuserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(145, 105, 216, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtRePassword = new JTextField();
		txtRePassword.setBounds(145, 145, 216, 26);
		contentPane.add(txtRePassword);
		txtRePassword.setColumns(10);
		
		txtfirstName = new JTextField();
		txtfirstName.setBounds(145, 185, 216, 26);
		contentPane.add(txtfirstName);
		txtfirstName.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(145, 225, 216, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(145, 265, 216, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(145, 305, 216, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(145, 345, 216, 26);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(145, 390, 216, 26);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(145, 425, 216, 26);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnSinup = new JButton("Signup");
		btnSinup.setBounds(327, 543, 117, 29);
		contentPane.add(btnSinup);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBounds(6, 543, 117, 29);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(145, 463, 216, 27);
		contentPane.add(comboBox);
	}
}
