import java.util.ArrayList;

public class Calendar {

    private String name;
    private ArrayList<Day> dayList;

    public Calendar(String name)
    {
        this.name = name;
        dayList = new ArrayList<Day>();
        if(name.toLowerCase().equals("january"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("1/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("february"))
        {
            for(int i = 1; i <= 28; i++)
            {
                Day day1 = new Day("2/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("march"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("3/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("april"))
        {
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("4/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("may"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("5/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("june"))
        {
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("6/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("july"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("7/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("august"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("8/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("september"))
        {
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("9/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("october"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("10/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("november"))
        {
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("11/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("december"))
        {
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("12/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

    }

    public void addAssignmentToDay(Assignment assignment1, int numDay)
    {
        dayList.get(numDay - 1).addAssignment(assignment1);
    }

    @Override
    public String toString()
    {
        String returnString = "";
        for(int i = 0; i < dayList.size(); i++)
        {
            returnString += dayList.get(i).toString() + "\n";
        }
        return returnString;
    }

}

