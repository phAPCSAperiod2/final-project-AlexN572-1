import java.util.ArrayList;

public class Day
{
    private String name;
    private ArrayList<Assignment> assignmentList;

    public Day(String name)
    {
        this.name = name;
        assignmentList = new ArrayList<Assignment>();
    }

    //getters
    public String getName()
    {
        return name;
    }
    public ArrayList<Assignment> getAssignmentList()
    {
        return assignmentList;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void addAssignment(Assignment assignment1)
    {
        assignmentList.add(assignment1);
    }

    @Override
    public String toString()
    {
        String returnString = name;
        for(int i = 0; i < assignmentList.size(); i++)
        {
            returnString += "\n" + assignmentList.get(i).getName();
        }
        return returnString;
    }


}
