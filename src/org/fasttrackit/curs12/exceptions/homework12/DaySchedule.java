package org.fasttrackit.curs12.exceptions.homework12;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private Day day;
    private List<String> activities;

    public DaySchedule(Day day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public void addActivity(String activity) {
        if (activity == null) {
            throw new NoActivityException("No activity specified");
        }
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        if (!activities.contains(activity)) {
            throw new NoActivityException("Activity not found");
        }
        activities.remove(activity);
    }

    public List<String> getActivities() {
        return activities;
    }

    public Day getDay() {
        return day;
    }
}
