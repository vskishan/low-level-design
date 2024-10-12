public class ECommerce {

    public static void main(String[] args) {
        IPaymentMethod paymentMethod = new CreditCardPayment();
        OrderFulfillment orderFulfillment = new OrderFulfillment();
        orderFulfillment.completeOrder(1, paymentMethod); 
    }
    
}
