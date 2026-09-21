public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Abul Bashar");
        teacher.setAge(40);
        teacher.setQualification("PhD in Computer Science");

        System.out.println("Teacher's Name: " + teacher.getName());
        System.out.println("Teacher's Age: " + teacher.getAge());   
        System.out.println("Teacher's Qualification: " + teacher.getQualification());
    }
}