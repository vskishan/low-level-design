public class ECommerce {

    public static void main(String[] args) {
        CreditCardPayment cardPayment = new CreditCardPayment();
        OrderFulfillment orderFulfillment = new OrderFulfillment();
        orderFulfillment.completeOrder(1, cardPayment);
    }
    
}
