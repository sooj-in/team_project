package AliveAuction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;

public class ProductInfo {

	private JFrame frame;
	private JTable jtable_productInfoJTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInfo window = new ProductInfo();
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
	public ProductInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 710, 810);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		panel.setBounds(33, 27, 604, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		DAO dao = new DAO();

		JLabel lab_productInfoTitle = new JLabel(dao.getProductName());
		lab_productInfoTitle.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		lab_productInfoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lab_productInfoTitle, "name_1299536290655100");

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(97, 135, 322, 243);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		JLabel lab_productInfoImage = new JLabel();
		lab_productInfoImage.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\ÆÇ¸Åµî·Ï_ÀÌ¹ÌÁö\\½ºÅ¸¹÷½ºÅÒºí·¯.jpeg"));
		lab_productInfoImage.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 16));
		lab_productInfoImage.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lab_productInfoImage, "name_1050608504961400");

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 228, 196));
		panel_3.setBounds(102, 382, 484, 99);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lab_productInfoProInfo = new JLabel(dao.getContents());
		lab_productInfoProInfo.setBounds(42, 0, 403, 99);
		lab_productInfoProInfo.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		panel_3.add(lab_productInfoProInfo);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(445, 130, 192, 85);
		frame.getContentPane().add(panel_4);

		JButton btn_productInfoBuy = new JButton("\uAD6C\uB9E4\uD558\uAE30");
		btn_productInfoBuy.setBackground(Color.WHITE);
		btn_productInfoBuy.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uC5BC\uB77C\uC774\uBE0C\uC625\uC158\\\uBC84\uD2BC\uC774\uBBF8\uC9C0\\\uBC84\uD2BC_\uAD6C\uB9E4\uD558\uAE30_\uC0C1\uD488\uC815\uBCF4.png"));
		btn_productInfoBuy.setOpaque(false);
		btn_productInfoBuy.setBorderPainted(false);
		btn_productInfoBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, Time.courrentTime() + "\n" + Time.price + "¿¡ ±¸¸Å µÇ¾ú½À´Ï´Ù.");

				DAO dao = new DAO();

				int pro_number = dao.selectPro_number(dao.getProductName());
				String Buyer_id = Login.input_id2;
				int endprice = Time.price;
				String endtime = Time.courrentTime();

				BuyVO buyvo = new BuyVO(pro_number, Buyer_id, endprice, endtime);

				dao.insert(buyvo);

			}
		});
		panel_4.setLayout(new CardLayout(0, 0));
		btn_productInfoBuy.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 17));
		panel_4.add(btn_productInfoBuy, "name_1385341434847700");

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 228, 196));
		panel_5.setBounds(511, 272, 138, 37);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));

		// °¡°Ý³»·Á°¡°Ô ÇÏ´Â °Í.
		int start_price2 = dao.getStart_price();
		int lowest_price2 = dao.getLowest_price();
		int span2 = dao.getSpan();
		int gap2 = dao.getGap();
		Time.priceDown(start_price2, lowest_price2, span2, gap2);

		JLabel lblNewLabel = new JLabel(Time.price + "¿ø");
		lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel, "name_1372326482492900");

		Timer t = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Time.price + "¿ø");
			}
		});
		t.start();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(102, 94, 116, 31);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uB9C8\uAC10\uC2DC\uAC04");
		lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, "name_1384115132537400");

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(217, 94, 149, 31);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));

		JLabel txtpn_productInfoTime = new JLabel(dao.getEndTime());
		txtpn_productInfoTime.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		txtpn_productInfoTime.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(txtpn_productInfoTime, "name_1051489830106500");

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(453, 225, 170, 37);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));

		JButton btn_productInfoWant = new JButton("\uCC1C\uD558\uAE30\u2661");
		panel_7.add(btn_productInfoWant, "name_1051716702636699");
		btn_productInfoWant.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));

		String[] header = { "¸ñ·Ï", "³»¿ë" };
		String[][] pro = { { "Ä«Å×°í¸®", dao.getSort() }, { "±¸¸Å°¡", dao.getBuy_price() }, { "±¸¸ÅÀÏ", dao.getBuy_time() },
				{ "½ÃÀÛ°¡", dao.getStart_price() + "¿ø" }, { "ÃÖÀú°¡", dao.getLowest_price() + "¿ø" },
				{ "½Ã°£´ÜÀ§", dao.getSpan() + "½Ã°£" }, { "°¡°Ý´ÜÀ§", dao.getGap() + "¿ø" },

		};

		jtable_productInfoJTable = new JTable(pro, header);
		jtable_productInfoJTable.setBounds(102, 491, 484, 210);
		jtable_productInfoJTable.setRowHeight(29);

		// JÅ×ÀÌºí ÄÃ·³À» Áß¾Ó Á¤·ÄÇÏ´Â °´Ã¼»ý¼º
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);

		jtable_productInfoJTable.getColumn("¸ñ·Ï").setCellRenderer(celAlignCenter);
		jtable_productInfoJTable.getColumn("³»¿ë").setCellRenderer(celAlignCenter);
		jtable_productInfoJTable.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		frame.getContentPane().add(jtable_productInfoJTable);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(263, 733, 161, 38);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));

		JButton btn_productClose = new JButton("\uB2EB\uAE30");
		btn_productClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_productClose.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		panel_8.add(btn_productClose, "name_1133204211314900");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(423, 278, 75, 31);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uD604\uC7AC \uAC00\uACA9");
		lblNewLabel_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_2, "name_1384379283921700");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(423, 331, 87, 31);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uD3C9\uADE0\uAC70\uB798\uAC00\uACA9");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		panel_10.add(lblNewLabel_3, "name_1384441531775200");
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 228, 196));
		panel_11.setBounds(511, 325, 138, 37);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_4, "name_1384576771398000");
	}
}
