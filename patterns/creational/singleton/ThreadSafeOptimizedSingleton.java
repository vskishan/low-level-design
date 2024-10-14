public class ThreadSafeOptimizedSingleton {
    
    private static volatile ThreadSafeOptimizedSingleton instance;
    
    private ThreadSafeOptimizedSingleton(){
        //preventing external classes to create an object
    }

    public static ThreadSafeOptimizedSingleton getInstance(){
        if(instance == null){

            //Synchronized block to break the contention in cocurrent env
            
            //It is placed after a prior check as we dont want
            //the overhead caused by synchronzed method/block when trying to get the instance
            //once it is already instantiated
            synchronized (ThreadSafeOptimizedSingleton.class) {
                if (instance == null){
                    instance = new ThreadSafeOptimizedSingleton();
                    return instance;
                }
            }
            //Lazy Initialization after accessing it for the first time
        }
        return instance;
    }
}
