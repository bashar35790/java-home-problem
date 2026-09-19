public class TeacherTester {
    public static void main(String[] args){
        Teacher teacher1;
        Teacher teacher2;
        teacher1 = new Teacher();
        teacher2 = new Teacher();
        teacher1.setInfo("John", "Male", 1234567890);
        teacher2.setInfo("Jane", "Female", 987654321);

        teacher1.getInfo();
        teacher2.getInfo();

    }
}