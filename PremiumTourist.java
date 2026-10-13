/**
 * Represents a premium tourist.
 *
 * Premium tourists receive additional benefits such as discounts
 * on tourism packages.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class PremiumTourist extends Tourist {

    private double discount;

    /**
     * Creates a premium tourist.
     *
     * @param name tourist name
     * @param age tourist age
     * @param contact tourist contact number
     * @param nationality tourist nationality
     * @param discount discount percentage
     */
    public PremiumTourist(String name, int age, String contact,
                          String nationality, double discount) {

        super(name, age, contact, nationality);
        this.discount = discount;
    }

    /**
     * Returns the discount available to the premium tourist.
     *
     * @return discount percentage
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Displays premium tourist information.
     */
    public void displayPremiumTourist() {
        displayTourist();
        System.out.println("Premium Discount : " + discount + "%");
    }

    /**
     * Calculates the discounted package price.
     *
     * @param price original package price
     * @return discounted price
     */
    public double calculateDiscountedPrice(double price) {
        return price - (price * discount / 100);
    }
}