import java.util.ArrayList;

/**
 * Represents a calendar month with a list of Day objects.
 * Each Calendar is initialized with all days for a specific month,
 * and supports adding assignments to individual days or multiple days.
 */
public class Calendar {

    private String name;
    private int number;
    private ArrayList<Day> dayList;

    /**
     * Constructs a Calendar for a specific month.
     * Initializes the month number and populates the day list with all days in that
     * month.
     * The month name is case-insensitive and must match one of the 12 calendar
     * months.
     *
     * @param name the name of the month (e.g., "January", "february", "MARCH")
     */
    public Calendar(String name) {
        this.name = name;
        dayList = new ArrayList<Day>();
        if (name.toLowerCase().equals("january")) {
            number = 1;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("1/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("february")) {
            number = 2;
            for (int i = 1; i <= 28; i++) {
                Day day1 = new Day("2/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("march")) {
            number = 3;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("3/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("april")) {
            number = 4;
            for (int i = 1; i <= 30; i++) {
                Day day1 = new Day("4/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("may")) {
            number = 5;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("5/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("june")) {
            number = 6;
            for (int i = 1; i <= 30; i++) {
                Day day1 = new Day("6/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("july")) {
            number = 7;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("7/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("august")) {
            number = 8;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("8/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("september")) {
            number = 9;
            for (int i = 1; i <= 30; i++) {
                Day day1 = new Day("9/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("october")) {
            number = 10;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("10/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("november")) {
            number = 11;
            for (int i = 1; i <= 30; i++) {
                Day day1 = new Day("11/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if (name.toLowerCase().equals("december")) {
            number = 12;
            for (int i = 1; i <= 31; i++) {
                Day day1 = new Day("12/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

    }

    /**
     * Adds an assignment to a specific day in this calendar month.
     * The assignment is only added if the day has fewer than 4 assignments.
     *
     * @param assignment1 the Assignment object to add
     * @param numDay      the day number (1-based) to add the assignment to
     * @return true if the assignment was successfully added, false if the day is
     *         full
     */
    public boolean addAssignmentToDay(Assignment assignment1, int numDay) {
        if (dayList.get(numDay - 1).getAssignmentList().size() <= 4) {
            dayList.get(numDay - 1).addAssignment(assignment1);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an assignment to multiple consecutive days in this calendar month.
     * Skips days that already have 4 or more assignments, extending the range if
     * needed.
     *
     * @param assignment1 the Assignment object to add to multiple days
     * @param startDay    the starting day number (1-based)
     * @param endDay      the ending day number (1-based)
     * @param dueDate     the due date to use for extending the range if days are
     *                    full
     */
    public void addToMultipleDays(Assignment assignment1, int startDay, int endDay, int dueDate) {
        if ((startDay < endDay) && (startDay < dayList.size()) && (endDay < dayList.size())) {
            for (int i = startDay - 1; i < endDay; i++) {
                if (dayList.get(i).getAssignmentList().size() < 4) {
                    dayList.get(i).addAssignment(assignment1);
                } else if (endDay < dueDate) {
                    endDay++;
                }
            }
        }
    }

    /**
     * Returns the month number of this calendar.
     *
     * @return the month number (1 for January through 12 for December)
     */
    public int getNum() {
        return number;
    }

    /**
     * Returns the list of all Day objects in this calendar month.
     *
     * @return an ArrayList containing all Day objects for this month
     */
    public ArrayList<Day> getList() {
        return dayList;
    }

    /**
     * Counts the number of days in a given range that have 4 or more assignments.
     *
     * @param startingPoint the starting day number (1-based)
     * @param endingPoint   the ending day number in the range
     * @return the number of days in the range that are full (have 4+ assignments)
     */
    public int checkMaxDays(int startingPoint, int endingPoint) {
        int returnValue = 0;
        for (int i = startingPoint - 1; i < endingPoint; i++) {
            if (dayList.get(i).getAssignmentList().size() >= 4) {
                returnValue++;
            }
        }
        return returnValue;
    }

    /**
     * Returns a string representation of this calendar month.
     * Each day is displayed on a separate line with its assignments.
     *
     * @return a formatted string showing all days and their assignments
     */
    @Override
    public String toString() {
        String returnString = "";
        for (int i = 0; i < dayList.size(); i++) {
            returnString += dayList.get(i).toString() + "\n";
        }
        return returnString;
    }

}
