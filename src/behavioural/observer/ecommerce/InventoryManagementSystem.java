package behavioural.observer.ecommerce;

public class InventoryManagementSystem implements Subscriber {

    public InventoryManagementSystem() {
        Flipkart.getInstance().registerSubscriber(this);
    }
    @Override
    public void announce() {
        updateInventoryStock();
    }

    private void updateInventoryStock() {
        System.out.println("Updated Inventory stock");
    }
}
