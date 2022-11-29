package Singleton;

public class DatabaseConnection {

    //no need of volatile, references read/write are always atomic
    private static DatabaseConnection instance = null;
    //Being a singleton, no caller should be allowed to manually create an instance.
    private DatabaseConnection() {
        super();
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
           synchronized (DatabaseConnection.class) {
           //double-checked locking
               if(instance == null) {
                    instance = new DatabaseConnection();
               }
            }
        }
        return instance;
    }
}
