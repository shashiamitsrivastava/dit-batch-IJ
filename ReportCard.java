// Pascal Case
// camelCase -Variables , methods
// class Name - Noun
// class = member variables + member functions
// Good Encapsulation - Binding Data Members + Functions into a Single Unit.
// and that unit is called class.
// class - Blue Print / Template / Plan / Features List
// Good Encapsulation = private data members (Data Hiding) + public functions
class Student{
    // Member Variable of a class 
    // Members Memory - create when object is created
    // object create / instance create
    // Instance Variables
    private int rollno; // access with in the class
    private String name;
    private int marks[] = new int[3]; // 3 Subject Marks Store, all fill with 0
    private String collegeName ;
    // No Params - Default Constructor
    Student(){
        collegeName = "SkillRisers";
    }
    // Parameterized Constructor
    Student(int rollno, String name, int marks[]){
        this(); 
        // Call Default Constructor
        //Student(); // Function call (Not Constructor Call)
        // Instance Var = Local Var
        // Shadow Problem
        this.rollno = rollno + collegeName.length();
        this.name = name;
        this.marks = marks;
        
    }
    /*
     * Constructor - I Call when object is created
     * Initalize the Instance Variables
     * Class Name and Constructor name is same.
     */
    // Member Functions / Methods
    private int totalMarks(){
        int total = 0;
        for(var mark : marks){
            total += mark;
        }
        return total;
    }
    private double percentage(){
        return totalMarks() / marks.length;
    }
    private String grade(){
        var percent = percentage();
        if(percent>=90){
            return "A Grade ";
        }
        else if(percent<90 && percent>=70){
            return "B Grade";
        }
        else{
            return "C Grade";
        }
    }
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public void reportCard(){
        System.out.println("************** REPORT CARD of "+collegeName+" **************");
        System.out.println("RollNO "+rollno);
        System.out.println("Name "+name);
        for(var mark : marks){
            System.out.println("Marks "+mark);
        }
        System.out.println("Total Marks "+totalMarks());
        System.out.println("Percentage "+percentage());
        System.out.println("Grade "+grade());
    }
    public int getRollno() {
        return rollno;
    }
}
public class ReportCard {
    public static void main(String[] args) {
        Student ram; // ram is a reference variable of type Student
        int marks [] = new int[]{40,80,100};
        ram = new Student(1001, "Ram Kumar", marks ); 
        marks[0] = 50;
        // ram.grade();
        ram.setMarks(marks);
        ram.reportCard();
        // new Student () - OBject create , address assign ram
        // ram.rollno = -1001;
        // ram.name = "";
        // int marks[] = {90,88,100};
        //ram.marks = marks;
        Student shyam = new Student(1002, "Shyam Kumar", new int[]{100,100,100});
        shyam.reportCard();
        // shyam.rollno  = 1002;
        // shyam. name = "Shyam Kumar";
        // shyam.marks = new int[]{100,100,100};
        int x ; // x is value variable, x type int (numeric non decimal)
        x=10;
    }
}
