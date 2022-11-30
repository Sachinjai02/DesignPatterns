package creational.factory.practicalfactory.flutter.client;

import creational.factory.practicalfactory.flutter.Flutter;
import creational.factory.practicalfactory.flutter.UIFactory;
import creational.factory.practicalfactory.flutter.UIFactoryFactory;
import creational.factory.practicalfactory.flutter.button.Button;
import creational.factory.practicalfactory.flutter.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory iosUiFactory = flutter.createUIFactory("Android");

        Button button = iosUiFactory.createButton();
        button.changeSize(3, 4);

        Menu menu = iosUiFactory.createMenu();
        System.out.println(button);
        System.out.println(menu);
    }
}
