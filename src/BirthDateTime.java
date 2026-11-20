import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minute;
        int dayMax;

        year = SafeInput.getRangedInt(in, "Enter the year you were born", 1920, 2020);
        month = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);
        switch (month) {
            case 2:
                dayMax = 29;
                break;
            case 4, 6, 9, 11:
                dayMax = 30;
                break;
            default:
                dayMax = 31;
        }
        day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, dayMax);
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);
        if (minute < 10) {
            System.out.println("\nYou were born on " + month + "/" + day + "/" + year + " at " + hour + ":0" + minute);
        } else {
            System.out.println("\nYou were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);
        }
    }
}
