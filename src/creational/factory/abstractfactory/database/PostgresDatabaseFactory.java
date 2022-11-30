package creational.factory.abstractfactory.database;

import creational.factory.abstractfactory.database.query.PostgresQuery;
import creational.factory.abstractfactory.database.query.Query;
import creational.factory.abstractfactory.database.transaction.PostgresTransaction;
import creational.factory.abstractfactory.database.transaction.Transaction;
import creational.factory.abstractfactory.database.updater.PostgresUpdater;
import creational.factory.abstractfactory.database.updater.Updater;

public class PostgresDatabaseFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new PostgresTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new PostgresUpdater();
    }
}
