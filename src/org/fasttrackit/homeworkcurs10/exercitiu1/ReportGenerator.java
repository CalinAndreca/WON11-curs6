package org.fasttrackit.homeworkcurs10.exercitiu1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ReportGenerator {
    private List<StudentGrade> studentGrades;

    public ReportGenerator(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void generateReport() throws IOException {
        try {
            FileWriter fw = new FileWriter("files/grade-reports.txt");
            PrintWriter pw = new PrintWriter(fw);

            // highest grade
            StudentGrade maxGrade = null;
            for (StudentGrade sg : studentGrades) {
                if (maxGrade == null || sg.getGrade() > maxGrade.getGrade()) {
                    maxGrade = sg;
                }
            }
            pw.println("Highest grade: " + maxGrade.getName() + " " + maxGrade.getGrade());

            // average grade
            int sum = 0;
            for (StudentGrade sg : studentGrades) {
                sum += sg.getGrade();
            }
            int avgGrade = sum / studentGrades.size();
            pw.println("Average grade: " + avgGrade);

            // lowest grade
            StudentGrade minGrade = null;
            for (StudentGrade sg : studentGrades) {
                if (minGrade == null || sg.getGrade() < minGrade.getGrade()) {
                    minGrade = sg;
                }
            }
            pw.println("Lowest grade: " + minGrade.getName() + " " + minGrade.getGrade());

            pw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

