public class SumOfDigit {
    // sum - start 0 
    static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        int  sum = sumOfDigit(num/10);
        sum = sum + num % 10;
        return sum;
    }
    // Small Problem + Recursion
    // Base Case 
    static void sumOfDigit(int num, int sum){
        if(num==0){
            System.out.println("Sum "+sum);
            return ;
        }
        //int result =0;
        // get the digit of a number
        int digit = num % 10; // digit (Local Variable)
        sum = sum + digit;
        sumOfDigit(num/10, sum);
}
public static void main(String[] args) {
    //sumOfDigit(123, 0);
    System.out.println(sumOfDigit(123));
  }  
}
