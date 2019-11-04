package AliveAuction;

public class BuyVO {
	   
    private int pro_number;
      private String buyer_id;
      private int endprice;
      private String endtime;
      
   public BuyVO () {
	   
   }
      
   public BuyVO(int pro_number, String buyer_id, int endprice, String endtime) {
      super();
      this.pro_number = pro_number;
      this.buyer_id = buyer_id;
      this.endprice = endprice;
      this.endtime = endtime;
   }
   public int getPro_number() {
      return pro_number;
   }
   public void setPro_number(int pro_number) {
      this.pro_number = pro_number;
   }
   public String getBuyer_id() {
      return buyer_id;
   }
   public void setBuyer_id(String buyer_id) {
      this.buyer_id = buyer_id;
   }
   public int getEndprice() {
      return endprice;
   }
   public void setEndprice(int endprice) {
      this.endprice = endprice;
   }
   public String getEndtime() {
      return endtime;
   }
   public void setEndtime(String endtime) {
      this.endtime = endtime;
   }
     
}