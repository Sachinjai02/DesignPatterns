package structural.facade.ecommerce.solution;

//This is a facade class
//hides all the complexities related to payment process and other stuff on placing order
public class PaymentProcessor {

    PaymentGateway paymentGateway;
    InventoryManagement inventoryManagement;
    OrderManagement orderManagement;
    EmailService emailService;

    public PaymentProcessor(PaymentGateway pg, InventoryManagement im, OrderManagement om, EmailService es) {
        this.paymentGateway = pg;
        this.inventoryManagement = im;
        this.orderManagement = om;
        this.emailService = es;
    }

    public void makePayment() {
        paymentGateway.checkPayment();
        inventoryManagement.updateInventory();
        orderManagement.manageOrder();
        emailService.notifyCustomer();
    }
}
