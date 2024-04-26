// IQ - Super vs this
class GrandParent {
    int x;
    GrandParent(int x){
        // CurrentClassInstance.x = x (local)
        this.x = x;
    }
}
class Parent extends GrandParent{
    int x;
    Parent(int x){
        super(1); // Cons Call
        this.x = x;
    }

}
class Child extends Parent{
    int x;
    Child(int  x){
        super(2); // first line call
        // super.x (Parent Member Call)
        // this.x = x + super.x + ((GrandParent)this).x;
        this.x = x + ((Parent)this).x + ((GrandParent)this).x;
        System.out.println(this.x);
    }
}
public class SuperVsThis {
    public static void main(String[] args) {
       Child c = new Child(3) ;
    }
}
