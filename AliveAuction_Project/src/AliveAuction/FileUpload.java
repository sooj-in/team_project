 package AliveAuction;

 

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

 

public class FileUpload {

 

  public static void main(String[] args){
 
   JFileChooser chooser = new JFileChooser(); //��ü ����
 

   int ret = chooser.showOpenDialog(null);  //����â ����

 

   if (ret != JFileChooser.APPROVE_OPTION) {

    JOptionPane.showMessageDialog(null, "��θ� ���������ʾҽ��ϴ�.",

      "���", JOptionPane.WARNING_MESSAGE);

    return;

   }

 

 

   String filePath = chooser.getSelectedFile().getPath();  //���ϰ�θ� ������

   System.out.println(filePath);  //���

  }

 

}

