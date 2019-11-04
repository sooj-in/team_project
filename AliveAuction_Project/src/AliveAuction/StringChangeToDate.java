package AliveAuction;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringChangeToDate {

	public Date transformDate(String date) {
		
		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ������ ��¥ Ÿ��
		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// �ٲ� ��¥ Ÿ��
		java.util.Date tempDate = null;
		
		try {
			// ���� yyyy-MM-dd HH:mm:ss �� ��¥ �������� java.util.date ��ü ����.
			tempDate = beforeFormat.parse(date);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		// java.util.Date�� yyyy-mm-dd �������� �����Ͽ� String���� ��ȯ. 
		String transDate = afterFormat.format(tempDate);
		
		// ��ȯ�� String ���� Date�� ���� 
		Date d = Date.valueOf(transDate);
		
		return d;
	}
	
}
