/**
 * Represents a farmer who provides both agricultural products
 * and tourism experiences.
 *
 * This class combines farming and tourism services to support
 * an agro-tourism business.
 *
 * @author Vaishnavi Sharma
 * @version 1.0
 */
public class AgroTourismFarmer extends Farmer
        implements AgriculturalProvider, TourismProvider {

    private String tourismActivity;

    /**
     * Creates an agro-tourism farmer.
     *
     * @param name farmer name
     * @param age farmer age
     * @param contact farmer contact
     * @param farmName farm name
     * @param location farm location
     * @param tourismActivity tourism activity offered
     */
    public AgroTourismFarmer(String name, int age, String contact,
                             String farmName, String location,
                             String tourismActivity) {

        super(name, age, contact, farmName, location);
        this.tourismActivity = tourismActivity;
    }

    /**
     * Provides agricultural products to visitors.
     */
    @Override
    public void provideAgriculturalProducts() {
        System.out.println("Fresh vegetables, fruits and farm products "
                + "are available at " + farmName + ".");
    }

    /**
     * Provides tourism experiences to visitors.
     */
    @Override
    public void provideTourismExperience() {
        System.out.println("Tourism Activity : " + tourismActivity);
    }

    /**
     * Displays complete agro-tourism information.
     */
    public void displayAgroTourismDetails() {
        displayFarmer();
        System.out.println("Tourism Activity : " + tourismActivity);
    }
}
