package net.Airlineticket.login;
//Dong

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.Color;
import javax.swing.ImageIcon;

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
	private JTextField txtAnswer;
	protected JFrame frmSignupSystem;

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
		setTitle("SignupSys");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create An Account");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(209, 6, 237, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lbluserName = new JLabel("USERNAME");
		lbluserName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbluserName.setBounds(27, 254, 80, 16);
		contentPane.add(lbluserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(228, 254, 80, 16);
		contentPane.add(lblPassword);
		
		JLabel lblfirstName = new JLabel("FIRST NAME");
		lblfirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblfirstName.setBounds(27, 58, 80, 16);
		contentPane.add(lblfirstName);
		
		JLabel lbllastName = new JLabel("LAST NAME");
		lbllastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbllastName.setBounds(341, 58, 106, 16);
		contentPane.add(lbllastName);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddress.setBounds(35, 151, 61, 16);
		contentPane.add(lblAddress);
		
		JLabel lblzip = new JLabel("ZIP");
		lblzip.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblzip.setBounds(300, 151, 61, 16);
		contentPane.add(lblzip);
		
		JLabel lblstate = new JLabel("STATE");
		lblstate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblstate.setBounds(461, 151, 61, 16);
		contentPane.add(lblstate);
		
		JLabel lblemail = new JLabel("EMAIL");
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblemail.setBounds(408, 254, 61, 16);
		contentPane.add(lblemail);
		
		JLabel lblssn = new JLabel("SSN");
		lblssn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblssn.setBounds(63, 352, 61, 16);
		contentPane.add(lblssn);
		
		txtuserName = new JTextField();
		txtuserName.setBounds(27, 282, 176, 26);
		contentPane.add(txtuserName);
		txtuserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(228, 282, 166, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtfirstName = new JTextField();
		txtfirstName.setBackground(Color.WHITE);
		txtfirstName.setBounds(18, 86, 225, 26);
		contentPane.add(txtfirstName);
		txtfirstName.setColumns(10);
		
		txtlastName = new JTextField();
		txtlastName.setBounds(337, 86, 216, 26);
		contentPane.add(txtlastName);
		txtlastName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(27, 180, 216, 26);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtzip = new JTextField();
		txtzip.setBounds(290, 179, 136, 26);
		contentPane.add(txtzip);
		txtzip.setColumns(10);
		
		txtState = new JTextField();
		txtState.setBounds(461, 179, 106, 26);
		contentPane.add(txtState);
		txtState.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(408, 282, 176, 26);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtssn = new JTextField();
		txtssn.setBounds(63, 380, 176, 26);
		contentPane.add(txtssn);
		txtssn.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstName = txtfirstName.getText();
				String lastName = txtlastName.getText();
				String Address = txtAddress.getText();
				String zip = txtzip.getText();
				String State = txtState.getText();
				String userName = txtuserName.getText();
				String Password = txtPassword.getText();
				String email = txtemail.getText();
				String ssn = txtssn.getText();
				String Answer = txtAnswer.getText();
				
				
				frmSignupSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmSignupSystem,  "Confirm?", "Signup Systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					dispose();
					LoginSystem Login = new LoginSystem();
					Login.setVisible(true);
				}
				
				if (firstName.length() == 0 || lastName.length() == 0 || Address.length() == 0 || zip.length() == 0 || State.length() == 0) {
					txtfirstName.setText(null);
					txtlastName.setText(null);
					txtAddress.setText(null);
					txtzip.setText(null);
					txtState.setText(null);
					txtuserName.setText(null);
					txtPassword.setText(null);
					txtemail.setText(null);
					txtssn.setText(null);
					txtAnswer.setText(null);
					
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Detail");
				}
				
			
				
				
				
				
				
			}
		});
		btnSubmit.setBounds(63, 520, 117, 29);
		contentPane.add(btnSubmit);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
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
				txtAnswer.setText(null);
				
				
			}
		});
		btnNewButton.setBounds(231, 520, 117, 29);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"What city were you born in?", "What is the maker of your first Car?", "What is your favorite movie?", "What is your mother's maiden name?"}));
		comboBox.setBounds(321, 381, 216, 27);
		contentPane.add(comboBox);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSecurityQuestion.setBounds(331, 352, 127, 16);
		contentPane.add(lblSecurityQuestion);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(329, 445, 208, 26);
		contentPane.add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblanswer = new JLabel("ANSWER");
		lblanswer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblanswer.setBounds(333, 417, 61, 16);
		contentPane.add(lblanswer);
		
		JButton btnNewButton_1 = new JButton("BACK TO LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginSystem Login = new LoginSystem();
				Login.setVisible(true);
				dispose();
				
				
				
			}
		});
		btnNewButton_1.setBounds(490, 10, 160, 29);
		contentPane.add(btnNewButton_1);
	}
}
