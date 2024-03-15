public class PrintTable {
    static String printTable2(int num, int val){
        // Base Case
        if(val==0){
            return "";
        }
        String result =printTable2(num, val-1);
        String expression = num +"*"+val+"="+(num*val)+"\n";
        return result + expression;
    }
    static void printTable(int num, int val){
        // Base Case
        //if(val>10){
            if(val ==0){
            return; // exit from the current function call
        }
        // System.out.println(num+"*"+val+"="+(num*val));
        // Small Problem
        printTable(num, val-1);
        System.out.println(num+"*"+val+"="+(num*val));
       // printTable(num, val+1); // Tail Recursion
    }
    public static void main(String[] args) {
        //printTable(5,1);
        //printTable(5, 10);
        String r = printTable2(5, 10);
        System.out.println(r);
    }
}
