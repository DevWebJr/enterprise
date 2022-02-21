package Individual;

public class Person {

    private int id;

    private String last_name;

    private String first_name;

    private boolean gender;

    Person(int id, String last_name, String first_name, boolean gender) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.gender = gender;
    }

    void show_details() {
        if(this.gender) {
            System.out.printf("%s %s est un homme.", this.last_name, this.first_name);
        }
        else {
            System.out.printf("%s %s est un femme.", this.last_name, this.first_name);
        }
    }

}
