public class PrintFirstName {

    /*
     * Given - Big Problem
     * n = 5
     * n-1
     * // Small Problem
     */
    // 5 times print
    static void show(int num){
        // Termination Case / Base Case
        if(num==0){
            return ; // exit from the function call
        }
        System.out.println("Amit "+num);
        //num - 1; // Small Problem + Recursion
        show(num-1);
        System.out.println("Srivastava "+num);
    }
    public static void main(String[] args) {
        show(5);
    }
}
