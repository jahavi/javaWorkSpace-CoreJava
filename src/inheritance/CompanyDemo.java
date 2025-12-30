package inheritance;
class BaseEmployee {
    String name;
    String address;
    double salary;
    String jobTitle;

    double calculateBonus() {
        return 0;
    }

    String performanceReport() {
        return "General Performance Report";
    }

    String manageProject() {
        return "General Project Management";
    }
}

// Manager Subclass
class EmpManager extends BaseEmployee {

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    String performanceReport() {
        return "Manager oversees team performance.";
    }

    @Override
    String manageProject() {
        return "Manager is managing project timelines and meetings.";
    }
}

// Developer Subclass
class EmpDeveloper extends BaseEmployee {

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    String performanceReport() {
        return "Developer completes coding tasks efficiently.";
    }

    @Override
    String manageProject() {
        return "Developer is implementing project features.";
    }
}

// Programmer Subclass
class EmpProgrammer extends BaseEmployee {

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    String performanceReport() {
        return "Programmer writes and debugs code.";
    }

    @Override
    String manageProject() {
        return "Programmer supports project through bug fixing.";
    }
}
public class CompanyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpManager m = new EmpManager();
        m.name = "Ravi";
        m.address = "Hyderabad";
        m.salary = 80000;
        m.jobTitle = "Manager";

        System.out.println("---- Manager ----");
        System.out.println("Name: " + m.name);
        System.out.println("Bonus: " + m.calculateBonus());
        System.out.println("Report: " + m.performanceReport());
        System.out.println("Project: " + m.manageProject());


        System.out.println("\n---- Developer ----");
        EmpDeveloper d = new EmpDeveloper();
        d.name = "Sai";
        d.address = "Chennai";
        d.salary = 60000;
        d.jobTitle = "Developer";

        System.out.println("Name: " + d.name);
        System.out.println("Bonus: " + d.calculateBonus());
        System.out.println("Report: " + d.performanceReport());
        System.out.println("Project: " + d.manageProject());


        System.out.println("\n---- Programmer ----");
        EmpProgrammer p = new EmpProgrammer();
        p.name = "Kiran";
        p.address = "Bangalore";
        p.salary = 50000;
        p.jobTitle = "Programmer";

        System.out.println("Name: " + p.name);
        System.out.println("Bonus: " + p.calculateBonus());
        System.out.println("Report: " + p.performanceReport());
        System.out.println("Project: " + p.manageProject());
	}

}
