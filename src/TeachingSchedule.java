
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TeachingSchedule {
    private Map<String, Day> schedule;

    public TeachingSchedule() {
        this.schedule = new HashMap<>();
    }

    public void addDay(String dayName) {
        schedule.put(dayName, new Day(dayName));
    }

    public void removeDay(String dayName) {
        schedule.remove(dayName);
    }

    public void editDay(String oldDayName, String newDayName) {
        if (schedule.containsKey(oldDayName)) {
            Day day = schedule.remove(oldDayName);
            day.editDayName(newDayName);
            schedule.put(newDayName, day);
        }
    }

    public void addClasses(String dayName, Classes cls) {
        if (schedule.containsKey(dayName)) {
            schedule.get(dayName).addClasses(cls);
        }
    }

    public void removeClasses(String dayName, int classNumber) {
        if (schedule.containsKey(dayName)) {
            schedule.get(dayName).removeClasses(classNumber);
        }
    }

    public void setSpecialNote(String dayName, String specialNote) {
        if (schedule.containsKey(dayName)) {
            schedule.get(dayName).setSpecialNote(specialNote);
        }
    }

    public void editSpecialNote(String dayName, String newSpecialNote) {
        if (schedule.containsKey(dayName)) {
            schedule.get(dayName).setSpecialNote(newSpecialNote);
        }
    }

    public void displaySchedule() {
        System.out.println("Teacher Teaching Schedule:");
        for (Day day : schedule.values()) {
            System.out.println(day);
            System.out.println("---------------");
        }
    }
}

