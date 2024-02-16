public class FlipDigitPos {
    public static void main(String[] args) {
        int num = 32145;
        int pos = 0;
        int sum = 0;
        while(num!=0){
        // get the last digit of a number
        int lastDigit = num % 10;
        // count the position
        pos = pos + 1;
        int place = (int)Math.pow(10, lastDigit-1);
        sum = sum + pos * place;
        num = num /10; // make number small
        }
        System.out.println(sum);
    }
}
