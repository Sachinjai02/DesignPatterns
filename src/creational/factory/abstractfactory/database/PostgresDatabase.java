package creational.factory.abstractfactory.database;

public class PostgresDatabase implements Database {
    @Override
    public void connect(String url) {

    }

    @Override
    public void changeUrl(String newUrl) {

    }

    @Override
    public void increasePoolSize(int newSize) {

    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostgresDatabaseFactory();
    }
}
