package vn.edu.eiu.cse456.presentation;

import vn.edu.eiu.cse456.data.BankTransferPayment;
import vn.edu.eiu.cse456.data.CardPayment;
import vn.edu.eiu.cse456.data.EWalletPayment;
import vn.edu.eiu.cse456.data.PaymentMethod;
import vn.edu.eiu.cse456.service.PaymentService;

import java.util.Scanner;

public class MainPresentation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select payment method:");
            System.out.println("1. Credit/Debit Card");
            System.out.println("2. E-wallet");
            System.out.println("3. Bank Transfer");
            int choice = scanner.nextInt();

            System.out.print("Enter payment amount: ");
            double amount = scanner.nextDouble();

            PaymentMethod method;

            switch (choice) {
                case 1:
                    method = new CardPayment();
                    break;
                case 2:
                    method = new EWalletPayment();
                    break;
                case 3:
                    method = new BankTransferPayment();
                    break;
                default:
                    System.out.println("Invalid option.");
                    scanner.close();
                    return;
            }

            PaymentService service = new PaymentService(method);
            service.processPayment(amount);

            scanner.close();
    }
}
