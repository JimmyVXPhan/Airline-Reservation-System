package net.Airlineticket.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Login_System {
	

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;
	protected JFrame frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_System window = new Login_System();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 400, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(283, 297, 109, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(124, 334, 85, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(124, 370, 85, 16);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(275, 329, 218, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(275, 365, 218, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if (password.contains("king") && username.contains("one")){
					txtPassword.setText(null);
					txtUsername.setText(null);
		}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
					
				}
			}
		});
		btnNewButton.setBounds(56, 510, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnNewButton_1.setBounds(275, 510, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,  "Confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
				
				
			}
		});
		btnNewButton_2.setBounds(511, 510, 117, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 457, 658, 14);
		frame.getContentPane().add(separator);
		
		JButton btnClickHereTo = new JButton("Click here to Signup");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SignupSystem SignupSys = new SignupSystem();
				SignupSys.setVisible(true);
					
			}
		});
		btnClickHereTo.setBounds(469, 430, 179, 29);
		frame.getContentPane().add(btnClickHereTo);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Sonic Flight!");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(228, 28, 244, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login_System.class.getResource("/images/login_picture.jpg")));
		lblNewLabel_2.setBounds(0, -11, 750, 600);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
