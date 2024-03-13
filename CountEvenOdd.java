public class CountEvenOdd {

    // static int [] countEvenOdd(int range){

    // }

    static void countEvenOdd(int range, 
    int evenCount, int oddCount){
        if(range ==0){
            System.out.println("Even "+evenCount 
            +" Odd "+oddCount);
            return ;
        }
        if(range % 2==0){
            evenCount++;
        }
        else{
            oddCount++;
        }
       countEvenOdd(range-1, evenCount, oddCount);
    }
    public static void main(String[] args) {
         countEvenOdd(10, 
         0, 0);   
    }
}
