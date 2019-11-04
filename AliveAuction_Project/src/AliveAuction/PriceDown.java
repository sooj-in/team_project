package AliveAuction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class PriceDown {

   public static int count;
   public static int price;
   public static int priceUnit;
   public static int rowPrice;
   
   public static void main(String[] args) {

      count = 0;
      price = 10000;
      priceUnit = 1000;
      rowPrice = 5000;
      
      int timeUnit = 1 * 1000;

      Timer timer = new Timer();
      TimerTask task = new TimerTask() {

         public void run() {

            if (price == rowPrice || courrentTime().equals("2019-07-22 18:00:00")) {
               timer.cancel();
            } else
               System.out.println(price);
            price -= priceUnit;

         }

         private String courrentTime() {
            SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
                     
            Date time = new Date();
            String currentTime = format.format(time);
                        
            return currentTime;
         }
      };

      timer.schedule(task, 0000, timeUnit);

   }   
   

}