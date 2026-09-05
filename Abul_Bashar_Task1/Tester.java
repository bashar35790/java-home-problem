public class Tester {
    public static void main(String[] args) {

        Student student1 = new Student("Rifat", 101, 3.50, "CSE");
        Student student2 = new Student("Sakib", 102, 3.75, "EEE");
        Student student3 = new Student("Nabila", 103, 3.90, "BBA");

        // Print initial values
        System.out.println("Initial Values");

        System.out.println("\nStudent 1:");
        student1.printInfo();

        System.out.println("\nStudent 2:");
        student2.printInfo();

        System.out.println("\nStudent 3:");
        student3.printInfo();

        // Update Student 1
        student1.setName("Rifat Hasan");
        student1.setId(201);
        student1.setCgpa(3.80);
        student1.setDepartment("CSE");

        // Update Student 2
        student2.setName("Sakib Ahmed");
        student2.setId(202);
        student2.setCgpa(3.85);
        student2.setDepartment("CSE");

        // Update Student 3
        student3.setName("Nabila Akter");
        student3.setId(203);
        student3.setCgpa(4.00);
        student3.setDepartment("CSE");

        // Print updated values
        System.out.println("\n===== Updated Values =====");

        System.out.println("\nStudent 1:");
        student1.printInfo();

        System.out.println("\nStudent 2:");
        student2.printInfo();

        System.out.println("\nStudent 3:");
        student3.printInfo();
    }
}
