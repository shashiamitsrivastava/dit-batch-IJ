// e.g SavingAccount, CurrentAccount
// Parent class - Common Features

// scopes - Local Scope (With in the fn or with in the block) 
//, private scope (with in the class)
// default scope (with in the folder/ package)
// protected (with in the package , outside the package using inheritance)
// public - with in the package, outside the package
// Note : no global scope is exist in Java

abstract class Loan{
    abstract void computeEMI();
    void loanApprove(){

    }
    abstract void roi();
    abstract void rulesReg();
}
class HomeLoan extends Loan{

    @Override
    void computeEMI() {
        
    }

    @Override
    void roi() {
       
    }

    @Override
    void rulesReg() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rulesReg'");
    }

}
class EducationLoan extends Loan{

    @Override
    void computeEMI() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void roi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void rulesReg() {
        // TODO Auto-generated method stub
        
    }

}

abstract class Account{
    int id; // default scope
    String name;
    double balance;
    double roi;
    public abstract void computeROI(); // Body Less Method (Abstract Method)
    // Method Declare (Not Define), We want define by Child class
    // public void computeROI(){
    //     System.out.println("Account ROI 3% ");
    // }
    public void deposit(){
        System.out.println("Account Class Deposit...");
    }
    public void withDraw(){
        System.out.println("Account Class WithDraw...");
    }
    public void showBalance(){
        System.out.println("Account Class ShowBalance...");
    }
}
// IS A child extends Parent
class SavingAccount extends Account{
    // Overriding - ISA Must Have
    // Parent and Child Method Signature Should be same
    // Overriding - parent method is outdated, that's why override in child class
    // @Override - Annotation - Compiler and developer -  signal here i do overriding
    // Overiding- parent version will be hide
   @Override
    public void computeROI(){
        System.out.println("Saving Account ROI 4.5% ");
    }    
    public void limit(){
        System.out.println("Saving A/c Limit Trans");
    }
}
class CurrentAccount extends Account{
    @Override
    public void computeROI(){
        System.out.println("Current Account ROI 5.5% ");
    }
    public void noLimit(){
        System.out.println("Current A/c No Trans Limit");
    }
    public void odLimit(){
        System.out.println("Current A/C OD Limit...");
    }
}
public class ISADemo {
    public static void main(String[] args) {
       // Account account =new Account();
        SavingAccount sa = new SavingAccount();
        sa.deposit();
        sa.limit();
        sa.withDraw();
        sa.computeROI(); // Child Version
        // sa.computeROI();
        // sa.computeROISA();

        System.out.println("********************");
        CurrentAccount ca = new CurrentAccount();
        ca.deposit();
        ca.odLimit();
        ca.noLimit();
        ca.withDraw();
        ca.computeROI();
    }
}
