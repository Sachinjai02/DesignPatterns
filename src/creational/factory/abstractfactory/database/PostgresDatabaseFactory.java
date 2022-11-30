package creational.factory.abstractfactory.database;

import creational.factory.abstractfactory.database.query.PostgresQuery;
import creational.factory.abstractfactory.database.query.Query;
import creational.factory.abstractfactory.database.transaction.PostgresTransaction;
import creational.factory.abstractfactory.database.transaction.Transaction;
import creational.factory.abstractfactory.database.updater.PostgresUpdater;
import creational.factory.abstractfactory.database.updater.Updater;

public class PostgresDatabaseFactory implements DatabaseFactory {
    @Override
    public PostgresQuery createQuery() {
        return new PostgresQuery();
    }

    @Override
    public PostgresTransaction createTransaction() {
        return new PostgresTransaction();
    }

    @Override
    public PostgresUpdater createUpdater() {
        return new PostgresUpdater();
    }
}
