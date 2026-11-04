public class AdmissionTester {
    public static void main(String[] args) {

        UniversityAdmission u = new UniversityAdmission();

        System.out.println("1----------------");
        u.apply("CSE");

        System.out.println("2----------------");
        u.apply("EEE", 3.80);

        System.out.println("3----------------");
        u.apply("BBA", 3.50, true);
    }
}
