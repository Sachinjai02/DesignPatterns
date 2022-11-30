package creational.factory.abstractfactory.database;

import creational.factory.abstractfactory.database.query.MySqlQuery;
import creational.factory.abstractfactory.database.query.Query;
import creational.factory.abstractfactory.database.transaction.MySqlTransaction;
import creational.factory.abstractfactory.database.transaction.Transaction;
import creational.factory.abstractfactory.database.updater.MySqlUpdater;
import creational.factory.abstractfactory.database.updater.Updater;

public class MySqlDatabaseFactory implements DatabaseFactory {
    @Override
    public MySqlQuery createQuery() {
        return new MySqlQuery();
    }

    @Override
    public MySqlTransaction createTransaction() {
        return new MySqlTransaction();
    }

    @Override
    public MySqlUpdater createUpdater() {
        return new MySqlUpdater();
    }
}
