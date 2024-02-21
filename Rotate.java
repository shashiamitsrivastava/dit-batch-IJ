public class Rotate {
    public static void main(String[] args) {
        int num = 12345;
        int rotations = -1;
        int count = 0;
        int cpy = num;
        
        // Count the digit
        while(cpy!=0){
            cpy /=10; // make the number small 
            count++;
            }
        rotations = rotations % count;
        if(rotations<0){
            rotations = rotations + count;
        }
        int rhs = num % (int)Math.pow(10, rotations);
        //System.out.println(rhs); // 45
        int lhs = num / (int)Math.pow(10, rotations);
        //System.out.println(lhs); // 123
        
        // 45 * 10^3 + 123 = 45123
        int result = rhs * 
        (int)Math.pow(10, count- rotations) + lhs;
        System.out.println(result);

        //System.out.println(rhs + ""+lhs);
    }
}
