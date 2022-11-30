package creational.factory.practicalfactory.flutter;

import creational.factory.practicalfactory.flutter.button.AndroidButton;
import creational.factory.practicalfactory.flutter.dropdown.AndroidDropDown;
import creational.factory.practicalfactory.flutter.menu.AndroidMenu;
import creational.factory.practicalfactory.flutter.text.AndroidText;

//Abstract factory
//Collection of factory methods
public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidText createText() {
        return new AndroidText();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
