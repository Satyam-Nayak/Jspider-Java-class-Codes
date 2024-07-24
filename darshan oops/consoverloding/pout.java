public class pout {
    public static void main(String[] args) {
       product p1= new product("pro1", "red", 120.98, "10-01-2024","10-01-2025", 15) ;
       product p2= new product("pro2", "blue", 120.98,"22-02-2023",15 );
       product p3= new product("pro3", "green", 120.98, "22-02-206", 16);
       product p4= new product("pro4",120.89, "violet", "12-08-2010", "12-09-2026");
       p1.productdetails();
       p2.productdetails();
       p3.productdetails();
       p4.productdetails();
    }
    
}
