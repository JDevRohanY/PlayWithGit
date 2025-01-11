package inheritance;

public class Student extends User{
    double psp;
    public Student(String name, int age, double psp) {
        super(name, age);
        System.out.println("Student Constructor called");
        this.psp = psp;
    }
}
