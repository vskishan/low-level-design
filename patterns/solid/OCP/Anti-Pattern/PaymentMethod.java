public class PaymentMethod {

    public void pay(){
        //Handle payments using credit cards
    }

    /*
     * This is an Anti-Pattern as we might want to change the way how we make payments 
     * i.e. from credit cards to UPI in future, for which the above doesn't support
     */
}