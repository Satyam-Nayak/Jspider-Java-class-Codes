class Developer{
    int id ;
    double ctc;
    @Override
    public boolean equals(Object obj){
        Developer d = (Developer)obj;
        if(this.id == d.id && this.ctc == d.ctc){
            return true;
        } else {
            return false;
        }
    }
    Developer(int id,double ctc){
        this.id=id;
        this.ctc=ctc;
    }
}

public class program7 {
    public static void main(String[] args) {
        Developer d1 = new Developer(101, 3.5);
        Developer d2 = new Developer(102, 3.9);
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
    }
    
}
