public class LazySingleton {

    private static LazySingleton instance;
    
    private LazySingleton(){
        //preventing external classes to create an object
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton(); //Lazy Initialization after accessing it for the first time
        }
        return instance;
    }
}
