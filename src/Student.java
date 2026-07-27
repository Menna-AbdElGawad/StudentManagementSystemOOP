public class Student {
    private
        int studentID;
        String studentName;
        double grade;

    public Student() {}

    public Student(int studentID, String studentName, double grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGrade() {
        return grade;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString() {
        return studentID + "\t" + studentName + "\t" + grade + "\n";
    }

    public void display() {

        System.out.println("- Student ID: " + studentID);
        System.out.println("- Student Name: " + studentName);
        System.out.println("- Grade: " + grade);

        System.out.println("\n=============================\n");

    }
}
