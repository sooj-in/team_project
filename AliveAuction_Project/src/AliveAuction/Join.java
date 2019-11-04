package AliveAuction;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Join {

	private JFrame frame;
	private JTextField txt_joinId;
	private JTextField txt_joinPw;
	private JTextField txt_joinPwCheck;
	private JTextField txt_joinName;
	private JTextField txt_joinAdd;
	private JTextField txt_joinAge;
	private JTextField txt_joinPhoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
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
	public Join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 23, 381, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_1038540583580200");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(22, 110, 99, 32);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_1, "name_1038703246609100");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(22, 152, 99, 32);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lblNewLabel_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_2, "name_1038710438578400");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(22, 194, 99, 32);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778 :");
		lblNewLabel_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_3, "name_1038711839507700");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(22, 236, 99, 32);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uC774\uB984 :");
		lblNewLabel_4.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_4, "name_1038713006450400");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(22, 278, 99, 32);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\uC8FC\uC18C :");
		lblNewLabel_5.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_5, "name_1038714158554100");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(24, 320, 99, 32);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("\uB098\uC774 :");
		lblNewLabel_6.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(lblNewLabel_6, "name_1038715366933400");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(24, 362, 99, 32);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("\uC5F0\uB77D\uCC98 :");
		lblNewLabel_7.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_7.add(lblNewLabel_7, "name_1038716422575900");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(140, 109, 218, 33);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		txt_joinId = new JTextField();
		panel_8.add(txt_joinId, "name_1038718598557900");
		txt_joinId.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(140, 152, 218, 33);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		txt_joinPw = new JTextField();
		panel_9.add(txt_joinPw, "name_1038720183715000");
		txt_joinPw.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(140, 193, 218, 33);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		txt_joinPwCheck = new JTextField();
		panel_10.add(txt_joinPwCheck, "name_1038721534392900");
		txt_joinPwCheck.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(140, 235, 218, 33);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		txt_joinName = new JTextField();
		panel_11.add(txt_joinName, "name_1038722912019400");
		txt_joinName.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(140, 278, 218, 33);
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		txt_joinAdd = new JTextField();
		panel_12.add(txt_joinAdd, "name_1038724742570400");
		txt_joinAdd.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(140, 319, 218, 33);
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		txt_joinAge = new JTextField();
		panel_13.add(txt_joinAge, "name_1038725934379700");
		txt_joinAge.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(140, 362, 218, 33);
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		txt_joinPhoneNumber = new JTextField();
		panel_14.add(txt_joinPhoneNumber, "name_1038728071472000");
		txt_joinPhoneNumber.setColumns(10);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(101, 426, 105, 49);
		frame.getContentPane().add(panel_15);
		panel_15.setLayout(new CardLayout(0, 0));
		
		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uD68C\uC6D0\uAC00\uC785_\uD68C\uC6D0\uAC00\uC785.png"));
		btn_join.setOpaque(false);
		btn_join.setBorderPainted(false);
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_joinId.getText();
			      String pw = txt_joinPw.getText();
			      String pwCheck = txt_joinPwCheck.getText();
			      String name = txt_joinName.getText();
			      String add = txt_joinAdd.getText();
			      int age = Integer.parseInt(txt_joinAge.getText());
			      String phoneNumber = txt_joinPhoneNumber.getText();
			      
			      if (pw.equals(pwCheck)) {
			         JOptionPane.showMessageDialog(null, "ºñ¹Ð¹øÈ£°¡ ÀÏÄ¡ÇÕ´Ï´Ù.");
			         MemberVO vo = new MemberVO(id, pw, name, age, add, phoneNumber);
			        
			         DAO dao = new DAO();
			         int result = dao.insert(vo);
			         if (result == 0) {
			            JOptionPane.showMessageDialog(null, "È¸¿ø°¡ÀÔ ½ÇÆÐ", "È¸¿ø°¡ÀÔ È®ÀÎ", JOptionPane.ERROR_MESSAGE);
			         } else {
			            JOptionPane.showMessageDialog(null, "È¸¿ø°¡ÀÔ ¼º°ø");
			            frame.dispose();
			         }
			         
			         
			         } else {
			            JOptionPane.showMessageDialog(null, "ºñ¹Ð¹øÈ£°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.", "ºñ¹Ð¹øÈ£ È®ÀÎ", JOptionPane.ERROR_MESSAGE);
			      }
			      
			}
		});
		btn_join.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		panel_15.add(btn_join, "name_1038729326575900");
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(230, 426, 105, 49);
		frame.getContentPane().add(panel_16);
		panel_16.setLayout(new CardLayout(0, 0));
		
		JButton btn_joinClose = new JButton("\uB2EB\uAE30");
		btn_joinClose.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uB2EB\uAE30.png"));
		btn_joinClose.setOpaque(false);
		btn_joinClose.setBorderPainted(false);
		btn_joinClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_joinClose.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		panel_16.add(btn_joinClose, "name_1038730734387400");
	}

}
