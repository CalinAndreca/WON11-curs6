package homeworkcurs7.exercitiu4;

public class Student implements StundentInterface{
    private final String name;
    private final int grade;
    private static int totalGrades = 0;
    public static int numberOfStudents = 0;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        numberOfStudents++;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int geGrade() {
        return grade;
    }

    public static double getAverageGrade(){
        return(double) totalGrades / numberOfStudents;
    }

}
