package singleton;

//Practical example of where Singleton pattern can be used

import java.sql.Connection;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool dbInstance;

    //private constructor
    private DatabaseConnectionPool(){

    }

    //A public static instance method to provide access to the instance
    public static DatabaseConnectionPool getDbInstance(){
        if(dbInstance == null){
            synchronized (DatabaseConnectionPool.class){
                if(dbInstance == null){
                    dbInstance = new DatabaseConnectionPool();
                }
            }
        }
        return dbInstance;
    }

//    public Connection getConnection(){
//        //Retrive a connection from pool
//        return new Connection() {
//        }
//    }
}
