public interface IPaymentMethod {

    public abstract void pay();

    /*
     * Different types of payments that might emerge in future can just implement 
     * custom logic for this interface method without altering the existing ones
     */
    
}
