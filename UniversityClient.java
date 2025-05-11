public class UniversityClient {
    public static void main(String[] args) {
   
        Teacher t1 = new Teacher("Dr. Anne", "Fundamentals of Programming", 45000.0);
        Teacher t2 = new Teacher("Dr. Maris",   "Advance Calculus", 50000.0);
        Student s1 = new Student("Bins", "S100", 12345);
        Student s2 = new Student("Binsint",  "S102", 13456);
        Student s3 = new Student("Bisinti",   "S103", 14567);

        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Information Technology");
        itDept.add(t2);
        itDept.add(s3);

        College engCollege = new College("College of Computing Studies");
        engCollege.add(csDept);
        engCollege.add(itDept);

        College sciCollege = new College("College of Business");
        sciCollege.add(new Student("Jims", "S201", 11111));

        College newEraUni = new College("New Era University");
        newEraUni.add(engCollege);
        newEraUni.add(sciCollege);

        System.out.println("=== University Details ===");
        newEraUni.displayDetails("");

        System.out.println("\nTotal number of students: " + newEraUni.getNumberOfStudents());
        System.out.printf("Total University budget: %.2f%n", newEraUni.getBudget());
    }
}