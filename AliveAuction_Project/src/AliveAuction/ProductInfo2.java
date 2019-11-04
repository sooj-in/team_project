package AliveAuction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;

public class ProductInfo2 {

	private JFrame frame;
	private JTable jtable_productInfoJTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInfo2 window = new ProductInfo2();
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
	public ProductInfo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 688, 786);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		panel.setBounds(33, 27, 604, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
				
		DAO dao = new DAO();
		
		JLabel lab_productInfoTitle = new JLabel(dao.getProductName());
		lab_productInfoTitle.setFont(new Font("������� ExtraBold", Font.PLAIN, 20));
		lab_productInfoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lab_productInfoTitle, "name_1299536290655100");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(102, 112, 322, 222);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lab_productInfoImage = new JLabel();
		lab_productInfoImage.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uD310\uB9E4\uB4F1\uB85D_\uC774\uBBF8\uC9C0\\\uC815\uBCF4\uCC98\uB9AC\uAE30\uC0AC\uD544\uAE30\uCC45.png"));
		lab_productInfoImage.setFont(new Font("������� ExtraBold", Font.PLAIN, 16));
		lab_productInfoImage.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lab_productInfoImage, "name_1050608504961400");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 228, 196));
		panel_3.setBounds(102, 359, 484, 99);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lab_productInfoProInfo = new JLabel(dao.getContents());
		lab_productInfoProInfo.setBounds(42, 0, 403, 99);
		lab_productInfoProInfo.setFont(new Font("�������", Font.PLAIN, 15));
		panel_3.add(lab_productInfoProInfo);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(448, 112, 138, 81);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JButton btn_productInfoBuy = new JButton("\uAD6C\uB9E4\uD558\uAE30");
		btn_productInfoBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JOptionPane.showMessageDialog(null, Time.courrentTime() + "\n" + Time.price + "�� ���Ű� Ȯ�� �Ǿ����ϴ�.");
				 frame.dispose();
			}
		});
		btn_productInfoBuy.setFont(new Font("������� ExtraBold", Font.PLAIN, 17));
		panel_4.add(btn_productInfoBuy, "name_1051460086924300");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 228, 196));
		panel_5.setBounds(448, 203, 138, 37);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		//���ݳ������� �ϴ� ��.
		int start_price2 = dao.getStart_price();
	      int lowest_price2 = dao.getLowest_price();
	      int span2 = dao.getSpan();
	      int gap2 = dao.getGap();
	      Time.priceDown(start_price2, lowest_price2, span2, gap2);
		
		JButton btn_productInfoPresentPrice = new JButton("30000��");
		btn_productInfoPresentPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn_productInfoPresentPrice.setText(Time.price + "��");
			}
		});
		btn_productInfoPresentPrice.setFont(new Font("�������", Font.PLAIN, 14));
		panel_5.add(btn_productInfoPresentPrice, "name_1310409871175200");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 228, 196));
		panel_6.setBounds(448, 250, 138, 37);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel txtpn_productInfoTime = new JLabel(dao.getEndTime());
		txtpn_productInfoTime.setFont(new Font("�������", Font.PLAIN, 14));
		txtpn_productInfoTime.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(txtpn_productInfoTime, "name_1051489830106500");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(448, 297, 138, 37);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		JButton btn_productInfoWant = new JButton("\uCC1C\uD558\uAE30\u2661");
		panel_7.add(btn_productInfoWant, "name_1051716702636699");
		btn_productInfoWant.setFont(new Font("�������", Font.PLAIN, 14));
		
		String[] header = {"���", "����"};
		String[][] pro = {{"ī�װ�", dao.getSort()},
		                  {"���Ű�", dao.getBuy_price()},
		                  {"������", dao.getBuy_time()},
		                  {"���۰�", dao.getStart_price() + "��"},
		                  {"������", dao.getLowest_price() + "��"},
		                  {"�ð�����", dao.getSpan() + "�ð�"},
		                  {"���ݴ���", dao.getGap() + "��"},
		                  
		};
		
		jtable_productInfoJTable = new JTable(pro, header);
		jtable_productInfoJTable.setBounds(102, 468, 484, 210);
		jtable_productInfoJTable.setRowHeight(29);
		
		// J���̺� �÷��� �߾� �����ϴ� ��ü����
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		jtable_productInfoJTable.getColumn("���").setCellRenderer(celAlignCenter);
		jtable_productInfoJTable.getColumn("����").setCellRenderer(celAlignCenter);
		jtable_productInfoJTable.setFont(new Font("�������", Font.BOLD, 15));
		frame.getContentPane().add(jtable_productInfoJTable);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(263, 699, 161, 38);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JButton btn_productClose = new JButton("\uB2EB\uAE30");
		btn_productClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_productClose.setFont(new Font("�������", Font.PLAIN, 14));
		panel_8.add(btn_productClose, "name_1133204211314900");
	}
}
