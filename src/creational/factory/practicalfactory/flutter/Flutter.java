package creational.factory.practicalfactory.flutter;

public class Flutter {

    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setRefreshRate(int refreshRate) {
        System.out.println("Setting refresh rate to " + refreshRate);
    }

    public UIFactory createUIFactory(String platform) {
        return UIFactoryFactory.getUIFactoryByPlatform(platform);
    }

}
