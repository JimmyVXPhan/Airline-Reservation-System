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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;

public class SignupSystem extends JFrame {

	private JPanel contentPane;
	private JTextField txtuserName;
	private JTextField txtPassword;
	private JTextField txtfirstName;
	private JTextField txtlastName;
	private JTextField txtAddress;
	private JTextField txtzip;
	private JTextField txtState;
	private JTextField txtemail;
	private JTextField txtssn;
	private JTextField txtsecurityQuestion;

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
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Signup Page");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(182, 6, 132, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lbluserName = new JLabel("Username");
		lbluserName.setBounds(6, 70, 80, 16);
		contentPane.add(lbluserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(6, 110, 61, 16);
		contentPane.add(lblPassword);
		
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
		lblemail.setBounds(6, 150, 61, 16);
		contentPane.add(lblemail);
		
		JLabel lblssn = new JLabel("SSN");
		lblssn.setBounds(6, 390, 61, 16);
		contentPane.add(lblssn);
		
		txtuserName = new JTextField();
		txtuserName.setBounds(145, 65, 216, 26);
		contentPane.add(txtuserName);
		txtuserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(145, 105, 216, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtfirstName = new JTextField();
		txtfirstName.setBounds(145, 185, 216, 26);
		contentPane.add(txtfirstName);
		txtfirstName.setColumns(10);
		
		txtlastName = new JTextField();
		txtlastName.setBounds(145, 225, 216, 26);
		contentPane.add(txtlastName);
		txtlastName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(145, 265, 216, 26);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtzip = new JTextField();
		txtzip.setBounds(145, 305, 216, 26);
		contentPane.add(txtzip);
		txtzip.setColumns(10);
		
		txtState = new JTextField();
		txtState.setBounds(145, 345, 216, 26);
		contentPane.add(txtState);
		txtState.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(145, 145, 216, 26);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtssn = new JTextField();
		txtssn.setBounds(145, 390, 216, 26);
		contentPane.add(txtssn);
		txtssn.setColumns(10);
		
		JButton btnSinup = new JButton("Register");
		btnSinup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSinup.setBounds(327, 543, 117, 29);
		contentPane.add(btnSinup);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfirstName.setText(null);
				txtlastName.setText(null);
				txtuserName.setText(null);
				txtPassword.setText(null);
				txtssn.setText(null);
				txtAddress.setText(null);
				txtemail.setText(null);
				txtzip.setText(null);
				txtState.setText(null);
				txtsecurityQuestion.setText(null);
				
				
			}
		});
		btnNewButton.setBounds(6, 543, 117, 29);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"What city were you born in?", "What is the maker of your first Car?", "What is your favorite movie?", "What is your mother's maiden name?"}));
		comboBox.setBounds(0, 461, 216, 27);
		contentPane.add(comboBox);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setBounds(6, 431, 127, 16);
		contentPane.add(lblSecurityQuestion);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 500, 427, 16);
		contentPane.add(separator);
		
		txtsecurityQuestion = new JTextField();
		txtsecurityQuestion.setBounds(228, 460, 176, 26);
		contentPane.add(txtsecurityQuestion);
		txtsecurityQuestion.setColumns(10);
	}
}
