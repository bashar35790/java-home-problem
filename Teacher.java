
public class Teacher {

    String name, gender;
    int phoneNumber;

    void setInfo(String name, String gender, int phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    Teacher(String name, String gender, int phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    void getInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Gender: " + gender);
        System.out.println("Teacher Phone Number: " + phoneNumber);
        System.out.println("\n\n");
    }

}
