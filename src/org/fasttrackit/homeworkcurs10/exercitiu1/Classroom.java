package org.fasttrackit.homeworkcurs10.exercitiu1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinWorkerThread;

public class Classroom {
    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade sg : studentGrades) {
            if (sg.getDiscipline().equals(discipline)) {
                grades.add(sg.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent(String student){
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade sg : studentGrades) {
            if (sg.getName().equals(student)) {
                grades.add(sg.getGrade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade(String discipline){
        StudentGrade maxGrade = null;
        for (StudentGrade sg : studentGrades){
            if (sg.getDiscipline().equals(discipline)){
                if (maxGrade == null || sg.getGrade() > maxGrade.getGrade()){
                    maxGrade = sg;
                }
            }
        }
        return maxGrade;
    }

    public StudentGrade getMaxGrade(){
        StudentGrade maxGrade = null;
        for (StudentGrade sg : studentGrades){
            if (maxGrade == null || sg.getGrade() > maxGrade.getGrade()){
                maxGrade = sg;
            }
        }
        return maxGrade;
    }

    public int getAverageGrade(String discipline){
        List<Integer> grades = getGradesForDiscipline(discipline);
        int sum = 0;
        for(int grade:grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public StudentGrade getWorstGrade(String discipline){
        StudentGrade worstGrade = null;
        for (StudentGrade sg : studentGrades){
            if (sg.getDiscipline().equals(discipline)){
                if (worstGrade == null || sg.getGrade() < worstGrade.getGrade()){
                    worstGrade = sg;
                }
            }
        }
        return worstGrade;
    }
}
