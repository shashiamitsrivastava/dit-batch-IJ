public class Strong {
    static int fact(int digit){
        int result = 1;
        while(digit>1){
            result = result * digit;
            digit--;
        }
        return result;

    }
    public static void main(String[] args) {
        int num = 100;
        int cpy = num;
        int sum = 0;
        while(cpy!=0){
            int digit = cpy % 10; // 145 % 10 = 5
            int factorial = fact(digit); // fact(5)
            sum = sum + factorial;
            cpy /= 10; // number will be small
            
        }
        System.out.println(num==sum
        ?"Strong Number":"Not a Strong Number");
    }
}
