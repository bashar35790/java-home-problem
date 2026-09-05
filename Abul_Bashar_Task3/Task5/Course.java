public class Course {

    public String courseName;
    public String courseCode;
    public int courseCredit;

    public void updateDetails(String name, String code, int credit) {
        courseName = name;
        courseCode = code;
        courseCredit = credit;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Credit: " + courseCredit);
    }
}
