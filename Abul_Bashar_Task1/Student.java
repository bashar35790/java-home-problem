public class Student {
    private String name;
    private int id;
    private double cgpa;
    private String department;

    public Student(String name, int id, double cgpa, String department) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + department);
    }
}

