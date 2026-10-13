import java.util.Scanner;

/**
 * Main class for the Smart Tourism and Agriculture Management System.
 *
 * The system allows users to manage tourists, tourism packages,
 * farmers, agricultural products and farm tourism experiences.
 *
 * @author Vaishnavi Sharma
 * @version 1.0
 */
public class Main {

    /**
     * Main method that starts the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tourist tourist = null;
        PremiumTourist premiumTourist = null;
        Farmer farmer = null;
        OrganicFarmer organicFarmer = null;
        AgroTourismFarmer agroFarmer = null;

        TourismPackage beachPackage = new BeachPackage(
                101,
                "Goa Beach Escape",
                "Goa",
                3,
                8500,
                "Water Sports"
        );

        TourismPackage heritagePackage = new HeritagePackage(
                102,
                "Goa Heritage Tour",
                "Old Goa",
                2,
                6000,
                "Basilica of Bom Jesus"
        );

        FarmTour farmTour = new FarmTour(
                201,
                "Green Valley Farm",
                "Farm Visit and Fruit Picking",
                1200
        );

        int choice;

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println(" SMART TOURISM & AGRICULTURE SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Register Tourist");
            System.out.println("2. Register Premium Tourist");
            System.out.println("3. View Tourism Packages");
            System.out.println("4. Book Tourism Package");
            System.out.println("5. Register Farmer");
            System.out.println("6. Register Organic Farmer");
            System.out.println("7. Register Agro-Tourism Farmer");
            System.out.println("8. View Farm Tourism Experience");
            System.out.println("9. Add Agricultural Product");
            System.out.println("10. View Agro-Tourism Details");
            System.out.println("0. Exit");
            System.out.println("==============================================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n--- Tourist Registration ---");

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter contact: ");
                    String contact = sc.nextLine();

                    System.out.print("Enter nationality: ");
                    String nationality = sc.nextLine();

                    tourist = new Tourist(
                            name,
                            age,
                            contact,
                            nationality
                    );

                    System.out.println("\nTourist registered successfully.");

                    break;

                case 2:

                    System.out.println("\n--- Premium Tourist Registration ---");

                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter contact: ");
                    contact = sc.nextLine();

                    System.out.print("Enter nationality: ");
                    nationality = sc.nextLine();

                    premiumTourist = new PremiumTourist(
                            name,
                            age,
                            contact,
                            nationality,
                            15
                    );

                    System.out.println("\nPremium tourist registered.");
                    System.out.println("Premium discount: 15%");

                    break;

                case 3:

                    System.out.println("\n--- Available Tourism Packages ---");

                    System.out.println("\n1. Beach Package");
                    beachPackage.displayPackage();

                    System.out.println("\n2. Heritage Package");
                    heritagePackage.displayPackage();

                    break;

                case 4:

                    if (tourist == null && premiumTourist == null) {

                        System.out.println(
                                "Please register a tourist first."
                        );

                    } else {

                        System.out.println("\n--- Book Tourism Package ---");
                        System.out.println("1. Goa Beach Escape");
                        System.out.println("2. Goa Heritage Tour");

                        System.out.print("Choose package: ");
                        int packageChoice = sc.nextInt();
                        sc.nextLine();

                        TourismPackage selectedPackage = null;

                        if (packageChoice == 1) {
                            selectedPackage = beachPackage;
                        } else if (packageChoice == 2) {
                            selectedPackage = heritagePackage;
                        } else {
                            System.out.println("Invalid package.");
                            break;
                        }

                        if (premiumTourist != null) {

                            double finalPrice =
                                    premiumTourist.calculateDiscountedPrice(
                                            selectedPackage.getPrice()
                                    );

                            premiumTourist.bookPackage(
                                    selectedPackage.getPackageName()
                            );

                            System.out.println(
                                    "Original Price : Rs. "
                                    + selectedPackage.getPrice()
                            );

                            System.out.println(
                                    "Premium Price  : Rs. "
                                    + finalPrice
                            );

                        } else {

                            tourist.bookPackage(
                                    selectedPackage.getPackageName()
                            );

                            System.out.println(
                                    "Price : Rs. "
                                    + selectedPackage.getPrice()
                            );
                        }
                    }

                    break;

                case 5:

                    System.out.println("\n--- Farmer Registration ---");

                    System.out.print("Enter farmer name: ");
                    name = sc.nextLine();

                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter contact: ");
                    contact = sc.nextLine();

                    System.out.print("Enter farm name: ");
                    String farmName = sc.nextLine();

                    System.out.print("Enter farm location: ");
                    String location = sc.nextLine();

                    farmer = new Farmer(
                            name,
                            age,
                            contact,
                            farmName,
                            location
                    );

                    System.out.println(
                            "Farmer registered successfully."
                    );

                    break;

                case 6:

                    System.out.println("\n--- Organic Farmer Registration ---");

                    System.out.print("Enter farmer name: ");
                    name = sc.nextLine();

                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter contact: ");
                    contact = sc.nextLine();

                    System.out.print("Enter farm name: ");
                    farmName = sc.nextLine();

                    System.out.print("Enter farm location: ");
                    location = sc.nextLine();

                    System.out.print("Enter organic certification: ");
                    String certification = sc.nextLine();

                    organicFarmer = new OrganicFarmer(
                            name,
                            age,
                            contact,
                            farmName,
                            location,
                            certification
                    );

                    System.out.println(
                            "Organic farmer registered successfully."
                    );

                    break;

                case 7:

                    System.out.println("\n--- Agro-Tourism Farmer Registration ---");

                    System.out.print("Enter farmer name: ");
                    name = sc.nextLine();

                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter contact: ");
                    contact = sc.nextLine();

                    System.out.print("Enter farm name: ");
                    farmName = sc.nextLine();

                    System.out.print("Enter farm location: ");
                    location = sc.nextLine();

                    System.out.print("Enter tourism activity: ");
                    String activity = sc.nextLine();

                    agroFarmer = new AgroTourismFarmer(
                            name,
                            age,
                            contact,
                            farmName,
                            location,
                            activity
                    );

                    System.out.println(
                            "Agro-tourism farmer registered successfully."
                    );

                    break;

                case 8:

                    System.out.println("\n--- Farm Tourism Experience ---");

                    farmTour.displayFarmTour();

                    if (tourist != null) {

                        System.out.print(
                                "\nDo you want to book this tour? (Y/N): "
                        );

                        String answer = sc.nextLine();

                        if (answer.equalsIgnoreCase("Y")) {
                            farmTour.bookTour(tourist.getName());
                        }

                    } else {

                        System.out.println(
                                "Register a tourist first to book the tour."
                        );
                    }

                    break;

                case 9:

                    if (farmer == null && organicFarmer == null
                            && agroFarmer == null) {

                        System.out.println(
                                "Please register a farmer first."
                        );

                    } else {

                        System.out.print(
                                "Enter agricultural product: "
                        );

                        String product = sc.nextLine();

                        if (agroFarmer != null) {

                            agroFarmer.addProduct(product);

                        } else if (organicFarmer != null) {

                            organicFarmer.addProduct(product);

                        } else {

                            farmer.addProduct(product);
                        }
                    }

                    break;

                case 10:

                    if (agroFarmer == null) {

                        System.out.println(
                                "Please register an agro-tourism farmer first."
                        );

                    } else {

                        System.out.println(
                                "\n--- Agro-Tourism Details ---"
                        );

                        agroFarmer.displayAgroTourismDetails();

                        System.out.println();

                        agroFarmer.provideAgriculturalProducts();

                        agroFarmer.provideTourismExperience();
                    }

                    break;

                case 0:

                    System.out.println(
                            "\nThank you for using the system!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 0);

        sc.close();
    }
}