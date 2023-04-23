package org.fasttrackit.curs12.exceptions.homework12;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DailyPlanner planner = new DailyPlanner();

        planner.addActivity(Day.MONDAY, "Go for a run");
        planner.addActivity(Day.MONDAY, "Work on project");
        planner.addActivity(Day.TUESDAY, "Attend meeting");
        planner.addActivity(Day.WEDNESDAY, "Take a break");

        planner.removeActivity(Day.MONDAY, "Go for a run");

        List<String> tuesdayActivities = planner.getActivities(Day.TUESDAY);
        System.out.println("Tuesday activities: " + tuesdayActivities);

        try {
            Map<Day, List<String>> plan = planner.endPlanning();
            System.out.println("Plan: " + plan);
        } catch (NoActivitiesForDayException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            planner.addActivity(Day.THURSDAY, null);
        } catch (NoActivityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            planner.removeActivity(Day.TUESDAY, "Go for a run");
        } catch (NoActivityException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    }

