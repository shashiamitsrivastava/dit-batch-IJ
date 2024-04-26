// Online Payment
// 1. NetBanking 2. UPI 3. PAYTM 4.Credit Card 5. Debit Card 5. Paypal 
interface IPayment{
    boolean pay(int amount, int ac);
    boolean cancel();
    boolean pending();
    String summary();
}
class NetBanking implements IPayment{

    @Override
    public boolean pay(int amount, int ac) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    @Override
    public boolean cancel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancel'");
    }

    @Override
    public boolean pending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pending'");
    }

    @Override
    public String summary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'summary'");
    }

}
class UPI implements IPayment{

    @Override
    public boolean pay(int amount, int ac) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    @Override
    public boolean cancel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancel'");
    }

    @Override
    public boolean pending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pending'");
    }

    @Override
    public String summary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'summary'");
    }

}
class PayTM{

}
public class Example2 {
    
}
