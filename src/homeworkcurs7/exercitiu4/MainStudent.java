package homeworkcurs7.exercitiu4;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 9);
        Student s2 = new Student("Alin", 6);
        Student s3 = new Student("Mirela", 10);

        System.out.println("Number of students: " + Student.numberOfStudents);
        System.out.println("Average grade: " + Student.getAverageGrade());
    }
}
