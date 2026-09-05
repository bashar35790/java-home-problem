public class Employee {

    public String name;
    public double salary;
    public String designation;

    public void newEmployee(String name) {
        this.name = name;
        salary = 30000;
        designation = "junior";
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }

    public void calculateTax() {

        if (salary > 50000) {
            double tax = salary * 0.30;
            System.out.printf("%s Tax Amount: %.2f Tk%n", name, tax);
        } 
        else if (salary == 30000) {
            double tax = salary * 0.10;
            System.out.printf("%s Tax Amount: %.2f Tk%n", name, tax);
        } 
        else {
            System.out.println("No need to pay tax");
        }
    }

    public void promoteEmployee(String position) {

        if (position.equals("senior")) {
            salary = salary + 25000;
        } 
        else if (position.equals("lead")) {
            salary = salary + 50000;
        } 
        else if (position.equals("manager")) {
            salary = salary + 75000;
        }

        designation = position;

        System.out.println(name + " has been promoted to " + position);
        System.out.printf("New Salary: %.2f Tk%n", salary);
    }
}
