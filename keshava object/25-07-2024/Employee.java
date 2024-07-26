import java.util.HashSet;
import java.util.Set;

class employ1{
    static int start_id=1001;
    final int id;
    String name;
    double salary;
    String designation;


    Employee(String name, double salary, String designation)
    {
        id = start_id++;
        this.name = name;
        this.salary=salary;
        this.designation=designation;
    }
    void details(){
        System.out.println("ID:"+id+"Name: " + name+"Salary: " + salary+ "Desgination: " + designation);
    }


}

public class Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("ramsh")
        
    }
}
