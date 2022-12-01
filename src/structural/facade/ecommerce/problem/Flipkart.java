package structural.facade.ecommerce.problem;

//Violates SRP and OCP
public class Flipkart {
    PaymentGateway paymentGateway;
    InventoryManagement inventoryManagement;
    OrderManagement orderManagement;
    EmailService emailService;

    public Flipkart(PaymentGateway pg, InventoryManagement im, OrderManagement om, EmailService es) {
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

    public void addToCart() {

    }

    public void searchItem() {

    }


}
