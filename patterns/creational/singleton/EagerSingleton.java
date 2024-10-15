public class EagerSingleton {
    
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    //Eager initialization upon loading the class
    
    private EagerSingleton(){
        //preventing external classes to create an object
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
