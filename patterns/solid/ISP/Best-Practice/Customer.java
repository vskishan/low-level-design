public class Customer implements User {
    
    @Override
    public void viewTracking() {
        //Logic to show status
    }

    @Override
    public void updateInventory(){
        throw new UnsupportedOperationException("This action isn't supported");
    
    }
}
