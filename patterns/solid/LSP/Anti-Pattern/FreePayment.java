public class FreePayment implements IPaymentMethod{
    
    @Override
    public void pay() {
        throw new UnsupportedOperationException("Unable to find a payment method");
        //No payment methodology defined here hence this will result in an error
    }
}
