public class Pyramid {
    public static void main(String[] args) {
        int range = 5;
        for(int row = 0; row<range; row++){
            // Space Print
            for(int space = 1; space<=range -row; space++){
                System.out.print(" ");
            }
            int odd = 2 * row + 1;
            // Star Print
            for(int star = 1; star<=odd; star++ ){
                System.out.print("*");
            }
            // Move to Next Line
            System.out.println();
        }

        // int range = 5;
        // for(int row = 1; row<=range; row++){
        //     // Space Print
        //     for(int space = 1; space<=range -row; space++){
        //         System.out.print(" ");
        //     }
        //     // Star Print
        //     for(int star = 1; star<=row; star++ ){
        //         System.out.print("* ");
        //     }
        //     // Move to Next Line
        //     System.out.println();
        // }
    }
}
