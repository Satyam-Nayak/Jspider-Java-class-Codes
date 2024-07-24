public class product {
    String pid;
    String color;
    double price;
    String mfgdate;
    String expdate;
    double tax;

    public product(String pid, String color, double price, String mfgdate, String expdate, double tax) {
        this.pid = pid;
        this.color = color;
        this.price = price;
        this.mfgdate = mfgdate;
        this.expdate = expdate;
        this.tax = tax;
    }

    public product(String pid, String color, double price, String mfgdate, double tax) {
        this.pid = pid;
        this.color = color;
        this.mfgdate=mfgdate;
        this.price = price;
        this.tax = tax;
    }

    public product(String pid, double price,String color,String expdate,double tax) {
        this.pid = pid;
        this.color = color;
        this.price = price;
        this.expdate=expdate;
        this.tax = tax;

    }
    public product(String pid, double price,String color,String mfgdate,String expdate) {
        this.pid = pid;
        this.color = color;
        this.price = price;
        this.mfgdate=mfgdate;
        this.expdate=expdate;

    }

    void productdetails() {
        System.out.println("============Product Details===============");
        System.out.println("Product ID: " + this.pid);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Manufacturing Date: " + this.mfgdate);
        System.out.println("Expiry Date: " + this.expdate);
        System.out.println("Tax: " + this.tax);
    }
    
    
}
