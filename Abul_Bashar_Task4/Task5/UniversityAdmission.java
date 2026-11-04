public class UniversityAdmission {

    public void apply(String department) {
        System.out.println("Applied for: " + department);
        System.out.println("Standard Admission Process");
    }

    public void apply(String department, double gpa) {
        System.out.println("Applied for: " + department);
        System.out.println("GPA: " + gpa);

        if (gpa >= 3.8) {
            System.out.println("Eligible for Written Exam");
        }
    }

    public void apply(String department, double gpa, boolean quota) {
        System.out.println("Applied for: " + department);
        System.out.println("GPA: " + gpa);

        if (quota) {
            System.out.println("Quota Applied");
            System.out.println("Direct Viva Allowed");
        }
    }
}
