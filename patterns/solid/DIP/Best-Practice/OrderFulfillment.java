public class OrderFulfillment {
    
    public void completeOrder(int userId, IPaymentMethod paymentMethod){
        paymentMethod.pay();
    }

    /*
     * This class now depends on an abstraction of a PaymentMethod hence any new types of payments
     * that gets added in future will not result in code changes of this class
     */
}
