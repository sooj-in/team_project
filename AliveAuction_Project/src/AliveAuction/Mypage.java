package AliveAuction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Canvas;

public class Mypage {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Mypage window = new Mypage();
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
   public Mypage() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
     DAO dao = new DAO();
      frame = new JFrame();
      frame.getContentPane().setBackground(Color.WHITE);
      frame.setBounds(100, 100, 834, 628);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.WHITE);
      panel.setBounds(93, 21, 663, 38);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uB9C8\uC774\uD398\uC774\uC9C0");
      lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
      lblNewLabel.setBounds(271, 10, 130, 23);
      panel.add(lblNewLabel);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.WHITE);
      panel_1.setBounds(93, 85, 301, 38);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lab_myid = new JLabel("~\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      lab_myid.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_myid.setBounds(94, 10, 161, 18);
      panel_1.add(lab_myid);
      lab_myid.setText(Login.input_id2 + "´Ô È¯¿µÇÕ´Ï´Ù.");
      
      JPanel panel_2 = new JPanel();
      panel_2.setBackground(Color.WHITE);
      panel_2.setBounds(596, 85, 159, 38);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(null);
      
      JLabel lab_credit = new JLabel("\uC2E0\uC6A9\uC810\uC218 ");
      lab_credit.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_credit.setBounds(12, 10, 123, 18);
      panel_2.add(lab_credit);
      lab_credit.setText(dao.selectCreditScore(Login.input_id2));
      
      JPanel panel_3 = new JPanel();
      panel_3.setBounds(425, 85, 159, 38);
      frame.getContentPane().add(panel_3);
      panel_3.setLayout(null);
      
      JLabel label = new JLabel("\uC2E0\uC6A9\uC810\uC218 : ");
      label.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      label.setBounds(46, 10, 80, 15);
      panel_3.add(label);
      
      JPanel panel_4 = new JPanel();
      panel_4.setBounds(94, 145, 159, 38);
      frame.getContentPane().add(panel_4);
      panel_4.setLayout(null);
      
      JLabel label_1 = new JLabel("\uCC1C\uD55C\uC0C1\uD488");
      label_1.setHorizontalAlignment(SwingConstants.CENTER);
      label_1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
      label_1.setBounds(34, 10, 92, 18);
      panel_4.add(label_1);
      
      JPanel panel_5 = new JPanel();
      panel_5.setBackground(new Color(255, 255, 255));
      panel_5.setBounds(93, 193, 159, 116);
      frame.getContentPane().add(panel_5);
      panel_5.setLayout(new CardLayout(0, 0));
      
      JLabel lab_picture1 = new JLabel("");
      lab_picture1.setHorizontalAlignment(SwingConstants.CENTER);
      lab_picture1.setIcon(new ImageIcon("C:\\Users\\SM009\\Desktop\\\uAD6C\uCC0C\uC9C0\uAC115.png"));
      panel_5.add(lab_picture1, "name_1198833233536400");
      
      JPanel panel_6 = new JPanel();
      panel_6.setBackground(new Color(255, 255, 255));
      panel_6.setBounds(425, 193, 159, 116);
      frame.getContentPane().add(panel_6);
      panel_6.setLayout(new CardLayout(0, 0));
      
      JLabel lbl_picture2 = new JLabel("\uC0AC\uC9C42");
      lbl_picture2.setHorizontalAlignment(SwingConstants.CENTER);
      lbl_picture2.setIcon(new ImageIcon("C:\\Users\\SM009\\Desktop\\\uADC0\uAC78\uC774.png"));
      panel_6.add(lbl_picture2, "name_1199238415021100");
      
      JPanel panel_7 = new JPanel();
      panel_7.setBackground(new Color(255, 255, 255));
      panel_7.setBounds(274, 193, 120, 116);
      frame.getContentPane().add(panel_7);
      panel_7.setLayout(null);
      
      JLabel lab_pro_title1 = new JLabel("\uC0C1\uD488\uC81C\uBAA9");
      lab_pro_title1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_pro_title1.setBounds(0, 10, 57, 15);
      panel_7.add(lab_pro_title1);
      
      JLabel lbl_price1 = new JLabel("\uAC00\uACA9");
      lbl_price1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lbl_price1.setBounds(0, 66, 57, 15);
      panel_7.add(lbl_price1);
      
      JLabel lab_pro_title_contents1 = new JLabel("~\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      lab_pro_title_contents1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_pro_title_contents1.setBounds(0, 35, 120, 15);
      panel_7.add(lab_pro_title_contents1);
      
      JLabel lab_price_contents1 = new JLabel("~\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      lab_price_contents1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_price_contents1.setBounds(0, 91, 152, 15);
      panel_7.add(lab_price_contents1);
      
      JPanel panel_8 = new JPanel();
      panel_8.setBackground(SystemColor.text);
      panel_8.setLayout(null);
      panel_8.setBounds(613, 193, 120, 116);
      frame.getContentPane().add(panel_8);
      
      JLabel lab_pro_title2 = new JLabel("\uC0C1\uD488\uC81C\uBAA9");
      lab_pro_title2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_pro_title2.setBounds(12, 10, 72, 15);
      panel_8.add(lab_pro_title2);
      
      JLabel lab_price2 = new JLabel("\uAC00\uACA9");
      lab_price2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_price2.setBounds(12, 60, 72, 15);
      panel_8.add(lab_price2);
      
      JLabel lab_pro_title_contents2 = new JLabel("~\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      lab_pro_title_contents2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_pro_title_contents2.setBounds(0, 35, 152, 15);
      panel_8.add(lab_pro_title_contents2);
      
      JLabel lab_price_contents2 = new JLabel("~\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      lab_price_contents2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      lab_price_contents2.setBounds(0, 85, 152, 15);
      panel_8.add(lab_price_contents2);
   
      
      JPanel panel_9 = new JPanel();
      panel_9.setLayout(null);
      panel_9.setBounds(93, 336, 159, 38);
      frame.getContentPane().add(panel_9);
      
      JLabel label_6 = new JLabel("\uAD6C\uB9E4\uBAA9\uB85D");
      label_6.setHorizontalAlignment(SwingConstants.CENTER);
      label_6.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
      label_6.setBounds(34, 10, 92, 18);
      panel_9.add(label_6);
      
      JPanel panel_10 = new JPanel();
      panel_10.setLayout(null);
      panel_10.setBounds(425, 336, 159, 38);
      frame.getContentPane().add(panel_10);
      
      JLabel label_7 = new JLabel("\uD310\uB9E4\uBAA9\uB85D");
      label_7.setHorizontalAlignment(SwingConstants.CENTER);
      label_7.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
      label_7.setBounds(34, 10, 92, 18);
      panel_10.add(label_7);
      
      
      String[] buyList = new String[dao.columnCountBuyList(Login.input_id2)];
      for (int i = 0; i < buyList.length; i++) {
      buyList[i] = dao.selectBuyList(Login.input_id2,i);
   }
      
      JList buy_list = new JList(buyList);
      buy_list.setBounds(93, 395, 267, 75);
      frame.getContentPane().add(buy_list);
      
      
      String [] sellList = new String [dao.columnCountSellList(Login.input_id2)];
      for (int i = 0; i < sellList.length; i++) {
      sellList[i] = dao.selectSellList(Login.input_id2, i);
   }
      
      
      JList sell_list = new JList(sellList);
      sell_list.setBounds(425, 395, 277, 85);
      frame.getContentPane().add(sell_list);
   }
}