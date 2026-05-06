/**
 * Represents an assignment with a name, due date, and time to complete.
 * Stores assignment details and provides getters and setters for all
 * properties.
 */
public class Assignment {

    private String name;
    private int dayDue;
    private int monthDue;
    private int assignmentLength;

    /**
     * Constructs an Assignment with the specified details.
     *
     * @param name             the name of the assignment
     * @param dayDue           the day the assignment is due (1-based)
     * @param monthDue         the month the assignment is due (1-12)
     * @param assignmentLength the number of days it takes to complete the
     *                         assignment
     */
    public Assignment(String name, int dayDue, int monthDue, int assignmentLength) {
        this.name = name;
        this.dayDue = dayDue;
        this.monthDue = monthDue;
        this.assignmentLength = assignmentLength;
    }

    // Getters
    /**
     * Returns the name of this assignment.
     *
     * @return the assignment name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the day this assignment is due.
     *
     * @return the due day (1-based)
     */
    public int getDayDue() {
        return dayDue;
    }

    /**
     * Returns the month this assignment is due.
     *
     * @return the due month (1-12)
     */
    public int getMonthDue() {
        return monthDue;
    }

    /**
     * Returns the length of time (in days) needed to complete this assignment.
     *
     * @return the number of days to complete the assignment
     */
    public int getAssignmentLength() {
        return assignmentLength;
    }

    // Setters
    /**
     * Sets the name of this assignment.
     *
     * @param name the assignment name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the day this assignment is due.
     *
     * @param dayDue the day to set (1-based)
     */
    public void setDayDue(int dayDue) {
        this.dayDue = dayDue;
    }

    /**
     * Sets the month this assignment is due.
     *
     * @param monthDue the month to set (1-12)
     */
    public void setMonthDue(int monthDue) {
        this.monthDue = monthDue;
    }

    /**
     * Sets the length of time (in days) needed to complete this assignment.
     *
     * @param assignmentLength the number of days to set
     */
    public void setAssignmentLength(int assignmentLength) {
        this.assignmentLength = assignmentLength;
    }

    /**
     * Returns a string representation of this assignment.
     * Includes the assignment name, due date, and time to
     * complete.
     *
     * @return a formatted string with assignment details
     */
    @Override
    public String toString() {
        return "Assignment Name: " + name + "\nDue Date: " + monthDue + "/" + dayDue + "\nTime to complete: " + assignmentLength;
    }
}
