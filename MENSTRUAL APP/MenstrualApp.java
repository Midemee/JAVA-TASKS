public class MenstrualApp {

    public static int[] calculateNextPeriod(int day, int month, int year, int cycleLength) {

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        int nextDay = day + cycleLength;
        int nextMonth = month;
        int nextYear = year;

        while (nextDay > daysInMonth[nextMonth - 1]) {
            nextDay = nextDay - daysInMonth[nextMonth - 1];
            nextMonth++;

            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;

                if ((nextYear % 4 == 0 && nextYear % 100 != 0) || (nextYear % 400 == 0)) {
                    daysInMonth[1] = 29;
                } else {
                    daysInMonth[1] = 28;
                }
            }
        }

        return new int[]{nextDay, nextMonth, nextYear};
    }

    public static int[] calculateOvulationDate(int day, int month, int year, int cycleLength) {
        int daysUntilOvulation = cycleLength - 14;
        return calculateNextPeriod(day, month, year, daysUntilOvulation);
    }
}

