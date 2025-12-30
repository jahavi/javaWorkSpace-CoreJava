package ObjectAndConstructorPrograms;
class Employee {

    String name;
    String jobTitle;
    double salary;

    void setDetails(String n, String j, double s) {
        name = n;
        jobTitle = j;
        salary = s;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void updateSalary(double newSalary) {
        salary = newSalary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();

        e.setDetails("Rakesh", "Software Engineer", 50000);

        e.displayEmployee();

        System.out.println("Annual Salary: " + e.calculateAnnualSalary());

        e.updateSalary(60000);

        System.out.println("Updated Salary: " + e.salary);
	}

}
