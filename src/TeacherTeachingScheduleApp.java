
public class TeacherTeachingScheduleApp {
    public static void main(String[] args) {
        TeachingSchedule teachingSchedule = new TeachingSchedule();

        // Add days to the schedule
        teachingSchedule.addDay("Monday");
        teachingSchedule.addDay("Tuesday");
        teachingSchedule.addDay("Wednesday");
        teachingSchedule.addDay("Thursday");
        teachingSchedule.addDay("Friday");

        // Add classes to Monday
        teachingSchedule.addClasses("Monday", new Classes(1, "10:00 AM", "12:00 PM"));
        teachingSchedule.addClasses("Monday", new Classes(2, "2:00 PM", "4:00 PM"));

        // Add a special note to Monday
        teachingSchedule.setSpecialNote("Monday", "No classes in the evening");

        // Display the initial schedule
        teachingSchedule.displaySchedule();

        // Remove classes from Monday
        teachingSchedule.removeClasses("Monday", 1);

        // Display the updated schedule
        teachingSchedule.displaySchedule();

        // Edit day name
        teachingSchedule.editDay("Monday", "NewMonday");

        // Display the schedule after editing day name
        teachingSchedule.displaySchedule();

        // Edit special note
        teachingSchedule.editSpecialNote("NewMonday", "Special classes in the afternoon");

        // Display the schedule after editing special note
        teachingSchedule.displaySchedule();
    }
}
