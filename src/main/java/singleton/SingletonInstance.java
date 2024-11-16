package singleton;

public class SingletonInstance {

    //private member to hold the instance of SingletonInstance
    private static SingletonInstance instance;

    //private constructor
    private SingletonInstance(){

    }

    //a public static instance method to provide access to the instance
    public static SingletonInstance getInstance(){
        if(instance == null){
            instance = new SingletonInstance();
        }
        return instance;
    }

}
