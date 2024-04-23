import java.util.Scanner;

// Class is a BluePrint
// class - PascalCase
// Custom Data Type
// Encapsulation- Binding Data and Methods into a Single unit, and that
// unit is called class.
// Good Encapsulation - Data Hiding (Variable ) + Methods Public
class Employee{
    // Features
    // Members of Class Employee
    // private - keyword (Access Specifier) - with in the class scope
    private int id; // instance Variables (Object create)
    private String name;
    private double salary;
    private String companyName;
    // constructor not return anything, even it is not void
    // class name and constructor name must be same
    // when u create an object u call constructor
    // constructor - object construct constructor call
    // constructor - it is used to initalize the instance variables of a class
    // Every Class by default has default constructor
    // this default constructor will do nothing
    // it is just empty
    Employee(){
        System.out.println("I am a Default Constructor");
        // id = 100;
        // name = "";
        // salary = 100;
        companyName = "SkillRisers";
    }
    // Constructor Overloading
    // Parameterized Constructor
    Employee(int id, String name, double salary){
        this();
        // this(); // Calling Default Constructor
        System.out.println("THis is a Parameterized Constructor");
        // Instance var = Local Var
        this.id = id + companyName.length();
        this.name = name;
        this.salary = salary;
       
       

    }
    void Employee(){
        System.out.println("I am Not a Constructor , I am a Method");
    }


    public void input(int id, String name, double salary){
        if(id<=0 || salary<=0){
            System.out.println("Invalid Data");
            return;
        }
        // this - optional to write
        // this - keyword 
        // this - i contains the current calling object reference
        // Member Variable = Local Variable
        // Local var = Local Var (Shadow Problem) Nearest Variable
        this.id = id; // this.id = 1001;
        this.name = name; // this.name = "Ram Kumar"
        this.salary = salary;
        // this actual solve the shadow problem
    }

    public void print(){
        System.out.println("Company "+companyName);
        System.out.println("Id "+id); // 7k.id
        System.out.println("Name "+name);
        System.out.println("Salary "+salary);
    }
    // setter and getter
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public int getId() {
        return id;
    }
   

    

}
class Demo1{
    public static void main(String[] args) {
        // ram - Local Variable (Scope with in the main)
        Scanner scanner = new Scanner(System.in);
        Employee ram; // ram is a reference variable of type Employee
       // ram = new Employee(); // Constructor Calling
       ram = new Employee(1001, "Ram Kumar", 10000);
       ram.setSalary(ram.getSalary() + 20000);
       //ram.salary = ram.salary + 20000;
        //ram.Employee(); // method call
        // System.out.println("Enter the Id");
        // int id = scanner.nextInt();
        // System.out.println("Enter the Name");
        // String name = scanner.next();
        // System.out.println("Enter the Salary");
        // double salary = scanner.nextDouble();
        // ram.id = -10001;
        // ram.name = "";
        // ram.salary = -99999;
        //ram.input(id, name, salary);
        ram.print();
        scanner.close();
        // System.out.println(ram.id); // 7k.id
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        // ram.id = 1001;
        // ram.name = "Ram Kumar";
        // ram.salary = 10000;

        // System.out.println(ram.id); // 7k.id
        // System.out.println(ram.name);
        // System.out.println(ram.salary);

        // new Employee () - will create an object
        // new - keyword (Reserved Word)
        // new - allocate memory dynamically
        int x ; // x is a variable, of type int
        x= 100;
    }
}