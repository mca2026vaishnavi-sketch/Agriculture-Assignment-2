/**
 * Represents a farmer who follows organic farming practices.
 *
 * @author Vaishnavi Sharma
 * @version 1.0
 */
public class OrganicFarmer extends Farmer {

    private String certification;

    /**
     * Creates an organic farmer.
     *
     * @param name farmer name
     * @param age farmer age
     * @param contact farmer contact
     * @param farmName farm name
     * @param location farm location
     * @param certification organic certification
     */
    public OrganicFarmer(String name, int age, String contact,
                         String farmName, String location,
                         String certification) {

        super(name, age, contact, farmName, location);
        this.certification = certification;
    }

    /**
     * Displays organic farmer information.
     */
    public void displayOrganicFarmer() {
        displayFarmer();
        System.out.println("Certification : " + certification);
    }

    /**
     * Displays the organic farming method used.
     */
    public void showOrganicMethod() {
        System.out.println("Organic farming methods are used at "
                + farmName + ".");
    }
}
