import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    String firstName;

    School() {
    };

    public void addTeacher(String firstName, String lastName, String subject) {
        teachers.add(new Teacher(firstName, lastName, subject));
    };

    public void addStudent(String firstName, String lastName, int grade) {
        students.add(new Student(firstName, lastName, grade));
    };

    public void removeTeacher(String firstName) {
        for(int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getFirstName() == firstName) {
                teachers.remove(i);
            }
        }
    };

    public void removeStudent(String firstName) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getFirstName() == firstName) {
                students.remove(i);
            };
        };
    };

    public void showTeachers() {
        for(int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        };
    };

    public void showStudents() {
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        };
    };
}
