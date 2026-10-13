/**
 * Represents a tourism package offered by the system.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class TourismPackage {

    protected int packageId;
    protected String packageName;
    protected String destination;
    protected int duration;
    protected double price;

    /**
     * Creates a tourism package.
     *
     * @param packageId package identification number
     * @param packageName package name
     * @param destination package destination
     * @param duration duration in days
     * @param price package price
     */
    public TourismPackage(int packageId, String packageName,
                          String destination, int duration,
                          double price) {

        this.packageId = packageId;
        this.packageName = packageName;
        this.destination = destination;
        this.duration = duration;
        this.price = price;
    }

    /**
     * Displays the package information.
     */
    public void displayPackage() {
        System.out.println("Package ID   : " + packageId);
        System.out.println("Package Name : " + packageName);
        System.out.println("Destination  : " + destination);
        System.out.println("Duration     : " + duration + " days");
        System.out.println("Price        : Rs. " + price);
    }

    /**
     * Returns the package name.
     *
     * @return package name
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Returns the package price.
     *
     * @return package price
     */
    public double getPrice() {
        return price;
    }
}