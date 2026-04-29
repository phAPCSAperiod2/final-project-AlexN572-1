public class Assignment
{

    private String name;
    private int dayDue;
    private int monthDue;
    private int assignmentLength;

    public Assignment(String name, int dayDue, int monthDue, int assignmentLength)
    {
        this.name = name;
        this.dayDue = dayDue;
        this.monthDue = monthDue;
        this.assignmentLength = assignmentLength;
    }

    //Getters
    public String getName()
    {
        return name;
    }
    public int getDayDue()
    {
        return dayDue;
    }
    public int getMonthDue()
    {
        return monthDue;
    }
    public int getAssignmentLength()
    {
        return assignmentLength;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDayDue(int dayDue)
    {
        this.dayDue = dayDue;
    }
    public void setMonthDue(int monthDue)
    {
        this.monthDue = monthDue;
    }
    public void setAssignmentLength(int assignmentLength)
    {
        this.assignmentLength = assignmentLength;
    }

    @Override
    public String toString()
    {
        return "Assignment Name: " + name + "\nDue Date: " + monthDue + "/" + dayDue + "\nImportance Level: " + importanceLevel + "\nTime to complete: " + assignmentLength;
    }
}
