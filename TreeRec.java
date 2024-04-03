public class TreeRec {
    static void fun(int n){
        if(n<=0){
            return ;
        }
        System.out.println("Pre Call "+n);
        fun(n-1);
        System.out.println("In B/w Call "+n);
        fun(n-2);
        System.out.println("Post call "+n);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
