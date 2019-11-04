package AliveAuction;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class DoEvaluation {

   protected static final int CreditVO = 0;
   private JFrame frame;
   protected int String;
   int creditScore=0;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               DoEvaluation window = new DoEvaluation();
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
   public DoEvaluation() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   
      
   private void initialize() {
      BuyVO vo = new BuyVO();
      DAO dao = new DAO();
      
      frame = new JFrame();
      frame.setBounds(100, 100, 543, 362);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(35, 91, 142, 38);
      frame.getContentPane().add(panel);
      
      JLabel lblNewLabel = new JLabel("\uC0C1\uD488\uBC88\uD638");
      panel.add(lblNewLabel);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(35, 154, 142, 38);
      frame.getContentPane().add(panel_1);
      
      JLabel lblNewLabel_1 = new JLabel("\uC0C1\uD488\uC81C\uBAA9");
      panel_1.add(lblNewLabel_1);
      
      JPanel panel_3 = new JPanel();
      panel_3.setBounds(84, 10, 317, 44);
      frame.getContentPane().add(panel_3);
      
      JLabel lblNewLabel_3 = new JLabel("\uAD6C\uB9E4\uD3C9\uC810\uB0A8\uAE30\uAE30");
      panel_3.add(lblNewLabel_3);
      
      
      
      JCheckBox CheckBox_1 = new JCheckBox("1\uC810");
      CheckBox_1.setBounds(211, 237, 49, 23);
      frame.getContentPane().add(CheckBox_1);
      boolean first = CheckBox_1.isSelected();
      if(first) creditScore = 1;
      
      
      
      JCheckBox CheckBox_2 = new JCheckBox("2\uC810");
      CheckBox_2.setBounds(264, 237, 49, 23);
      frame.getContentPane().add(CheckBox_2);
      boolean second = CheckBox_2.isSelected();
      if(second) creditScore = 2;
      
      
      JCheckBox CheckBox_3 = new JCheckBox("3\uC810");
      CheckBox_3.setBounds(317, 237, 49, 23);
      frame.getContentPane().add(CheckBox_3);
      boolean third = CheckBox_3.isSelected();
      if(third) creditScore = 3;
      
      JCheckBox CheckBox_4 = new JCheckBox("4\uC810");
      CheckBox_4.setBounds(370, 237, 49, 23);
      frame.getContentPane().add(CheckBox_4);
      boolean fourth = CheckBox_4.isSelected();
      if(fourth) creditScore = 4;
      
      JCheckBox checkBox_5 = new JCheckBox("5\uC810");
      checkBox_5.setBounds(423, 237, 49, 23);
      frame.getContentPane().add(checkBox_5);
      boolean fifth = checkBox_5.isSelected();
      if(fifth) creditScore = 5;
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(35, 222, 142, 38);
      frame.getContentPane().add(panel_2);
      
      JButton 구매평점주기 = new JButton("\uAD6C\uB9E4\uD3C9\uC810\uC8FC\uAE30");
      구매평점주기.addActionListener(new ActionListener() {
   
   public void actionPerformed(ActionEvent arg0) {
            
            String id = dao.selectIdFromPro_number() ;// 상품번호로 판매자 Id를 가져오는 DAO 메소드를 작성             
            int score = creditScore; // 위에 체크박스에서 변수로 받아야 함. 
            
         
         
            CreditVO creditvo = new CreditVO(id, score, Login.input_id2);
            DAO dao = new DAO();
            dao.insert(creditvo);
            
            // 구매평점 완료 메세지
            JOptionPane.showMessageDialog(null, "구매평점 입력이 완료되었습니다."); // 메세지 형식으로 입력정보 알려주기 

         }
      });
      panel_2.add(구매평점주기);
      
      JLabel label = new JLabel();
      label.setBounds(200, 101, 83, 15);
      frame.getContentPane().add(label);
      label.setText(Integer.toString( 1 ));
      
      JLabel label_1 = new JLabel("\uD2B9\uC815\uC0C1\uD488\uC81C\uBAA9");
      label_1.setBounds(200, 156, 83, 23);
      frame.getContentPane().add(label_1);
      label_1.setText(dao.selectPost_nameFromBuyer());
      
   }
}