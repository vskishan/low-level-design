public class FreePayment implements IPaymentMethod{
    
    @Override
    public void pay(){
        System.out.println("This order is free from any kind of payments !");
    }
}
