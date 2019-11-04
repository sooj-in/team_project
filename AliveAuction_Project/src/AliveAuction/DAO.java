package AliveAuction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String password = "hr";

	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����
			conn = DriverManager.getConnection(url, user, password); // ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {

		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insert(MemberVO vo) {
		getConnection();
		int row = 0;

		try {
			String sql = "insert into MEMBER values(?,?,?,?,?,?)";//
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getAdd());
			psmt.setInt(5, vo.getAge());
			psmt.setString(6, vo.getPhoneNumber());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}

	public int insert(ProductVO vo) {
		getConnection();
		int row = 0;

		try {
//			pro_num_seq.NEXTVAL
			String sql = "insert into PRODUCT values(pro_num_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			psmt.setString(1, vo.getSort()); // ���ϴ� ��
			psmt.setString(2, vo.getId()); // ���ϴ� ��
			psmt.setInt(3, vo.getBuy_price()); // ���ϴ� ��
			psmt.setString(4, vo.getBuy_time());
			psmt.setInt(5, vo.getStart_price()); // ���ϴ� ��
			psmt.setInt(6, vo.getLowest_price()); // ���ϴ� ��
			psmt.setString(7, vo.getEndtime()); // ���ϴ� ��
			psmt.setInt(8, vo.getSpan()); // ���ϴ� ��
			psmt.setInt(9, vo.getGap()); // ���ϴ� ��
			psmt.setString(10, vo.getDay()); // ���ϴ� ��
			psmt.setString(11, vo.getPost_name()); // ���ϴ� ��
			psmt.setString(12, vo.getContents()); // ���ϴ� ��
			psmt.setString(13, vo.getLink()); // ���ϴ� ��
			psmt.setString(14, vo.getState()); // ���ϴ� ��

			row = psmt.executeUpdate(); // ���ϴ� ��
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}

	public int insert(BuyVO vo) {
		getConnection();
		int row = 0;

		try {
			String sql = "insert into BUY values(buy_num_seq.NEXTVAL,?,?,?,?)";//
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getPro_number());
			psmt.setString(2, vo.getBuyer_id());
			psmt.setInt(3, vo.getEndprice());
			psmt.setString(4, vo.getEndtime());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}

	public String select(String id, String pw) {
		getConnection();
		String name = null;
		try {

			String sql = "select name from member where id =? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return name;

	}
	
	public int selectAvgPrice() {
		getConnection();
		String sort = "��ȭ";
		int avg = 0;
		try {

			String sql = "select AVG(endprice) from buy where pro_number in ( select pro_number from product where sort = ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sort);
			rs = psmt.executeQuery();
			if (rs.next()) {
				avg = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return avg;

	}

	public String getPostName() {
		getConnection();
		String name = null;
		try {
			String sql = "select POST_NAME from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return name;

	}

	public String getEndTime() {
		getConnection();
		String endTime = null;
		try {

			String sql = "select endtime from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				endTime = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return endTime;

	}

	public String getSort() {
		getConnection();
		String sort = null;
		try {

			String sql = "select sort from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				sort = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return sort;
	}

	public String getBuy_price() {
		getConnection();
		String buy_price = null;
		try {

			String sql = "select buy_price from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				buy_price = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return buy_price;

	}

	public String getBuy_time() {
		getConnection();
		String buy_time = null;
		try {

			String sql = "select buy_time from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				buy_time = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return buy_time;

	}

	public int getStart_price() {
		getConnection();
		int start_price = 0;
		try {

			String sql = "select start_price from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				start_price = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return start_price;

	}

	public int getLowest_price() {
		getConnection();
		int lowest_price = 0;
		try {

			String sql = "select lowest_price from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				lowest_price = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return lowest_price;

	}

	public int getSpan() {
		getConnection();
		int span = 0;
		try {

			String sql = "select span from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				span = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return span;

	}

	public int getGap() {
		getConnection();
		int gap = 0;
		try {

			String sql = "select gap from PRODUCT where PRO_NUMBER=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				gap = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return gap;

	}

	// ���� ������ ��ǰ�� ��ǰ��ȣ ��������
	public int selectPro_number(String post_name) {
		getConnection();
		int result = 0;

		try {
			String sql = "select Pro_number from PRODUCT where Post_name = ?"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			psmt.setString(1, post_name);
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	public int insert(CreditVO vo) {
	    getConnection();
	    int row = 0;

	    try {
	       String sql = "insert into CREDIT values(credit_num_seq,?,?,?)";//
	       psmt = conn.prepareStatement(sql);
	       psmt.setString(1, vo.getId());
	       psmt.setInt(2, vo.getScore());
	       psmt.setString(3, vo.getEvaluator());
	       row = psmt.executeUpdate();

	    } catch (Exception e) {
	       e.printStackTrace();
	    } finally {
	       close();
	    }
	    return row;
	 }


	// ��ǰ����� �� ���� �������� �޼ҵ�
	public int columnCountProduct() {
		getConnection();
		int result = 0;
		String sql = "select count(Pro_number) from PRODUCT"; // ���ϴ� ��
		try {
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// �ش� ���� �Խù��� ������ �������� �޼ҵ�
	public String getProductName() {
		getConnection();
		String result = "";
		String sql = "select post_name from PRODUCT"; // ���ϴ� ��
		try {
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// �ش� ���� ��ǰ���� �������� �޼ҵ�
	public String getContents() {
		getConnection();
		String result = "";
		String sql = "select Contents from PRODUCT"; // ���ϴ� ��
		try {
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

//  DB���� �ڷḦ ������ �� ����ϴ� ����Ʈ ���� 
//	public String select(String id, String pw) {
//		getConnection();
//		String name = null;
//		    //���̵� �н����尡 ��ġ�ϸ� �̸��� ����Ʈ �ϴ� ����. 
//		String sql = "select P_number from Product where id = ? and pw = ?"; // ���ϴ� �� 
//		try {
//			psmt = conn.prepareStatement(sql); // ���ϴ� ��
//			psmt.setString(1, id); // ���ϴ� ��
//			psmt.setString(2, pw); // ���ϴ� ��
//			rs = psmt.executeQuery(); // ���ϴ� ��
//			if(rs.next()) {
//				name = rs.getString(1);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return name;		
//	}

//	public ArrayList<Test3> selectAll() {
//		getConnection();
//		ArrayList<Test3> list = new ArrayList<>();
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");			//���� 
//			conn = DriverManager.getConnection(url, user, password);   //����
//			
//			String sql = "select * from test3";                           //���ϴ� ��
//			psmt = conn.prepareStatement(sql);                             //���ϴ� ��
//			rs = psmt.executeQuery();                                      //���ϴ� ��
//			while(rs.next()) {                                             //���ϴ� ��
//				Test3 t = new Test3(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));     //���ϴ� ��  
//				list.add(t);
//			}                                                       						
//			
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			close();	
//		}
//		
//		
//		return list;
//	}

	public ArrayList<ProductVO> selectAllProduct() {
		getConnection();
		ArrayList<ProductVO> list = new ArrayList<>();

		try {

			String sql = "select * from Product"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // ���ϴ� ��
			while (rs.next()) { // ���ϴ� ��
				ProductVO vo = new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getInt(10),
						rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15)); // ���ϴ�
																													// ��
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

	// ������ ���� ���� ����Ʈ ��������
	public ArrayList<BuyVO> selectBuyProductList(String input_id2) {

		getConnection();
		ArrayList<BuyVO> list = new ArrayList<>();

		try {

			String sql = "select * from BUY where buyer_id = ? "; // ���ϴ� ��
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, input_id2);
			rs = psmt.executeQuery(); // ���ϴ� ��
			while (rs.next()) { // ���ϴ� ��
				BuyVO vo = new BuyVO(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5)); // ���ϴ� ��
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;

	}

	// ������ ������ ���� ��������
	public String selectPost_name(int pro_number) {
		getConnection();
		String result = "";

		try {
			String sql = "select Post_name from PRODUCT where Pro_number = ?"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			psmt.setInt(1, pro_number);
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// ������ ������ ī�װ� ��������
	public String selectSort(int pro_number) {
		getConnection();
		String result = "";

		try {
			String sql = "select Sort from PRODUCT where Pro_number = ?"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			psmt.setInt(1, pro_number);
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}



//Ư�� ȸ���� �ſ����� ��հ� ��������
	public String selectCreditScore(String id) {
		getConnection();
		int score = 0;
		String grade = "";
		try {

			String sql = "select AVG(Score) from CREDIT where id like ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				score = rs.getInt(1);
			}
			if (score > 4) {
				grade = "1���";
			} else if (score <= 4 && score > 3) {
				grade = "2���";
			} else if (score <= 3 && score > 2) {
				grade = "3���";
			} else if (score <= 2 && score > 1) {
				grade = "4���";
			} else {
				grade = "�ſ�ҷ�";
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return grade;

	}

// Ư�� ȸ���� ���Ÿ�� �������� 
	public String selectBuyList(String id, int i) {
		getConnection();
		String list = null;
		try {

			String sql = "select Post_name from PRODUCT where Pro_number in (select Pro_number from BUY where Buyer_id = ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				list = rs.getString(i + 1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;

	}

// Ư�� ȸ���� �ǸŸ�� �������� 
	public String selectSellList(String id, int i) {
		getConnection();
		String list = null;
		try {

			String sql = "select Post_name from PRODUCT where Id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				list = rs.getString(i + 1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;

	}

//Ư��ȸ���� ���Ÿ�� �� �������� 
	public int columnCountBuyList(String id) {
		getConnection();
		int result = 0;

		try {
			String sql = "select count(Pro_number) from BUY where Id = ?"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			psmt.setString(1, id);
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

//Ư��ȸ���� �ǸŸ�� �� �������� 
	public int columnCountSellList(String id) {
		getConnection();
		int result = 0;

		try {
			String sql = "select count(Pro_number) from PRODUCT where Id = ?"; // ���ϴ� ��
			psmt = conn.prepareStatement(sql); // ���ϴ� ��
			psmt.setString(1, id);
			rs = psmt.executeQuery(); // ���ϴ� ��
			if (rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
	
	  // ������ ������ ��ǰ��ȣ��������
	   public int selectPro_number2(String intput_id2) {
	      getConnection();
	      int result = 0;

	      try {
	         String sql = "select Pro_number from Buy where Buyer_id = ?"; // ���ϴ� ��
	         psmt = conn.prepareStatement(sql); // ���ϴ� ��
	         psmt.setString(1, Login.input_id2);
	         rs = psmt.executeQuery(); // ���ϴ� ��
	         if (rs.next()) {
	            result = rs.getInt(2);
	         }

	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         close();
	      }
	      return result;
	   }
	   
	   // ������ ���̵�� ��ǰ���� �������� 
	   public String selectPost_nameFromBuyer() {
	      BuyVO vo = new BuyVO();
	      
	      getConnection();
	      String result = "";

	      try {
	         String sql = "select Post_name from PRODUCT where Pro_number = ?"; // ���ϴ� ��
	         psmt = conn.prepareStatement(sql); // ���ϴ� ��
	         psmt.setInt(1,1);
	         rs = psmt.executeQuery(); // ���ϴ� ��
	         if (rs.next()) {
	            result = rs.getString(1);
	         }

	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         close();
	      }
	      return result;
	   }
	   
	   // ��ǰ��ȣ�� �Ǹ��� ���̵� �������� 
	   public String selectIdFromPro_number() {
	      BuyVO vo = new BuyVO();
	      
	      getConnection();
	      String result = "";

	      try {
	         String sql = "select Id from PRODUCT where Pro_number in ?"; // ���ϴ� ��
	         psmt = conn.prepareStatement(sql); // ���ϴ� ��
	         psmt.setInt(1,vo.getPro_number());
	         rs = psmt.executeQuery(); // ���ϴ� ��
	         if (rs.next()) {
	            result = rs.getString(1);
	         }

	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         close();
	      }
	      return result;
	   }

}

