/**
 * Represents a tourist registered in the tourism management system.
 *
 * A tourist inherits common personal information from Person.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class Tourist extends Person {

    private String nationality;

    /**
     * Creates a tourist with the specified details.
     *
     * @param name tourist name
     * @param age tourist age
     * @param contact tourist contact number
     * @param nationality tourist nationality
     */
    public Tourist(String name, int age, String contact, String nationality) {
        super(name, age, contact);
        this.nationality = nationality;
    }

    /**
     * Returns the nationality of the tourist.
     *
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Displays tourist information.
     */
    public void displayTourist() {
        displayPerson();
        System.out.println("Nationality : " + nationality);
    }

    /**
     * Books a tourism package.
     *
     * @param packageName name of the selected package
     */
    public void bookPackage(String packageName) {
        System.out.println("Tourist " + getName()
                + " booked package: " + packageName);
    }
}