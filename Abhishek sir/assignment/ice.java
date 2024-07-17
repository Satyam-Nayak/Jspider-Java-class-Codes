public class ice {
    public static void main(String[] args) {
     int fc = 1;
     int price = 0;
     String flav = null;
     boolean topings = true;
     boolean dryfruits = true;

     if (fc == 1)
     {
        price = 100; flav = "vanila";
     }
     if (fc == 2)
     {
        price = 115; flav = " kiwi";
     }
     if (fc == 3)   
     {
        price = 135; flav = "dragon";
     }
     if (topings == true)
{
    price = price + 15;

}
 if ( dryfruits== true)
 {
    price = price + 30;

 }
 double gst = price * 0.18;
 double total = price + gst;
 System.out.println(price);
 System.out.println(gst);
 System.out.println(total);
     
    

    
}
}
