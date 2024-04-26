/*
 * IQ - Does Java has Multiple Inheritance?
 * YES - Interface
 * NO - Class
 */
// Multi Level Hierarchy
class P{
    int x ;
    P(){
         x= 2;
        System.out.println("P Default Cons");
    }
    P(int x){
        this();
        System.out.println("P Param Cons call");
        this.x =x;
    }
}
class P2 extends P{
    int y;
    P2(){
        super(1);
        y = 1;
        System.out.println("P2 Default Cons");
    }
    P2(int y){
        this(); 
        System.out.println("P2 Param Cons call");
        this.y= y;
    }
}
class P3 extends P2{
    int z;
    P3(){
        super(10); // Parent class param cons
        // Implicit Constructor Call
        //super(); // Super call constructor call (Default Cons)
        z = 10 + y + x;
        System.out.println("P3 Default Cons " + z);
    }
    P3(int z){
        // first line
        this();  // Own Class Default Cons
        //super(10); // Parent Param Cons
        // Explicit Construcotor call
        this.z = z + y + x;
        System.out.println("P3 Param Cons call "+this.z);
        
    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        P3 obj = new P3(2);

    }   
}
