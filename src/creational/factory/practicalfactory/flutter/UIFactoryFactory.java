package creational.factory.practicalfactory.flutter;

//This is the example of practical factory
//Returns the correct variant of UIFactory based on different criterion
//Even though there are if else here it doesn't violate OCP since its the part of business logic
//of factory class
public class UIFactoryFactory {
    public static UIFactory getUIFactoryByPlatform(String platform) {
        if(platform.equalsIgnoreCase("Android")) {
            return new AndroidUIFactory();
        }
        return new IOSUIFactory();
    }

    public static AndroidUIFactory createAndroidUIFactory() {
        return new AndroidUIFactory();
    }
}
