package creational.factory.abstractfactory.database;

import creational.factory.abstractfactory.database.query.Query;
import creational.factory.abstractfactory.database.transaction.Transaction;
import creational.factory.abstractfactory.database.updater.Updater;

//This is an abstract factory class which contains all factory methods for Database
//This enables us to get instances of Query, Transaction, Updater for corresponding Databases
public interface DatabaseFactory {
    Query createQuery();
    Transaction createTransaction();
    Updater createUpdater();
}
