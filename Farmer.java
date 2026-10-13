/**
 * Represents a farmer registered in the agriculture management system.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class Farmer extends Person {

    protected String farmName;
    protected String location;

    /**
     * Creates a farmer.
     *
     * @param name farmer name
     * @param age farmer age
     * @param contact farmer contact number
     * @param farmName farm name
     * @param location farm location
     */
    public Farmer(String name, int age, String contact,
                  String farmName, String location) {

        super(name, age, contact);
        this.farmName = farmName;
        this.location = location;
    }

    /**
     * Displays farmer information.
     */
    public void displayFarmer() {
        displayPerson();
        System.out.println("Farm Name : " + farmName);
        System.out.println("Location  : " + location);
    }

    /**
     * Adds an agricultural product.
     *
     * @param product product name
     */
    public void addProduct(String product) {
        System.out.println(product + " added to " + farmName);
    }
}