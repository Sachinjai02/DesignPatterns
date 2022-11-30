package creational.factory.abstractfactory.database;

public interface Database {

    public void connect(String url);
    public void changeUrl(String newUrl);
    public void increasePoolSize(int newSize);
    public String getVersion();

    //Factory Method to get the abstract factory
    public DatabaseFactory createDatabaseFactory();

}
