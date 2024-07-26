class Registration{
    String name;
    String coursename;
    String email;
    Long phonenum;
    String degree;
    
    public Registration(String name, String coursename, long phonenum, String degree){
        this.name = name;
        this.coursename = coursename;
        this.phonenum = phonenum;
        this.degree = degree;
        
    }
    public Registration(String name, String coursename, String email, String degree){
        this.name = name;
        this.coursename = coursename;
        this.email = email;
        this.degree = degree;
    
    }
    public Registration(String name, String coursename,String email, long phonenum, String degree){
        this.name = name;
        this.coursename = coursename;
        this.email = email;
        this.phonenum = phonenum;
        this.degree = degree;

    }

    void updatephonenum (long phonenum){
        System.out.println("Updating Phone number: ");
        this.phonenum=phonenum;
    }

    void updatephonenum (String email){
        System.out.println("Updating email: ");
        this.email=email;
    }



    // encaptulation
    void Studentregistration() {
        System.out.println("============Student Regidtration===============");
        System.out.println("Name: " + name);
        System.out.println("Course Name: " + coursename);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phonenum);
        System.out.println("Degree: " + degree);        
    }

}

public class start1 {
    public static void main(String[] args) {
        Registration r1 = new Registration("Rahul", "Java", 9989786, "B.Tech");
        Registration r2 = new Registration("Aahul", "Mern_Java", "rahul@gmail.com", "B.Pharma");
        Registration r3 = new Registration("Pahul", "Java full stack", "pahu123@gmail.com", 9989679, "Engineering");
        r1.Studentregistration();
        r2.Studentregistration();
        r3.Studentregistration();
        }
    }
    

