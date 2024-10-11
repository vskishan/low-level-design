public class OrderProcessing {

    public void orderFulfillment(long userId){
        //Logic to handle orders
    }

    public void paymentprocessing(long userId, long orderId){
        //Logic to handle payments
    }

    /*
     * This is an Anti-Pattern as we are handling both the payments and order fulfillments in a single class
     */
}