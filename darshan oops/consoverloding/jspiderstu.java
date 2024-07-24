

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
  }

}
