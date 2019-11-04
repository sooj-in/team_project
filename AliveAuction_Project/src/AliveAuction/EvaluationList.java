package AliveAuction;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EvaluationList {

   private JFrame frame;
   private JPanel mainPanel;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               EvaluationList window = new EvaluationList();
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
   public EvaluationList() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 676, 539);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SpringLayout springLayout = new SpringLayout();
      frame.getContentPane().setLayout(springLayout);
      
      JScrollPane scrollPane = new JScrollPane();
      springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 42, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, scrollPane, 112, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 416, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, scrollPane, 530, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(scrollPane);
      
      mainPanel = new JPanel();
      mainPanel.setLayout(new GridLayout(0, 1, 0, 0));
      scrollPane.setViewportView(mainPanel);
      
      
      DAO dao = new DAO();
      ArrayList<BuyVO> list = dao.selectBuyProductList(Login.input_id2);
      
      for (BuyVO vo : list) {
         add(springLayout,vo);
      }
      
//      // DAO 정보를 로딩 -> ArrayList
//      ArrayList<ItemVO> list = new ArrayList();
//      list.add(new ItemVO("모자", "13000"));
//      list.add(new ItemVO("옷", "25000"));
//      list.add(new ItemVO("바지", "100000"));
//      
//      // for문으로 ArrayList 돌기
//      for (int i = 0; i < list.size(); i++) {
//         // ArrayList에서 VO객체 꺼내기
//         ItemVO vo = list.get(i);
//         add(springLayout,vo);
//      }
   
   }
 
   
   
   public void add(SpringLayout springLayout,BuyVO vo) {
      DAO dao = new DAO();
      
      JPanel panel = new JPanel();
      panel.setPreferredSize(new Dimension(100,80)); // 크기정하는거
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
      label.setText("글 제목  : "+dao.selectPost_name(vo.getPro_number()));
      
      JPanel panel_1 = new JPanel();
      panel_1.setPreferredSize(new Dimension(100,80)); 
      sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, label);
      sl_panel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, panel);
      sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 83, SpringLayout.SOUTH, label);
      sl_panel.putConstraint(SpringLayout.EAST, panel_1, 75, SpringLayout.WEST, panel);
      panel.add(panel_1);
      
      JLabel lblNewLabel = new JLabel("\uAC00\uACA9");
      sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 37, SpringLayout.NORTH, panel);
      sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 17, SpringLayout.EAST, panel_1);
      panel.add(lblNewLabel);
      
      JButton btnNewButton = new JButton("New button");
      sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -40, SpringLayout.SOUTH, panel);
      sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -35, SpringLayout.EAST, panel);
      panel.add(btnNewButton);
      btnNewButton.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub.
            DoEvaluation.main(null);
            System.out.println(vo.getPro_number()+"의 신용평가를  눌렀다.");
            
         }
      });
      
      lblNewLabel.setText("상품의 분류 : "+ dao.selectSort(vo.getPro_number()) + "체결가 : " +vo.getEndprice());
      
      mainPanel.add(panel);
      
      
   }
}