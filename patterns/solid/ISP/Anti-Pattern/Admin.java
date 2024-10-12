public class Admin implements User {
    
    @Override
    public void viewTracking() {
        throw new UnsupportedOperationException("This action isn't supported");
    }

    @Override
    public void updateInventory(){
        //Logic to update inventory
    }
}
