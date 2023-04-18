package org.fasttrackit.Homeworkcurs11.exercitiu1;

import java.util.HashMap;
import java.util.Map;

public class StudentGradesMap {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Ioana", 7);
        studentGrades.put("Ioan", 9);
        studentGrades.put("Vasile", 4);
        studentGrades.put("Roxana", 10);
        studentGrades.put("Emil", 8);
        System.out.println("All students: ");
        for (String student : studentGrades.keySet()) {
            System.out.println(student + ": " + studentGrades.get(student));
        }

        String highestGradeStudent = null;
        int highestGrade = Integer.MIN_VALUE;
        for (String student : studentGrades.keySet()) {
            int grade = studentGrades.get(student);
            if (grade > highestGrade) {
                highestGrade = grade;
                highestGradeStudent = student;
            }

        }
        System.out.println("Student with highest grade: " + highestGradeStudent + " (" + highestGrade+ ")");
    }
}