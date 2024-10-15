public enum EnumSingleton {

    INSTANCE; //Just a single instance of enum which is thread-safe but eagerly loaded

    public void compute(){
        //some business logic
    }
    
}
