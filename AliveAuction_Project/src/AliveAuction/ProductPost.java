package AliveAuction;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProductPost {

	private JFrame frame;
	private JTextField txt_productPostTitle;
	private JTextField txt_productPostInfo;
	private JTextField txt_productPostBuyPrice;
	private JTextField txt_productPostStartPrice;
	private JTextField txt_productPostLowestPrice;
	private JTextField txt_productPostSpan;
	private JTextField txt_productPostPriceGap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductPost window = new ProductPost();
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
	public ProductPost() {
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
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 20, 608, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("\uD310\uB9E4\uB4F1\uB85D");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_1042412597804300");

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(58, 104, 79, 36);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("\uC81C\uBAA9");
		lblNewLabel_1.setBackground(new Color(253, 245, 230));
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, "name_1042426757744100");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(149, 104, 400, 36);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		txt_productPostTitle = new JTextField();
		panel_2.add(txt_productPostTitle, "name_1042463212924200");
		txt_productPostTitle.setColumns(10);

		JPanel lab_productPostImage = new JPanel();
		lab_productPostImage.setBackground(new Color(255, 250, 240));
		lab_productPostImage.setBounds(137, 150, 412, 148);
		frame.getContentPane().add(lab_productPostImage);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(438, 308, 111, 23);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));

		JButton btn_productPostImage = new JButton("\uC774\uBBF8\uC9C0 \uB4F1\uB85D");
		btn_productPostImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileUpload.main(null);
			}
		});
		btn_productPostImage.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		panel_5.add(btn_productPostImage, "name_1042498709004600");

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(149, 365, 400, 123);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));

		txt_productPostInfo = new JTextField();
		panel_6.add(txt_productPostInfo, "name_1042471077048700");
		txt_productPostInfo.setColumns(10);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(58, 365, 79, 36);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("\uC0C1\uD488\uC124\uBA85 ");
		lblNewLabel_2.setBackground(new Color(253, 245, 230));
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_2, "name_1042431581045700");

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(58, 319, 93, 36);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_4 = new JLabel("\uCE74\uD14C\uACE0\uB9AC \uC120\uD0DD");
		lblNewLabel_4.setBackground(new Color(253, 245, 230));
		lblNewLabel_4.setFont(new Font("나눔고딕", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_4, "name_1042571092825600");

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(163, 319, 133, 36);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));

		String[] category = { "의류", "신발", "유·아동용품", "가전제품", "잡화" };

		JComboBox cb_productPostCategory = new JComboBox(category);
		cb_productPostCategory.setFont(new Font("나눔고딕", Font.PLAIN, 14));
		cb_productPostCategory.setBackground(Color.WHITE);
		panel_9.add(cb_productPostCategory, "name_1043250195216200");

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(334, 509, 92, 36);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_5 = new JLabel("\uAD6C\uB9E4\uAC00");
		lblNewLabel_5.setBackground(new Color(253, 245, 230));
		lblNewLabel_5.setFont(new Font("나눔고딕", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_5, "name_1043454546564900");

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(438, 509, 134, 36);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));

		txt_productPostBuyPrice = new JTextField();
		panel_11.add(txt_productPostBuyPrice, "name_1043632610048400");
		txt_productPostBuyPrice.setColumns(10);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(79, 509, 93, 36);
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_6 = new JLabel("\uAD6C\uB9E4\uC77C");
		lblNewLabel_6.setBackground(new Color(253, 245, 230));
		lblNewLabel_6.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_6, "name_1043812802284800");

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(334, 555, 92, 36);
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_7 = new JLabel("\uC2DC\uC791\uAC00");
		lblNewLabel_7.setBackground(new Color(253, 245, 230));
		lblNewLabel_7.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_7, "name_1043814554246500");

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(184, 509, 133, 36);
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));

		String[] buyTime = { "일주일 이내", "6개월 전", "1년 전", "5년 전" };

		JComboBox cb_productPostBuyDate = new JComboBox(buyTime);
		cb_productPostBuyDate.setBackground(Color.WHITE);
		cb_productPostBuyDate.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		panel_14.add(cb_productPostBuyDate, "name_1046264939560800");

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(438, 555, 134, 36);
		frame.getContentPane().add(panel_15);
		panel_15.setLayout(new CardLayout(0, 0));

		txt_productPostStartPrice = new JTextField();
		panel_15.add(txt_productPostStartPrice, "name_1043922618008300");
		txt_productPostStartPrice.setColumns(10);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(79, 555, 93, 36);
		frame.getContentPane().add(panel_16);
		panel_16.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_8 = new JLabel("\uCD5C\uC800\uAC00");
		lblNewLabel_8.setBackground(new Color(253, 245, 230));
		lblNewLabel_8.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_8, "name_1044010592963000");

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(79, 601, 93, 36);
		frame.getContentPane().add(panel_18);
		panel_18.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_10 = new JLabel("\uC2DC\uAC04\uB2E8\uC704");
		lblNewLabel_10.setBackground(new Color(253, 245, 230));
		lblNewLabel_10.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_18.add(lblNewLabel_10, "name_1044049232901700");

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(334, 601, 93, 36);
		frame.getContentPane().add(panel_19);
		panel_19.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_11 = new JLabel("\uAC00\uACA9\uB2E8\uC704");
		lblNewLabel_11.setBackground(new Color(253, 245, 230));
		lblNewLabel_11.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_19.add(lblNewLabel_11, "name_1044054929609600");

		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(184, 555, 133, 36);
		frame.getContentPane().add(panel_20);
		panel_20.setLayout(new CardLayout(0, 0));

		txt_productPostLowestPrice = new JTextField();
		panel_20.add(txt_productPostLowestPrice, "name_1044092976909800");
		txt_productPostLowestPrice.setColumns(10);

		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(184, 601, 133, 36);
		frame.getContentPane().add(panel_21);
		panel_21.setLayout(new CardLayout(0, 0));

		txt_productPostSpan = new JTextField();
		panel_21.add(txt_productPostSpan, "name_1044096000794000");
		txt_productPostSpan.setColumns(10);

		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(439, 601, 133, 36);
		frame.getContentPane().add(panel_23);
		panel_23.setLayout(new CardLayout(0, 0));

		txt_productPostPriceGap = new JTextField();
		panel_23.add(txt_productPostPriceGap, "name_1044097457776500");
		txt_productPostPriceGap.setColumns(10);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(149, 671, 150, 43);
		frame.getContentPane().add(panel_24);
		panel_24.setLayout(new CardLayout(0, 0));

		JButton btn_productPost = new JButton("\uB4F1\uB85D");
		btn_productPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sort = String.valueOf(cb_productPostCategory.getSelectedItem());// 카테고리
				String id = Login.input_id2; // 판매자
				int buy_price = Integer.parseInt(txt_productPostBuyPrice.getText()); // 구매가
				String buy_time = String.valueOf(cb_productPostBuyDate.getSelectedItem()); // 구매일
				int start_price = Integer.parseInt(txt_productPostStartPrice.getText()); // 시작가
				int lowest_price = Integer.parseInt(txt_productPostLowestPrice.getText()); // 최저가
				int span = Integer.parseInt(txt_productPostSpan.getText()); // 시간단위
				int gap = Integer.parseInt(txt_productPostPriceGap.getText()); // 가격단위
				String endtime = Time.timeCalculator(start_price, lowest_price, span, gap);
				String day = Time.courrentTime();
				String post_name = txt_productPostTitle.getText();
				String contents = txt_productPostInfo.getText();
				String link = "dfdf";
				String state = "sale"; // 상품상태
				
				
				ProductVO productvo = new ProductVO(1, sort, id, buy_price, buy_time, start_price, lowest_price, 
						endtime,span, gap, day, post_name,contents, link,state);
				DAO dao = new DAO();
				dao.insert(productvo);
			
				

				
				// 상품 정보 출력 메소드
				JOptionPane.showMessageDialog(null, "상품등록이  정상적으로 완료 되었습니다."); // 메세지 형식으로 입력정보 알려주기 , 상품등록 내용을 확인
																					// 시켜 줄 수 도 있음.
				frame.dispose();
			}
			

		});
		btn_productPost.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		panel_24.add(btn_productPost, "name_1044856246801300");

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(343, 671, 150, 43);
		frame.getContentPane().add(panel_25);
		panel_25.setLayout(new CardLayout(0, 0));

		JButton btn_productPostClose = new JButton("\uB2EB\uAE30");
		btn_productPostClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btn_productPostClose.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		panel_25.add(btn_productPostClose, "name_1044860990960200");
	}
}
