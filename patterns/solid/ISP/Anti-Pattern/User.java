public interface User {
    public void viewTracking();
    public void updateInventory();

    /*
     * This is an Anti-Pattern as we are forcing the Customer and Admin classes
     * to implement methods which they are not supposed to
     */
}
