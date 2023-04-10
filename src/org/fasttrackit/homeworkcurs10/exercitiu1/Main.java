package org.fasttrackit.homeworkcurs10.exercitiu1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            List<StudentGrade> studentGrades = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("files/grades.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                String name = parts[0];
                String discipline = parts[1];
                int grade = Integer.parseInt(parts[2]);
                StudentGrade sg = new StudentGrade(name, discipline, grade);
                studentGrades.add(sg);
            }
            br.close();
            Classroom classroom = new Classroom(studentGrades);
            System.out.println(classroom.getGradesForDiscipline("Mathematics"));
            System.out.println(classroom.getGradesForStudent("Utu Arcadius"));
            System.out.println(classroom.getMaxGrade());
            System.out.println(classroom.getWorstGrade("Physics"));
            System.out.println(classroom.getAverageGrade("Computer Science"));
            System.out.println(classroom.getMaxGrade("History"));

        } finally {

        }
    }
}
