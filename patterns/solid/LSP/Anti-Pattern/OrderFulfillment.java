public class OrderFulfillment {
    
    public void completeOrder(int userId, IPaymentMethod paymentMethod){
        paymentMethod.pay();
    }
}
