package creational.factory.abstractfactory.database.client;

import creational.factory.abstractfactory.database.Database;
import creational.factory.abstractfactory.database.DatabaseFactory;
import creational.factory.abstractfactory.database.MySqlDatabase;
import creational.factory.abstractfactory.database.query.Query;
import creational.factory.abstractfactory.database.transaction.Transaction;
import creational.factory.abstractfactory.database.updater.Updater;

public class UserService {
    private Database db;
    private DatabaseFactory dbFactory;

    public UserService(Database db) {
        this.db = db;
        this.dbFactory = this.db.createDatabaseFactory();
    }
    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDatabase());
        Query query = userService.dbFactory.createQuery();
        Transaction transaction = userService.dbFactory.createTransaction();
        Updater updater = userService.dbFactory.createUpdater();
        System.out.println(query);
        System.out.println(transaction);
        System.out.println(updater);
    }
}
