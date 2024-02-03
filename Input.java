import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
       int id = scanner.nextInt(); // 1001\n
        System.out.println("Enter the Name");
       // String name = scanner.next();
       scanner.nextLine(); // eat \n
       String name = scanner.nextLine(); // \n
       
       System.out.println("Id "+id);
        System.out.println("Name "+name);
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = scanner2.next();
        System.out.println("City "+city);
        scanner.close();
        scanner2.close();
       // int singleValue = System.in.read();
      // byte w [] =System.in.readAllBytes();
    //   int count = 0;
    //   Scanner scanner = new Scanner("Hello How are You\n Hi \n Ok\n");
    //   // scanner.nextXXX(); - word
    //   // scanner.nextLine(); - line
    //  // while(scanner.hasNext()){
    //     while(scanner.hasNextLine()){
    //     scanner.nextLine();
    //     //scanner.next();// current word read and move to next word
    //     count++;
    //     //System.out.println(scanner.next());
    //   }
    //  // System.out.println("Word "+count);
    //  System.out.println("Lines "+count);
    //   scanner.close();

      //Scanner scanner = new Scanner(System.in);
       // System.out.println(singleValue);
       // System.out;
    }
}
