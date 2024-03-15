public class Fact {
    static int fact(int num){
        // One time
        // Base Case
        if(num==1){
            return 1; // result
        }
        int result = fact(num-1);
        return result * num;
        // Repeat (N-Time)
    }
    /*
     * 5! - 5*4*3*2*1
     * Small Problem (5->4)
     * n= 5
     * n-1
     * Base Case n==1
     */
    static void fact(int num, int result){
        // Base case
        if(num==1){
            System.out.println("Fact "+result);
            return ;
        }
        // Small Problem
        fact(num-1, num*result);
    }
    public static void main(String[] args) {
        //fact(5, 1);
        System.out.println(fact(5));
    }
}
