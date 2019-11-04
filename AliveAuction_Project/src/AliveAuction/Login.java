package AliveAuction;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login {

	
	public static String input_id2="";
	private JFrame frame;
	private JTextField txt_loginId;
	private JTextField txt_loginPw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 20, 385, 74);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_1033151332674800");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(24, 117, 69, 31);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_1, "name_1033176124599300");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(24, 163, 69, 31);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("PW :");
		lblNewLabel_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_2, "name_1033178789004500");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(110, 117, 256, 31);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		txt_loginId = new JTextField();
		txt_loginId.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(txt_loginId, "name_1033205340568200");
		txt_loginId.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(109, 163, 257, 31);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		txt_loginPw = new JTextField();
		txt_loginPw.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(txt_loginPw, "name_1033207676677100");
		txt_loginPw.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(96, 212, 132, 39);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uB85C\uADF8\uC7782.png"));
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input_id = txt_loginId.getText();
			      String input_pw = txt_loginPw.getText();
			      DAO dao = new DAO();
			      String name = dao.select(input_id, input_pw);
			      if (name == null) {
			         JOptionPane.showMessageDialog(null, "·Î±×ÀÎ¿¡ ½ÇÆÐÇÏ¼Ì½À´Ï´Ù.", "·Î±×ÀÎ È®ÀÎ", JOptionPane.ERROR_MESSAGE);
			         txt_loginPw.setText("");
			      } else {
			         JOptionPane.showMessageDialog(null, name + "´Ô È¯¿µÇÕ´Ï´Ù.");
			         input_id2= input_id;
			         AliveAuction.main(null);
			         frame.dispose();
			         
			      }
			}
		});
		btnNewButton.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		panel_5.add(btnNewButton, "name_1033219476441300");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(240, 212, 132, 39);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("\uB2EB\uAE30");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uB85C\uADF8\uC778.png"));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		panel_6.add(btnNewButton_1, "name_1033221068696600");
	}
}
