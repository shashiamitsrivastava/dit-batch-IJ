class Email{
    static Email obj ; // default value null
     private Email(){

    }
    // int show(){
    //     return 20;
    // }
    static Email getInstance(){
        if(obj == null){
            obj =new Email();
        }
        return obj;
    }
}
public class SingleTon {
    public static void main(String[] args) {
        Email e1 = Email.getInstance();
        Email e2 = Email.getInstance();
        Email e3 = Email.getInstance();
        System.out.println(e1 == e2 && e1 == e3);
        // Email email = new Email();
        // Email email2 = new Email();
        // Email email3 = new Email();

    }
}
