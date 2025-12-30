package inheritance;
class Person {
    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Staff extends Person {
    String employeeId;
    String jobTitle;

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s = new Staff();
        s.firstName = "Rama";
        s.lastName = "Krishna";
        s.employeeId = "EMP101";
        s.jobTitle = "Developer";

        System.out.println("First Name: " + s.getFirstName());
        System.out.println("Last Name: " + s.getLastName());
        System.out.println("Employee ID: " + s.getEmployeeId());
	}

}
