package behavioural.observer.ecommerce;

public class InvoiceGenerator implements Subscriber {
    public InvoiceGenerator() {
        Flipkart.getInstance().registerSubscriber(this);
    }
    @Override
    public void announce() {
        generateInvoice();
    }

    private void generateInvoice() {
        System.out.println("Generated Invoice");
    }
}
