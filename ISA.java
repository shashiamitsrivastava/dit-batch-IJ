 abstract class Loan{
    int id;
    String name;
    double amount;
    
    void release(){
        System.out.println("Loan Release");
    }
    abstract void emi(); // Declare (What to Do)

    // void emi(){
    //     System.out.println("Loan EMI");
    // }
}
class HomeLoan extends Loan{
    @Override
    // Annotation
    void emi(){ // How to do
       // super.emi();
        System.out.println("Home Loan EMI ");
    }
    @Deprecated
    void longDuration(){
        System.out.println("Home Loan Duration Long");
    }
    void loanFactors(){
        System.out.println("High Loan for Age Less");
    }
}
class PersonalLoan extends Loan{
    void durationLess(){
        System.out.println("Personl Loan Duration Short");
    }
    void riskFactorHigh(){
        System.out.println("Personal Loan Risk Factor High");
    }
    @Override
    void emi() {
       
    }
}
class AutoLoan extends Loan{
    void durationMedium(){
        System.out.println("Auto Loan Duration Less");
    }

    @Override
    void emi() {
        
    }
}
public class ISA {

    static void callLoan(Loan loan){
        loan.emi();
        loan.release();
        if(loan instanceof HomeLoan){ // Downcasting
            ((HomeLoan)loan).loanFactors();
        }
        else if (loan instanceof AutoLoan){
            ((AutoLoan)loan).durationMedium();
        }
    }
    public static void main(String[] args) {
        // HomeLoan homeLoan = new HomeLoan();
       // Loan loan = new HomeLoan(); // Upcasting
        callLoan(new HomeLoan());
        callLoan(new AutoLoan());
        callLoan(new PersonalLoan());
        //Loan loan = new Loan();
        // HomeLoan homeLoan = new HomeLoan();
        // homeLoan.emi(); // Reuse
        // homeLoan.loanFactors();
        // homeLoan.longDuration();
        // homeLoan.release(); // Reuse
        // System.out.println("**************************");
        // AutoLoan autoLoan = new AutoLoan();
        // autoLoan.emi(); // resuse
        // autoLoan.durationMedium();
        // autoLoan.release(); // reuse

        // PersonalLoan personalLoan = new PersonalLoan();
        // personalLoan.emi();
        // personalLoan.release();
        // personalLoan.durationLess();

        
    }
}
