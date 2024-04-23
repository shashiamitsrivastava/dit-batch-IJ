class A{
    private int marks[] = new int[3];
    A(){
        System.out.println("Default Cons");
    }
    A(int x){
        this(); // default constructor
        System.out.println("Param Cons");
    }
    A(int x, int y){
        this(x); // call one param constructor
        System.out.println("2 Param Cons");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        A obj = new A(10,20); // calling 2 param constructor
        //System.out.println("Success");
    }   
}
