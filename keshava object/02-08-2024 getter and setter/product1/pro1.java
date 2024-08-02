class product{
    private  int p_id; 
    private String name;
    private int price;

    public int getP_id(){     //getter
        return p_id;
    }
    public void setP_id(int p_id){    //setter
        this.p_id = p_id;
    }

    public String getName(){     //getter
        return name;
    }
    public void setName(String name){    //setter
        this.name = name;
    }
    
    public int getPrice(){     //getter
        return price;
    }
    public void setPrice(int price){    //setter
        this.price = price;
    }

}
public class pro1 {
    public static void main(String[] args) {
        System.out.println("main method started ");
        product p1 = new product();
        p1.setP_id(123);
        p1.setPrice(500);
        p1.setName("mindtree");

        System.out.println(p1.getName()+" "+p1.getP_id()+" "+p1.getPrice());
        System.out.println("main method started ");
    }
}