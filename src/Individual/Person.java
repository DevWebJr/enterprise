package Individual;

public class Person {

    private int id;

    private String lastName;

    private String firstName;

    private boolean gender;

    Person(int id, String lastName, String firstName, boolean gender) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    void show_details() {
        if(this.gender) {
            System.out.printf("%s %s est un homme.", this.lastName, this.firstName);
        }
        else {
            System.out.printf("%s %s est un femme.", this.lastName, this.firstName);
        }
    }

}
