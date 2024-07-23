

public class jspiderstu {
    String username;
    String email;
    long phno;
    String pass;

    public jspiderstu(String username, String email, String pass){
      this.username=username;
      this.email=email;
      this.pass=pass;
  
   }
  
   public jspiderstu(String username, long phno, String pass){
      this.username=username;
      this.phno= phno;
      this.pass=pass;
   }
   public jspiderstu(String username, String email,long phno, String pass){
      this.username=username;
      this.email=email;
      this.phno= phno;
      this.pass=pass;
   }
    
   void studentdetails(){
      System.out.println("============Student Details===============");
      System.out.println("username: "+this.username);
      System.out.println("email: "+this.email);
      System.out.println("phno: "+this.phno);
      System.out.println("pass: "+this.pass);

   }

}
 