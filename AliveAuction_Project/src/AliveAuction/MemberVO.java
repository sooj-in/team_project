package AliveAuction;

public class MemberVO {

   private String id;
   private String pw;
   private String name;
   private String add;
   private int age;
   private String phoneNumber;
   
   public MemberVO(String id, String pw, String name, int age, String add, String phoneNumber) {
      this.id = id;
      this.pw = pw;
      this.name = name;
      this.age = age;
      this.add = add;
      this.phoneNumber = phoneNumber;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPw() {
      return pw;
   }

   public void setPw(String pw) {
      this.pw = pw;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getAdd() {
      return add;
   }

   public void setAdd(String add) {
      this.add = add;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   
   
}