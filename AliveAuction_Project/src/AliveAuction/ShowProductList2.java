package AliveAuction;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.CardLayout;

public class ShowProductList2 {

	private JFrame frame;
	private JPanel mainPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowProductList2 window = new ShowProductList2();
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
	public ShowProductList2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 587, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 124, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 81, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -86, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -86, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setLayout(new GridLayout(0, 1, 0, 0));
		scrollPane.setViewportView(mainPanel);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 26, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, panel, 204, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -24, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -206, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("\uB2EB\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		panel.add(btnNewButton_1, "name_1309477593220500");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 21, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 25, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 538, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		ImageIcon logo = new ImageIcon("C://Users//SM18//Desktop//얼라이브옥션/로고_상품리스트2.png");
		
		JLabel lblNewLabel_1 = new JLabel(logo);
		panel_1.add(lblNewLabel_1, "name_1309582201049700");
		
		
		DAO dao = new DAO();
		ArrayList<ProductVO> list = dao.selectAllProduct();
		
		for (ProductVO vo : list) {
			add(springLayout,vo);
		}
		
//		// DAO 정보를 로딩 -> ArrayList
//		ArrayList<ItemVO> list = new ArrayList();
//		list.add(new ItemVO("모자", "13000"));
//		list.add(new ItemVO("옷", "25000"));
//		list.add(new ItemVO("바지", "100000"));
//		
//		// for문으로 ArrayList 돌기
//		for (int i = 0; i < list.size(); i++) {
//			// ArrayList에서 VO객체 꺼내기
//			ItemVO vo = list.get(i);
//			add(springLayout,vo);
//		}
	
	}
	
	public void add(SpringLayout springLayout,ProductVO vo) {
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(150,80)); // 크기정하는거
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 172, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 100, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 290, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -163, SpringLayout.EAST, frame.getContentPane());
		
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel label = new JLabel("\uBAA8\uC790");
		sl_panel.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, panel);
		panel.add(label);
		label.setText("글제목 : "+vo.getPost_name());
		label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(100,80));
		panel_1.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 83, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 75, SpringLayout.WEST, panel);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uACA9");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 37, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 17, SpringLayout.EAST, panel_1);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("구매하기");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -40, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -35, SpringLayout.EAST, panel);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ProductInfo.main(null);
				System.out.println(vo.getPost_name()+"을 눌렀다.");
				
			}
		});
		
		lblNewLabel.setText("시작가 : "+ Integer.toString(vo.getStart_price()) + "   마감시간 :  "+ vo.getEndtime() );
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 14));
		mainPanel.add(panel);
		
	}
}
