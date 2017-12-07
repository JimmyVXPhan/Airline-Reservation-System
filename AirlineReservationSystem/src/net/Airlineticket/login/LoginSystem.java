package net.Airlineticket.login;
//Dong

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class LoginSystem extends JFrame {

	private JPanel contentPane;
	private JTextField txtuserName;
	private JTextField txtpassword;
	protected JFrame frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem frame = new LoginSystem();
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
	public LoginSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 700, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome To Sonic Flight!");
		lblWelcome.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblWelcome.setBounds(207, 24, 278, 29);
		contentPane.add(lblWelcome);
		
		JButton btnSignup = new JButton("Click Here to Signup");
		btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SignupSystem Signup = new SignupSystem();
				Signup.setVisible(true);
			}
		});
		btnSignup.setBounds(521, 371, 173, 29);
		contentPane.add(btnSignup);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Password = txtpassword.getText();
				String userName = txtuserName.getText();
				
				if (Password.contains("admin") && userName.contains("admin")) {
					dispose();
					TicketingSystem Ticket = new TicketingSystem();
					Ticket.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error" ,JOptionPane.ERROR_MESSAGE);
					txtpassword.setText(null);
					txtuserName.setText(null);
				}
			}
		});
		btnLogin.setBounds(66, 498, 117, 29);
		contentPane.add(btnLogin);
		
		JLabel lbluserName = new JLabel("USERNAME");
		lbluserName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbluserName.setBounds(87, 250, 96, 16);
		contentPane.add(lbluserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(87, 320, 79, 16);
		contentPane.add(lblPassword);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtuserName.setText(null);
				txtpassword.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnReset.setBounds(260, 498, 117, 29);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,  "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBounds(459, 498, 117, 29);
		contentPane.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 412, 688, 13);
		contentPane.add(separator);
		
		txtuserName = new JTextField();
		txtuserName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtuserName.setBounds(210, 245, 257, 26);
		contentPane.add(txtuserName);
		txtuserName.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpassword.setBounds(210, 317, 257, 21);
		contentPane.add(txtpassword);
		txtpassword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginSystem.class.getResource("/images/login_picture.jpg")));
		lblNewLabel.setBounds(0, -14, 700, 592);
		contentPane.add(lblNewLabel);
	}
}
