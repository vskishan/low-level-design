public class ECommerce {

    public static void main(String[] args) {
        IPaymentMethod paymentMethod = new FreePayment();
        //FreePayment is now able to be substituted without any errors
        OrderFulfillment orderFulfillment = new OrderFulfillment();
        orderFulfillment.completeOrder(1, paymentMethod); 
    }
    
}
