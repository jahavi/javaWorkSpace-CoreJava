package inheritance;
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {

    void work() {
        System.out.println("HR Manager is managing employee work");
    }

    void addEmployee() {
        System.out.println("New employee added");
    }
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager hr = new HRManager();

        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
	}

}
