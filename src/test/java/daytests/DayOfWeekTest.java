
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class DayOfWeekTest {

    @Test
    public void test1() {
        DayOfWeekUtility day = new DayOfWeekUtility();
        assertEquals("Monday", day.getDayOfWeek(1));
        assertEquals("Tuesday", day.getDayOfWeek(2));
        assertEquals("Wednesday", day.getDayOfWeek(3));
        assertEquals("Thursday", day.getDayOfWeek(4));
        assertEquals("Friday", day.getDayOfWeek(5));
        assertEquals("Saturday", day.getDayOfWeek(6));
        assertEquals("Sunday", day.getDayOfWeek(7));
        assertEquals("Invalid day number. Please provide a number between 1 and 7.", DayOfWeekUtility.getDayOfWeek(0));
        assertEquals("Invalid day number. Please provide a number between 1 and 7.", DayOfWeekUtility.getDayOfWeek(8));
    }

   // @Test
    //public void test2() {
       // DayOfWeekUtility day = new DayOfWeekUtility();
        //int dayNumber = 5;
       // assertEquals("Friday", DayOfWeekUtility.getDayOfWeekNextYear(year));
        //assertEquals("Friday", day.getDayOfWeekNextYear(2023));
        //assertEquals("Friday", day.getDayOfWeekNextYear(2024));




    @Test
    public void test3() {
        int plusYears = 1;

        LocalDateTime ldt = LocalDateTime.now().plusYears(plusYears);
        int dayNumber = ldt.getDayOfWeek().getValue();
        String expectedDayValue = getDayOfWeek(dayNumber);

        assertEquals(expectedDayValue, DayOfWeekUtility.getDayOfWeekNextYear(plusYears));


    }

    public static String getDayOfWeek(int dayNumber) {

        if (dayNumber >= 1 && dayNumber <= 7) {
            return switch (dayNumber) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day number";
            };
        }

        return "Invalid day number. Please provide a number between 1 and 7.";
    }

}
