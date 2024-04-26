interface A{
    void show();
}
interface B{
    void show(); // public abstract void show();
    void disp();
}
interface Hybrid extends A, B{

}
class D{

}
//class C extends D implements A, B{
    class C extends D implements Hybrid{
    @Override
    public void show(){
        System.out.println("C Show");
    }
    public void disp(){
        System.out.println("C Disp");
    }
}
public class InterfaceRule {
    public static void main(String[] args) {
        
    }
}
