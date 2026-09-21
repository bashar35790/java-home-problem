public class Teacher extends Persion {
    String qualification;

    void displayInfo2(){
        displayInfo(); // Call the parent class method
        System.out.println("Qualification: " + qualification);
    }
}