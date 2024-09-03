class Person {
    long aadhar;

    Person(long aadhar) {
        this.aadhar = aadhar;
    }
    
    @Override
    public String toString() {
        return "Person [aadhar=" + aadhar + "]";
    }
}

public class program8 {
    public static void main(String[] args) {
        Person person = new Person(329798006972l);
        Person person2 = new Person(929798006972l);
        System.out.println(person);
        System.out.println(person2);
    }
}
