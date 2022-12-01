package behavioural.observer.ecommerce;

public class AppNotifier implements Subscriber {

    public AppNotifier() {
        Flipkart.getInstance().registerSubscriber(this);
    }
    @Override
    public void announce() {
        sendNotification();        
    }

    private void sendNotification() {
        System.out.println("notification sent to app");
    }
}
