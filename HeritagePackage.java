/**
 * Represents a tourism package focused on historical and cultural
 * destinations.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class HeritagePackage extends TourismPackage {

    private String historicalSite;

    /**
     * Creates a heritage tourism package.
     *
     * @param packageId package identification number
     * @param packageName package name
     * @param destination destination
     * @param duration duration in days
     * @param price package price
     * @param historicalSite historical site included in the package
     */
    public HeritagePackage(int packageId, String packageName,
                           String destination, int duration,
                           double price, String historicalSite) {

        super(packageId, packageName, destination, duration, price);
        this.historicalSite = historicalSite;
    }

    /**
     * Displays heritage package details.
     */
    @Override
    public void displayPackage() {
        super.displayPackage();
        System.out.println("Historical Site : " + historicalSite);
    }
}