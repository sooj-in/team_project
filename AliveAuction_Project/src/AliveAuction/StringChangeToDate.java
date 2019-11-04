package AliveAuction;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringChangeToDate {

	public Date transformDate(String date) {
		
		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 기존의 날짜 타입
		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 바뀐 날짜 타입
		java.util.Date tempDate = null;
		
		try {
			// 현재 yyyy-MM-dd HH:mm:ss 된 날짜 형식으로 java.util.date 객체 생성.
			tempDate = beforeFormat.parse(date);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		// java.util.Date를 yyyy-mm-dd 형식으로 변경하여 String으로 반환. 
		String transDate = afterFormat.format(tempDate);
		
		// 반환된 String 값을 Date로 변경 
		Date d = Date.valueOf(transDate);
		
		return d;
	}
	
}
