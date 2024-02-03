import java.math.BigInteger;
import java.util.LinkedList;

public class DemoWraper {
   public static void main(String[] args) {
        BigInteger b = new BigInteger("42453464567457567657657657657655765757");
        BigInteger c = b.add(new BigInteger("53453453453454354354553"));
        LinkedList<Integer> list = new LinkedList<>();
        int x = 10;
        list.add(x); // AutoBoxing (Java5)
        // list.add(new Integer(x)); // Boxing
        int y = list.get(0); // UnBoxing
   } 
}
