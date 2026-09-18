public class TeacherTester {
    public static void main(String[] args){
        Teacher teacher1;
        teacher1 = new Teacher();
        teacher1.name = "John";
        teacher1.gender = "Male";
        teacher1.phoneNumber = 1234567890;

        System.out.println("Teacher Name: " + teacher1.name);
        System.out.println("Teacher Gender: " + teacher1.gender);
        System.out.println("Teacher Phone Number: " + teacher1.phoneNumber);

    }
}