public class ECommerce {

    public static void main(String[] args) {
        IPaymentMethod paymentMethod = new FreePayment();
        OrderFulfillment orderFulfillment = new OrderFulfillment();
        orderFulfillment.completeOrder(1, paymentMethod); 

        /*
        * Here the payment method is free hence the pay() method present inside the completeOrder()
        * results in an error as we dont have a way to process the payment
        */
    }
    
}
