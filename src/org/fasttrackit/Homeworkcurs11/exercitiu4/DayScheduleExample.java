package org.fasttrackit.Homeworkcurs11.exercitiu4;

import java.util.Arrays;
import java.util.List;

public class DayScheduleExample {

    public enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static class DaySchedule{
        private final DayOfWeek day;
        private final List<String> activities;


        public DaySchedule(DayOfWeek day, List<String> activities) {
            this.day = day;
            this.activities = activities;
        }

        public DayOfWeek getDay() {
            return day;
        }

        public List<String> getActivities() {
            return activities;
        }
    }

    public static void main(String[] args) {
        DaySchedule mondaySchedule = new DaySchedule(DayOfWeek.MONDAY, Arrays.asList("Reading", "Meeting friends", "Eating"));

        System.out.println("For this day " + mondaySchedule.getDay() + ":");
        for (String activity : mondaySchedule.getActivities()){
            System.out.println("- " + activity);
        }
    }
}
