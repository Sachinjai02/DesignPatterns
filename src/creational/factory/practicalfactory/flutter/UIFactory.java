package creational.factory.practicalfactory.flutter;

import creational.factory.practicalfactory.flutter.button.Button;
import creational.factory.practicalfactory.flutter.dropdown.DropDown;
import creational.factory.practicalfactory.flutter.menu.Menu;
import creational.factory.practicalfactory.flutter.text.Text;

public interface UIFactory {

    Button createButton();
    Text createText();
    Menu createMenu();
    DropDown createDropDown();
}
