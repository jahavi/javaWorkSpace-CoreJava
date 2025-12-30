package ObjectAndConstructorPrograms;
class EmployeeService {

    String name;
    double salary;
    int hireYear;

    void setDetails(String n, double s, int year) {
        name = n;
        salary = s;
        hireYear = year;
    }

    int calculateYearsOfService(int currentYear) {
        return currentYear - hireYear;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Year: " + hireYear);
    }
}
public class EmployeeServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService e = new EmployeeService();

        e.setDetails("Rakesh", 55000, 2018);

        e.display();

        int years = e.calculateYearsOfService(2025);

        System.out.println("Years of Service: " + years);
	}

}
