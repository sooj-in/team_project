package AliveAuction;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AliveAuction {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AliveAuction window = new AliveAuction();
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
	public AliveAuction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(80, 25, 640, 323);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		ImageIcon logo = new ImageIcon("C://Users//SM18//Desktop//¾ó¶óÀÌºê¿Á¼Ç/·Î°í2.png");
		
		JLabel lab_mainLogo = new JLabel(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uB85C\uACE0_ppt.png"));
		lab_mainLogo.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		lab_mainLogo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lab_mainLogo, "name_966296727023400");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(69, 358, 186, 58);
		frame.getContentPane().add(panel_1);
		
		JButton btn_mainJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		//¹öÆ°Å×µÎ¸® ¾ø¾Ö±â.
		btn_mainJoin.setOpaque(false);
		btn_mainJoin.setBorderPainted(false);
		
		btn_mainJoin.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uD68C\uC6D0\uAC00\uC785_\uBA54\uC778.png"));
		btn_mainJoin.setBackground(Color.WHITE);
		btn_mainJoin.setForeground(Color.DARK_GRAY);
		btn_mainJoin.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		btn_mainJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Join.main(null);
			}
		});
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(btn_mainJoin, "name_1378579206221300");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(305, 358, 181, 58);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JButton btn_mainLogin = new JButton("\uB85C\uADF8\uC778");
		btn_mainLogin.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uB85C\uADF8\uC778_\uBA54\uC778.png"));
		btn_mainLogin.setOpaque(false);
		btn_mainLogin.setBorderPainted(false);
		btn_mainLogin.setBackground(Color.WHITE);
		btn_mainLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
			}
		});
		btn_mainLogin.setForeground(Color.DARK_GRAY);
		btn_mainLogin.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		panel_3.add(btn_mainLogin, "name_966215116323000");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(545, 358, 186, 58);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JButton btn_mainMyPage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_mainMyPage.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uB9C8\uC774\uD398\uC774\uC9C0.png"));
		btn_mainMyPage.setOpaque(false);
		btn_mainMyPage.setBorderPainted(false);
		btn_mainMyPage.setBackground(Color.WHITE);
		btn_mainMyPage.setForeground(Color.DARK_GRAY);
		btn_mainMyPage.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		panel_6.add(btn_mainMyPage, "name_966256211167900");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(69, 442, 186, 58);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JButton btn_mainBuy = new JButton("\uBB3C\uD488\uBCF4\uAE30");
		btn_mainBuy.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uBB3C\uD488\uBCF4\uAE30.png"));
		btn_mainBuy.setOpaque(false);
		btn_mainBuy.setBorderPainted(false);
		btn_mainBuy.setBackground(Color.WHITE);
		btn_mainBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowProductList2.main(null);
			}
		});
		btn_mainBuy.setForeground(Color.DARK_GRAY);
		btn_mainBuy.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		panel_4.add(btn_mainBuy, "name_966786513378300");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(300, 442, 186, 58);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JButton btn_mainSale = new JButton("\uD310\uB9E4\uB4F1\uB85D");
		btn_mainSale.setBackground(Color.WHITE);
		btn_mainSale.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uD310\uB9E4\uB4F1\uB85D.png"));
		btn_mainSale.setOpaque(false);
		btn_mainSale.setBorderPainted(false);
		btn_mainSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductPost.main(null);
			}
		});
		btn_mainSale.setForeground(Color.DARK_GRAY);
		btn_mainSale.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		panel_5.add(btn_mainSale, "name_966787593322500");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(528, 442, 207, 58);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uD3C9\uAC00\uD558\uAE30.png"));
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EvaluationList.main(null);
			}
		});
		
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		panel_2.add(btnNewButton, "name_1364549398353400");
		frame.setBounds(100, 100, 815, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
