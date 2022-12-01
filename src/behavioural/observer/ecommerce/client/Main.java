package behavioural.observer.ecommerce.client;

import behavioural.observer.ecommerce.*;

public class Main {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailSender emailSender = new EmailSender();
        InventoryManagementSystem ims = new InventoryManagementSystem();
        InvoiceGenerator ig = new InvoiceGenerator();
        AppNotifier appNotifier = new AppNotifier();

        flipkart.orderPlaced();
    }
}
