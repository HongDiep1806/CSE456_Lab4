package vn.edu.eiu.cse456.service;

import vn.edu.eiu.cse456.data.PaymentMethod;

// Single Responsibility Principle:
// This class only handles business logic related to processing payments by many methods.
public class PaymentService {
    private PaymentMethod paymentMethod;
    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void processPayment(double amount) {
        paymentMethod.makePayment(amount);
    }
}
