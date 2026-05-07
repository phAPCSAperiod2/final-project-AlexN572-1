import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ArrayList<Calendar> year= new ArrayList<Calendar>();
        Calendar calendar1 = new Calendar("january");
        Calendar calendar2 = new Calendar("february");
        Calendar calendar3 = new Calendar("march");
        Calendar calendar4 = new Calendar("april");
        Calendar calendar5 = new Calendar("may");
        Calendar calendar6 = new Calendar("june");
        Calendar calendar7 = new Calendar("july");
        Calendar calendar8 = new Calendar("august");
        Calendar calendar9 = new Calendar("september");
        Calendar calendar10 = new Calendar("october");
        Calendar calendar11 = new Calendar("november");
        Calendar calendar12 = new Calendar("december");

        year.add(calendar1);
        year.add(calendar2);
        year.add(calendar3);
        year.add(calendar4);
        year.add(calendar5);
        year.add(calendar6);
        year.add(calendar7);
        year.add(calendar8);
        year.add(calendar9);
        year.add(calendar10);
        year.add(calendar11);
        year.add(calendar12);

        String[][] yearArray = new String[12][128];
        for(int i = 0; i < 12; i++)
        {
            yearArray[i][0] = String.valueOf(i + 1);
        }
        for(int row = 0; row < 12; row++)
        {
            for(int col = 1; col < 128; col++)
            {
                yearArray[row][col] = null;
            }
        }



        System.out.println("Welcome to the Assignment Scheduler");
        boolean keepPlaying = true;
        while(keepPlaying)
        {
            System.out.println("What is the date today?");
            System.out.print("Month: ");
            int numMonth = input.nextInt();
            System.out.print("Day: ");
            int numDay = input.nextInt();
            input.nextLine();

            boolean keepUsing = true;
            while(keepUsing)
            {
                System.out.println();
                System.out.print("What would you like to do:\n=========================\n1. See Calendar\n2. Add Assignment\n3. See All Assignments\n4. End Day\n5. Quit\n=========================\nYour option: ");
                int menuOption = input.nextInt();
                input.nextLine();
                if(menuOption == 1)
                {
                    System.out.println();
                    for(int i = 0; i < 12; i++)
                    {
                        System.out.println(year.get(i).toString());
                    }
                }
                else if(menuOption == 2)
                {
                    System.out.print("What is the name of your assignment: ");
                    String assignmentName = input.nextLine();
                    System.out.print("What month is the assignment due: ");
                    int monthDue = input.nextInt();
                    System.out.print("What day is it due: ");
                    int dayDue = input.nextInt();
                    System.out.print("How many days will it take to complete: ");
                    int daysToComplete = input.nextInt();
                    input.nextLine();

                    Assignment assignment1 = new Assignment(assignmentName, dayDue, monthDue, daysToComplete);

                    if((daysToComplete == 1)||((monthDue == numMonth)&&(dayDue == numDay)))
                    {
                        boolean added = false;
                        int i = 0;
                        while(!added)
                        {
                            if(year.get(numMonth - 1).getList().get(numDay + i).getAssignmentList().size() >= 4)
                            {
                                i++;
                            }
                            else
                            {
                                if(i > 0)
                                {
                                    year.get(numMonth - 1).addAssignmentToDay(assignment1, numDay + i + 1);
                                    added = true;
                                }
                                else
                                {
                                    year.get(numMonth - 1).addAssignmentToDay(assignment1, numDay + i);
                                    added = true;
                                }
                            }
                        }
                    }
                    else if((numDay + daysToComplete + year.get(numMonth - 1).checkMaxDays(numDay, year.get(numMonth - 1).getList().size()) + year.get(numMonth).checkMaxDays(numDay, year.get(numMonth).getList().size()) ) > year.get(numMonth - 1).getList().size())
                    {
                        int endMonth = numMonth + 1;
                        int endDay = (numDay + daysToComplete+ year.get(numMonth - 1).checkMaxDays(numDay, year.get(numMonth - 1).getList().size()) + year.get(numMonth).checkMaxDays(numDay, year.get(numMonth).getList().size())) - (year.get(numMonth - 1).getList().size());
                        if((endMonth >= monthDue)&&(endDay > dayDue))
                        {
                            year.get(numMonth - 1).addToMultipleDays(assignment1, numDay, year.get(numMonth - 1).getList().size() - 1, year.get(numMonth - 1).getList().size() - 1);
                            year.get(numMonth - 1).addAssignmentToDay(assignment1, year.get(numMonth - 1).getList().size());
                            year.get(numMonth).addToMultipleDays(assignment1, 1, dayDue, dayDue);
                        }
                        else
                        {
                            year.get(numMonth -1).addToMultipleDays(assignment1, numDay, year.get(numMonth - 1).getList().size() - 1, year.get(numMonth - 1).getList().size() - 1);
                            year.get(numMonth - 1).addAssignmentToDay(assignment1, year.get(numMonth - 1).getList().size());
                            year.get(numMonth).addToMultipleDays(assignment1, 1, endDay - 1, dayDue);
                        }
                    }
                    else
                    {
                        if(numDay + daysToComplete > dayDue)
                        {
                            year.get(numMonth - 1).addToMultipleDays(assignment1, numDay, dayDue, dayDue);
                        }
                        else
                        {
                            year.get(numMonth - 1).addToMultipleDays(assignment1, numDay, numDay + daysToComplete - 1, dayDue);
                        }
                    }
                    for(int j = 0; j < 128; j++)
                    {
                        if(yearArray[monthDue - 1][j] == null)
                        {
                            yearArray[monthDue - 1][j] = "|" + assignment1.getName() + "|";
                            j = 128;
                        }
                    }
                }
                else if(menuOption == 3)
                {
                    System.out.println();
                    for(int row = 0; row < 12; row++)
                    {
                        for(int col = 0; col < 128; col++)
                        {
                            if(yearArray[row][col] != null)
                            {
                                System.out.print(yearArray[row][col] + " ");
                            }
                        }
                        System.out.println();
                    }
                }
                else if(menuOption == 4)
                {
                    keepUsing = false;
                }
                else
                {
                    keepUsing = false;
                    keepPlaying = false;
                }
            }
        }

        System.out.println("Thank you for using the Assignment Calendar!");




    }
}
