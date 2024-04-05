class Fibo{
    static int fibo(int n){
        // Base Case
        if(n<=1){
            return n;
        }
        // Small Problem n-1
        int firstTerm = fibo(n-1);
        int secondTerm = fibo(n-2);
        int thirdTerm = firstTerm + secondTerm;
        return thirdTerm;
    }
    public static void main(String[] args) {
        int r = fibo(5);
        System.out.println(r);
    }
}