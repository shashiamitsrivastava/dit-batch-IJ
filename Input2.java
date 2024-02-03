import java.util.ArrayList;
import java.util.List;

class Student extends Object{
    int rollno =1001;
    String name = "Abcd";
}
public class Input2 {
    public static void main(String[] args) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(20);        
        System.out.println(l2.toString());
        Student s  = new Student();
        System.out.println(s.toString()); // s.toString()
        System.out.println("Enter the password");
        char pwd [] = System.console().readPassword();
        String q = "hello";

        System.out.println(pwd.toString());
    }
}
