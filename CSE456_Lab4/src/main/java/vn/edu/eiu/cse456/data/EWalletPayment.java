package vn.edu.eiu.cse456.data;

public class EWalletPayment implements PaymentMethod{
    @Override
    public void makePayment(double amount) {
        System.out.println("Procedure e-wallet payment of $" + amount);
    }
}
