import java.io.FileNotFoundException;
import java.io.PrintStream;

class Second{

   public static void main(){
      System.out.println("Main zero args");
   }
   static public  void main(String ...a) throws FileNotFoundException{
      main();
      //PrintStream p = new PrintStream("");
      //p.println("Hi");
      System.setOut(new PrintStream("/Users/amitsrivastava/Documents/btech-dit-dsa-batch-wed-fri-AandBSection/result.txt"));
    System.out.println("Hello Java");
 }
}