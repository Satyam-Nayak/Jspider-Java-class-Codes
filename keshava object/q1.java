class pen {
    //attributes
    double price ;
    String brand;
    String color;
// if attributes are not initialized what will be there
//behaviour
    void write(){
        System.out.println("writing using "+ color + " pen" );
        
    }

    void refill(){
        System.out.println("filling the ink of the pen "+ color + " pen" );


    }

    void changecolor(String newcolor){
        color = newcolor; 
        // parameter is assigned to attribute

    }
}
public class q1 {
     public static void main(String[] args) {
        pen p1 = new pen();
        p1.price = 10;
        p1.brand = "cello";
        p1.color = "blue";
        p1.write();
        p1.changecolor("black");
        p1.write();
        p1.refill();
        System.out.println("main method ended");
     }

    
}
