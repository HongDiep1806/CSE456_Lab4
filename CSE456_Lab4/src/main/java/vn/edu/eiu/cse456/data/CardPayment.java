package vn.edu.eiu.cse456.data;

public class CardPayment implements PaymentMethod{
    @Override
    public void makePayment(double amount) {
        System.out.println("Procedure card payment of $" + amount);
    }
}
