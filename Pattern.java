public class Pattern {
    static void printStar(int numberOfStars){
        // Base Case
        if(numberOfStars ==0){
            return ; 
        }
        System.out.print("*");
        printStar(numberOfStars-1);
    }
    static void printLine(int numberOfLines){
        // Base Case
        if(numberOfLines ==0){
            return ; 
        }
        
        printLine(numberOfLines-1);
        // Stack Fall
        printStar(numberOfLines);
        System.out.println();
       
        
    }
    public static void main(String[] args) {
        printLine(5);
    }
}
