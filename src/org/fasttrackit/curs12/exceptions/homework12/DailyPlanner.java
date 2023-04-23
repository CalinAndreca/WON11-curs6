package org.fasttrackit.curs12.exceptions.homework12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> schedules;

    public DailyPlanner() {
        schedules = new ArrayList<>();
    }

    public void addActivity(Day day, String activity) {
        DaySchedule daySchedule = getOrCreateDaySchedule(day);
        daySchedule.addActivity(activity);
    }

    public void removeActivity(Day day, String activity) {
        DaySchedule daySchedule = getOrCreateDaySchedule(day);
        daySchedule.removeActivity(activity);
    }

    public List<String> getActivities(Day day) {
        DaySchedule daySchedule = getOrCreateDaySchedule(day);
        return daySchedule.getActivities();
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Day, List<String>> plan = new HashMap<>();
        for (DaySchedule daySchedule : schedules) {
            List<String> activities = daySchedule.getActivities();
            if (activities.isEmpty()) {
                throw new NoActivitiesForDayException("No activities for " + daySchedule.getDay());
            }
            plan.put(daySchedule.getDay(), activities);
        }
        return plan;
    }

    private DaySchedule getOrCreateDaySchedule(Day day) {
        for (DaySchedule daySchedule : schedules) {
            if (daySchedule.getDay() == day) {
                return daySchedule;
            }
        }
        DaySchedule newDaySchedule = new DaySchedule(day);
        schedules.add(newDaySchedule);
        return newDaySchedule;
    }
}
