import java.util.ArrayList;

/**
 * Represents a single day with a list of assignments.
 * Each Day stores its date and maintains a list of assignments scheduled for
 * that day.
 */
public class Day {
    private String name;
    private ArrayList<Assignment> assignmentList;

    /**
     * Constructs a Day with the specified name/date.
     * Initializes an empty assignment list for this day.
     *
     * @param name the name or date of the day (e.g., "1/15" for month/day)
     */
    public Day(String name) {
        this.name = name;
        assignmentList = new ArrayList<Assignment>();
    }

    // getters
    /**
     * Returns the name or date of this day.
     *
     * @return the day's name/date string
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the list of assignments scheduled for this day.
     *
     * @return an ArrayList containing all assignments for this day
     */
    public ArrayList<Assignment> getAssignmentList() {
        return assignmentList;
    }

    // setters
    /**
     * Sets the name or date of this day.
     *
     * @param name the day's name/date to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds an assignment to this day's assignment list.
     *
     * @param assignment1 the Assignment object to add
     */
    public void addAssignment(Assignment assignment1) {
        assignmentList.add(assignment1);
    }

    /**
     * Returns a string representation of this day.
     * Displays the day's name/date followed by all assignments scheduled for that
     * day.
     *
     * @return a formatted string with the day's name and assignments
     */
    @Override
    public String toString() {
        String returnString = name + ": ";
        for (int i = 0; i < assignmentList.size(); i++) {
            returnString += "|" + assignmentList.get(i).getName() + "|";
        }
        return returnString;
    }

}
