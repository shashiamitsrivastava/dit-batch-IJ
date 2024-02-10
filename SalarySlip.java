import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
class SalarySlip{
    static Locale locale ;
    static ResourceBundle rb;

    // Load
    static void loadBundle(){
        rb = ResourceBundle
        .getBundle("message", locale);
    }

    /* 
    static String formatedDate(){
        // Date 
        // DateFormat
    }
    */
    static String formatCurrency(double unformattedVal){
        //NumberFormat nf2 = new NumberFormat();
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(unformattedVal); // $100,000.00
    }

    // Formatting of Result (Amount) 
    // , Currency
    // NumberFormat (Rs, $, Euro)
    // Members (Class / Instance)
    // name - raM kUmaR sHaRmA
    // name = Ram Kumar Sharma
    // names[0] - raM names[1]-kUmaR
    static String properCase(String name){
        //String names[] = name.split(" ");
        String fullName = "";
        for (String n : name.split(" ")){
            fullName += String.valueOf(n.charAt(0))
            .toUpperCase() + 
            n.substring(1)
            .toLowerCase()+" ";
        }
        // for(int i = 0; i<names.length; i++){

        //     // String n = names[i]; // raM
        //     // char firstChar = n.charAt(0);
        //     // String firstLetterCap = String.valueOf(firstChar)
        //     // .toUpperCase();
        //     // String remString = n.substring(1)
        //     // .toLowerCase();
        //     // String n2 = firstLetterCap + remString;
        //     // fullName = fullName + n2 + " ";
        // }
        return fullName.trim();
    }
    static void input(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("हिंदी के लिए 2 दबाएँ");
        int choice = scanner.nextInt();
        if(choice == 1){
            // Java 19 and above
           // locale = Locale.of("en","US");
            locale = new Locale("en", "US");
        }
        else
        if(choice ==2){
            locale = new Locale("hi","IN");
        }
        loadBundle();
        System.out.println("Enter the id");
        int id = scanner.nextInt(); // 1001 \n
        scanner.nextLine(); // eat \n
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the Basic Salary");
        double basicSalary = scanner.nextDouble();
        compute(id, name, basicSalary);
        scanner.close();
    }
    static void compute(int id, String name,double basicSalary){
        double hra = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double da = basicSalary * 0.20;
        double ma = basicSalary * 0.25;
        double pf = basicSalary * 0.05;
        print(id, name , basicSalary, hra, da, ta, ma, pf);
    }
    static void print(int id, String name, double basicSalary, double hra, double da, double ta , double ma, double pf){
        System.out.println("Id "+id);
        System.out.println("Name "+properCase(name));
        System.out.println("Basic Salary "+formatCurrency(basicSalary));
        System.out.println("Earning Allowances \t\tDeduction");
        System.out.println("HRA "+formatCurrency(hra)+" \t\t\t"+"PF "+formatCurrency(pf));
        System.out.println("DA "+formatCurrency(da));
        System.out.println("TA "+formatCurrency(ta) );
        System.out.println("MA "+formatCurrency(ma));
    }
    public static void main(String[] args) {
        input();
        // input
       
        // Compute
        

        // print
        
        
      
    }
}