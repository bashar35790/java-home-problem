public class ConstractorOverloding{
    String name, gender;
    int phoneNumber;
    
    ConstractorOverloding(){
        System.out.println("Default Constructor");
    }
    ConstractorOverloding(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    ConstractorOverloding(String name, String gender, int phoneNumber){
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("\n\n");
    }

}
    