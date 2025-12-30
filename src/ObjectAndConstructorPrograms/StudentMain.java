package ObjectAndConstructorPrograms;
class Student {

    String name;
    String grade;
    String[] courses = new String[5];
    int count = 0;

    void setDetails(String n, String g) {
        name = n;
        grade = g;
    }

    void addCourse(String courseName) {
        if (count < courses.length) {
            courses[count] = courseName;
            count++;
            System.out.println("Course Added: " + courseName);
        } else {
            System.out.println("Cannot add more courses");
        }
    }

    void removeCourse(String courseName) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (courses[i].equals(courseName)) {
                found = true;

                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }

                courses[count - 1] = null;
                count--;

                System.out.println("Course Removed: " + courseName);
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found");
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);

        System.out.println("Courses:");
        if (count == 0) {
            System.out.println("No Courses Added");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(courses[i]);
            }
        }
    }
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

        s.setDetails("Rakesh", "A");

        s.addCourse("Math");
        s.addCourse("Science");
        s.addCourse("Java");

        s.displayDetails();

        s.removeCourse("Science");

        s.displayDetails();
	}

}
