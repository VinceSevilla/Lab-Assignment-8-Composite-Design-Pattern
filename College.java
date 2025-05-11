import java.util.ArrayList;
import java.util.List;

public class College implements EducationalComponent {
    private String name;
    private List<EducationalComponent> children = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalComponent c) {
        children.add(c);
    }

    public void remove(EducationalComponent c) {
        children.remove(c);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (EducationalComponent c : children) {
            total += c.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double sum = 0;
        for (EducationalComponent c : children) {
            sum += c.getBudget();
        }
        return sum;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.printf("%sCollege: %s%n", indent, name);
        for (EducationalComponent c : children) {
            c.displayDetails(indent + "  ");
        }
    }
}