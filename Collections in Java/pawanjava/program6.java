class Student {
    long mobile = 9969690812L;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student s = (Student) obj;
        return this.mobile == s.mobile;
    }
}

public class program6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));
    }
}
