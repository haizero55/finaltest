
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Day {
   
    private String dayName;
    private List<Classes> classes;
    private String specialNote;

    public Day(String dayName) {
        this.dayName = dayName;
        this.classes = new ArrayList<>();
    }

    public String getDayName() {
        return dayName;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }

    public void addClasses(Classes cls) {
        classes.add(cls);
    }

    public void removeClasses(int classNumber) {
    }

    public void editDayName(String newDayName) {
        this.dayName = newDayName;
    }

    @Override
    public String toString() {
        StringBuilder dayString = new StringBuilder("Day: " + dayName);
        for (Classes cls : classes) {
            dayString.append("\n").append(cls);
        }
        if (specialNote != null) {
            dayString.append("\nSpecial Note: ").append(specialNote);
        }
        return dayString.toString();
    }
}

