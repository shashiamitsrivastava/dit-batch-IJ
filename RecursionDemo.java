public class RecursionDemo {
    
    // Name Print 5 Times (Big Problem)
    static void show(int num){
        
        // Base Condition
        // Termination Case
        if(num==0){
            return ;
        }
        System.out.println("Amit"); // Processing Logic
        show(num-1); // Small Problem  + Recursion (Cycle)
    }
    public static void main(String[] args) {
        show(5);
    }
}
