/**
 * Represents a farm tourism experience available to tourists.
 *
 * @author AVaishnavi Sharma
 * @version 1.0
 */
public class FarmTour {

    private int tourId;
    private String farmName;
    private String activity;
    private double price;

    /**
     * Creates a farm tour.
     *
     * @param tourId farm tour identification number
     * @param farmName name of the farm
     * @param activity activity offered
     * @param price tour price
     */
    public FarmTour(int tourId, String farmName,
                    String activity, double price) {

        this.tourId = tourId;
        this.farmName = farmName;
        this.activity = activity;
        this.price = price;
    }

    /**
     * Displays farm tour details.
     */
    public void displayFarmTour() {
        System.out.println("Tour ID  : " + tourId);
        System.out.println("Farm     : " + farmName);
        System.out.println("Activity : " + activity);
        System.out.println("Price    : Rs. " + price);
    }

    /**
     * Books the farm tour.
     *
     * @param touristName name of the tourist
     */
    public void bookTour(String touristName) {
        System.out.println("Farm tour booked successfully for "
                + touristName + ".");
    }
}
