package creational.factory.practicalfactory.flutter;

import creational.factory.practicalfactory.flutter.button.Button;
import creational.factory.practicalfactory.flutter.button.IOSButton;
import creational.factory.practicalfactory.flutter.dropdown.DropDown;
import creational.factory.practicalfactory.flutter.dropdown.IOSDropDown;
import creational.factory.practicalfactory.flutter.menu.IOSMenu;
import creational.factory.practicalfactory.flutter.menu.Menu;
import creational.factory.practicalfactory.flutter.text.IOSText;
import creational.factory.practicalfactory.flutter.text.Text;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Text createText() {
        return new IOSText();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
