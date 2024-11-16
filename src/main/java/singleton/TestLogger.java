package singleton;

class Logger {

    //private member to hold the instance of Logger
    private static Logger logInstance;

    //private constructor
    private Logger(){

    }

    //a public static instance method to provide access to the instance
    public static Logger getLogInstance() {
        if (logInstance == null) {
            synchronized (Logger.class) {
                if (logInstance == null) {
                    logInstance = new Logger();
                }
            }
        }
        return logInstance;
    }

    public void log(String message){
        System.out.println("Log : "+message);
    }
}

public class TestLogger{
    public static void main(String[] args){
        Logger loggerOne = Logger.getLogInstance();
        Logger loggerTwo = Logger.getLogInstance();
        System.out.println(loggerOne == loggerTwo);

        loggerOne.log("logOne: log1");
        loggerTwo.log("LogTwo : log1");
        loggerOne.log("logOne: log2");
        loggerOne.log("LogTwo : log3");
    }

}
