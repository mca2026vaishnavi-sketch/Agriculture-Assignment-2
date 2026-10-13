/**
 * Represents a tourism package focused on beach destinations.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class BeachPackage extends TourismPackage {

    private String beachActivity;

    /**
     * Creates a beach tourism package.
     *
     * @param packageId package identification number
     * @param packageName package name
     * @param destination beach destination
     * @param duration duration in days
     * @param price package price
     * @param beachActivity main beach activity
     */
    public BeachPackage(int packageId, String packageName,
                        String destination, int duration,
                        double price, String beachActivity) {

        super(packageId, packageName, destination, duration, price);
        this.beachActivity = beachActivity;
    }

    /**
     * Displays beach package details.
     */
    @Override
    public void displayPackage() {
        super.displayPackage();
        System.out.println("Beach Activity : " + beachActivity);
    }
}