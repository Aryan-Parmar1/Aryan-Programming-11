public class Student {
    String firstName;
    String lastName;
    int grade;
    int studentId;
    static int universalId = 1;

    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentId = universalId;
        universalId++;
    };

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentId;
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }
}
