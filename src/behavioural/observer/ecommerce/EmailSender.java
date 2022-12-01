package behavioural.observer.ecommerce;

public class EmailSender implements Subscriber {

    public EmailSender() {
        Flipkart.getInstance().registerSubscriber(this);
    }
    @Override
    public void announce() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email sent");
    }
}
