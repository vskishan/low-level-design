public class OrderFulfillment {
    
    public void completeOrder(int userId, CreditCardPayment cardPayment){
        cardPayment.pay();
    }

    /*
     * This is an Anti-Pattern as we are depending the concrete implementation of payment method
     * In future if we have to switch to a new one then we'll have to modify this class as well
     */
}
