public class ThreadSafeSingleton {
    
    private static volatile ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){
        //preventing external classes to create an object
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        //Making this thread safety by marking the method as synchronized
        //Threby preventing the creation of multiple instances in a concurrent environment

        //But when this method is invoked from second time unnecessary overhead due to synchronized 
        //as we don't move to creation logic itself
        if(instance == null){
            instance = new ThreadSafeSingleton(); //Lazy Initialization after accessing it for the first time
        }
        return instance;
    }
}
