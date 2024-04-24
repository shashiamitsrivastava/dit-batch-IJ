// SRP - Single Responsiblity Principle - Class / Method
// Easy to Test, Debug, Maintain , Read
// IS-A , HAS - A
class Customer{
    String name; // null
    int id;
    double balance;
    void checkBalance(){
        System.out.println("Check Balance");
    }
}
// IS-A extends
class CashCustomer extends Customer{
    Order order = new Order(); // Has - A
}
class CreditCustomer extends Customer{

}
class Order{

}
public class ClassRelDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.name.toUpperCase());

    }
}
