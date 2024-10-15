public class BillPughSingleton {

    private BillPughSingleton(){
        //preventing external classes to create an object
    }

    private static class Singleton {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        //thread-safety
        //lazy instantiation
        
    }

    public static BillPughSingleton getInstance(){
        return Singleton.INSTANCE;
    }
}
