import java.util.Scanner;

class A{
    // Members
    int x; // Instance
    static int y; // Class (Load)
}
// A a = new A();
// A a2 =new A();
// A a3 = new A();

class SalarySlip{

    // I18N
    // Locale 


    // rAm kuMAr ShARMA
    // names[0] = "rAm" names[1]=kuMAr names[2]=ShARMA
    // rAm r = 0 , A = 1 m = 2
    // Ram Kumar Sharma
    static String properCase(String name){
        String names[] = name.split(" ");
         String fullName = "";
        for(int i = 0; i<names.length; i++){
            String n = names[i];
            char firstLetter = n.charAt(0);
            String firstLetterUpperCase = String
            .valueOf(firstLetter).toUpperCase(); // char to String convert
            String remString = n.substring(1)
            .toLowerCase();
            String result = firstLetterUpperCase+ 
            remString+" ";
            fullName = fullName + result;
        }
        return fullName;
        
    }
    static void input(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt(); // 1001 \n
        scanner.nextLine(); // eat \n
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter the Basic Salary");
        double basicSalary = scanner.nextDouble();
        compute(id, name, basicSalary);
        scanner.close();
    }
    static void compute(int id, String name, double basicSalary){
        double hra = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double ma = basicSalary * 0.25;
        double da = basicSalary * 0.20;
        double pf = basicSalary * 0.05;
        print(id, name, basicSalary, hra, da, ta,ma, pf);
    }
    static void print(int id, String name, double basicSalary, double hra, double da, double ta, double ma, double pf){
        System.out.println("Id "+id);
        System.out.println("Name "+properCase(name));
        System.out.println("Basic Salary "+basicSalary);
        System.out.println("Earning \t\tDeduction");
        System.out.println("Hra "+hra+"\t\t"+"PF  "+pf);
        System.out.println("DA  "+da);
        System.out.println("TA  "+ta);
        System.out.println("MA  "+ma);
    }
    public static void main(String[] args) {
        input();
        
    }
}