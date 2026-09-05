public class UniversityTester {
    public static void main(String[] args) {

        University u1 = new University();
        University u2 = new University();

        System.out.println("Object 1: " + u1);
        System.out.println("Object 2: " + u2);

        System.out.println("Name: " + u1.name);
        System.out.println("Country: " + u1.country);

        System.out.println("Name: " + u2.name);
        System.out.println("Country: " + u2.country);

        System.out.println("Are the locations same? " + (u1 == u2));

        u1.name = "Imperial College London";
        u1.country = "England";

        u2.name = "Brac University";
        u2.country = "Bangladesh";

        System.out.println("\nAfter changing values:");

        System.out.println("Object 1:");
        System.out.println("Name: " + u1.name);
        System.out.println("Country: " + u1.country);

        System.out.println("Object 2:");
        System.out.println("Name: " + u2.name);
        System.out.println("Country: " + u2.country);

        System.out.println("Are the values same? "
                + (u1.name.equals(u2.name) && u1.country.equals(u2.country)));
    }
}
