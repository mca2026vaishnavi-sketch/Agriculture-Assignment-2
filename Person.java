/**
 * Represents a person in the Smart Tourism and Agriculture Management System.
 *
 * This class contains common information shared by tourists and farmers.
 *
 * @author Aditya Gaonkar
 * @version 1.0
 */
public class Person {

    private String name;
    private int age;
    private String contact;

    /**
     * Creates a person with the specified details.
     *
     * @param name person's name
     * @param age person's age
     * @param contact person's contact number
     */
    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    /**
     * Returns the person's name.
     *
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person's age.
     *
     * @return person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the person's contact number.
     *
     * @return contact number
     */
    public String getContact() {
        return contact;
    }

    /**
     * Displays the person's basic information.
     */
    public void displayPerson() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Contact : " + contact);
    }
}