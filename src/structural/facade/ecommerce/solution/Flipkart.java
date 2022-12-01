package structural.facade.ecommerce.solution;

public class Flipkart {
    PaymentProcessor paymentProcessor;

    public Flipkart(PaymentProcessor pp)  {
        this.paymentProcessor = pp;
    }

    public void makePayment() {
        this.paymentProcessor.makePayment();
    }

    public void addToCart() {

    }

    public void searchItem() {

    }
    

}
