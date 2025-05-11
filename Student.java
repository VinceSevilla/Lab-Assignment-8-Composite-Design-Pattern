public class Student implements EducationalComponent {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name       = name;
        this.studentId  = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getNumberOfStudents() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.printf("%sStudent: %s (ID: %s, Tuition: %.2f)%n",indent , name, studentId, tuitionFee);
    }
}