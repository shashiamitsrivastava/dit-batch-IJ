public class Adder {
    public static void main(String[] args) {
        // for loop
        int sum = 0;
        // for(int i = 0; i<args.length; i++){
        //    sum = sum + Integer.parseInt( args[i]);
        // }
        // Enhance for loop (Java 5)
        for(String a : args){
            sum = sum + Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
// java Adder 10 "20" "30"
// java Adder 
// java Adder 10 20 30 40 50 
// Bat / Shell
// copy con abcd.txt
// md abcd
// cd abcd

