package behavioural.observer.ecommerce;

import java.util.ArrayList;
import java.util.List;

//This should be a singleton
public class Flipkart {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private static Flipkart instance = null;

    public static Flipkart getInstance() {
        if(instance==null) {
            instance = new Flipkart();
        }
        return instance;
    }
    public void registerSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void unregister(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void orderPlaced() {
        //email service send email
        //app notifier notify
        //invoice generator generateInvoice
        //inv management system update inventory
        // Had it not been an Subject-Observer Pub-sub DP, it would have violated OCP and SRP

        for(Subscriber subs: subscriberList) {
            subs.announce();
        }
    }
}