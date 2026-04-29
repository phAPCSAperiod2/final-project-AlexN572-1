import java.util.ArrayList;

public class Calendar {

    private String name;
    private int number;
    private ArrayList<Day> dayList;

    public Calendar(String name)
    {
        this.name = name;
        dayList = new ArrayList<Day>();
        if(name.toLowerCase().equals("january"))
        {
            number = 1;
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("1/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("february"))
        {
            number = 2;
            for(int i = 1; i <= 28; i++)
            {
                Day day1 = new Day("2/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("march"))
        {
            number = 3;
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("3/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("april"))
        {
            number = 4;
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("4/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("may"))
        {
            number = 5;
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("5/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("june"))
        {
            number = 6;
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("6/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("july"))
        {
            number = 7;
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("7/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("august"))
        {
            number = 8;
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("8/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("september"))
        {
            number = 9;
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("9/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("october"))
        {
            number = 10;
            for(int i = 1; i <= 31; i++)
            {
                Day day1 = new Day("10/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("november"))
        {
            number = 11;
            for(int i = 1; i <= 30; i++)
            {
                Day day1 = new Day("11/" + String.valueOf(i));
                dayList.add(day1);
            }
        }

        if(name.toLowerCase().equals("december"))
        {
            number = 12;
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

    public void addToMultipleDays(Assignment assignment1, int startDay, int endDay)
    {
        if((startDay < endDay)&&(startDay < dayList.size())&&(endDay < dayList.size()))
        {
            for(int i = startDay - 1; i < endDay; i++)
            {
                dayList.get(i).addAssignment(assignment1);
            }
        }
    }

    public int getNum()
    {
        return number;
    }

    public ArrayList<Day> getList()
    {
        return dayList;
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

