package org.fasttrackit.curs12.exceptions.homework12;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CommandLineMenu {
    private static DailyPlanner planner = new DailyPlanner();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please choose an option:");
            System.out.println("1) add an activity");
            System.out.println("2) remove an activity");
            System.out.println("3) list all activities");
            System.out.println("4) end planning");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addActivity();
                    break;
                case "2":
                    removeActivity();
                    break;
                case "3":
                    listActivities();
                    break;
                case "4":
                    endPlanning();
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    private static void addActivity() {
        System.out.println("Enter the day:");
        String dayStr = scanner.nextLine();
        Day day = Day.valueOf(dayStr.toUpperCase());

        System.out.println("Enter the activity:");
        String activity = scanner.nextLine();

        try {
            planner.addActivity(day, activity);
            System.out.println("Activity added successfully.");
        } catch (NoActivityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void removeActivity() {
        System.out.println("Enter the day:");
        String dayStr = scanner.nextLine();
        Day day = Day.valueOf(dayStr.toUpperCase());

        System.out.println("Enter the activity:");
        String activity = scanner.nextLine();

        try {
            planner.removeActivity(day, activity);
            System.out.println("Activity removed successfully.");
        } catch (NoActivityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void listActivities() {
        for (Day day : Day.values()) {
            List<String> activities = planner.getActivities(day);
            System.out.println(day + ": " + activities);
        }
    }

    private static void endPlanning() {
        try {
            Map<Day, List<String>> plan = planner.endPlanning();
            System.out.println("Plan: " + plan);
        } catch (NoActivitiesForDayException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
