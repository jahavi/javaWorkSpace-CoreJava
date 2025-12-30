package ObjectAndConstructorPrograms;
class School {

    String[] students = new String[5];
    String[] teachers = new String[5];
    String[] classesList = new String[5];

    int studentCount = 0;
    int teacherCount = 0;
    int classCount = 0;

    void addStudent(String name) {
        if (studentCount < students.length) {
            students[studentCount] = name;
            studentCount++;
            System.out.println("Student Added: " + name);
        } else {
            System.out.println("Student list full");
        }
    }

    void removeStudent(String name) {
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(name)) {
                found = true;

                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[studentCount - 1] = null;
                studentCount--;

                System.out.println("Student Removed: " + name);
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    void addTeacher(String name) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount] = name;
            teacherCount++;
            System.out.println("Teacher Added: " + name);
        } else {
            System.out.println("Teacher list full");
        }
    }

    void removeTeacher(String name) {
        boolean found = false;

        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].equals(name)) {
                found = true;

                for (int j = i; j < teacherCount - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }

                teachers[teacherCount - 1] = null;
                teacherCount--;

                System.out.println("Teacher Removed: " + name);
                break;
            }
        }

        if (!found) {
            System.out.println("Teacher Not Found");
        }
    }

    void createClass(String className) {
        if (classCount < classesList.length) {
            classesList[classCount] = className;
            classCount++;
            System.out.println("Class Created: " + className);
        } else {
            System.out.println("Class list full");
        }
    }

    void displaySchoolDetails() {
        System.out.println("----- School Details -----");

        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }

        System.out.println("Teachers:");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i]);
        }

        System.out.println("Classes:");
        for (int i = 0; i < classCount; i++) {
            System.out.println(classesList[i]);
        }
    }
}
public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc = new School();

        sc.addStudent("Rakesh");
        sc.addStudent("Priya");

        sc.addTeacher("Mr. Rao");
        sc.addTeacher("Mrs. Devi");

        sc.createClass("Math");
        sc.createClass("Science");

        sc.displaySchoolDetails();

        sc.removeStudent("Rakesh");
        sc.removeTeacher("Mr. Rao");

        sc.displaySchoolDetails();
	}

}
