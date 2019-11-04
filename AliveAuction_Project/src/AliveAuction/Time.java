package AliveAuction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Time {

   public static int price;
   public static int lowset_price2;
   public static int gap2;
   public static int span2;

   public static String courrentTime() {
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

      Date time = new Date();
      String currentTime = format.format(time);

      return currentTime;
   }

   public static int priceDown(int start_price, int lowest_price, int span, int gap) {
      int span2 = span * 1000; 
      price = start_price;
      lowset_price2 = lowest_price;
      gap2 = gap;

      Timer timer = new Timer();
      TimerTask task = new TimerTask() {

         public void run() {

            if (price < lowset_price2) {
               timer.cancel();
            } else
               System.out.println(price);
               price -= gap2;
         }
      };

      timer.schedule(task, 0000, span2);

      return price;
   }

   public static String timeCalculator(int start_price, int lowest_price, int span, int gap) {
      String time = "";
      Date date = new Date();
      SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

      Calendar cal = Calendar.getInstance();
      int t = (start_price - lowest_price) / gap * (span) + (span);

      cal.setTime(date);
      cal.add(Calendar.HOUR, t);

      time = sdformat.format(cal.getTime());

      return time;
   }
}