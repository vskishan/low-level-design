public class EagerSingletonUsingStaticBlock {
    
    private static EagerSingletonUsingStaticBlock instance;
    
    private EagerSingletonUsingStaticBlock(){
        //preventing external classes to create an object
    }

    static{
        //Eager Instantiation
        //Thread safety
        //Capability to handle errors during instance creation
        try{
            instance = new EagerSingletonUsingStaticBlock();
        } catch (Exception exception){
            System.out.println("Error while creating the instance");
        }
    }

    public static EagerSingletonUsingStaticBlock getInstance(){
        return instance;
    }
}
