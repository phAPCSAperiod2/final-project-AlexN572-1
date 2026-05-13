# Assignment Scheduler

A Java-based command-line application that helps students manage and track assignments across an entire year. This scheduler allows users to view calendars, add assignments with due dates, and organize their workload based on completion time.

## Project Overview

The Assignment Scheduler is a capstone software project built using object-oriented design principles. It demonstrates the ability to design and implement a functional piece of software that solves a real problem for students: managing multiple assignments with different due dates and completion times.

### What This Software Does

The Assignment Scheduler provides a menu-driven interface that allows users to:
- Track assignments across all 12 months of the year
- View a full calendar display of all months
- Add new assignments by specifying the assignment name, due date, and time required to complete it
- See all scheduled assignments across the year
- Progress through days as work is completed

### Who It's For

This software is designed for students who want to manage their assignments effectively. Instead of losing track of what's due when, students can input their assignments and see them intelligently scheduled across the days available to complete them.

---

## How to Run the Program

### Prerequisites
- Java 17 or later installed on your system

### Compilation
Navigate to the project directory and compile all Java files:
```bash
javac src/*.java
```

### Running the Application
```bash
java -cp src App
```

### Using the Application

When you start the program, you'll be prompted to enter today's date:
```
What is the date today?
Month: [enter month number 1-12]
Day: [enter day number]
```

After entering today's date, you'll see the main menu:
```
What would you like to do:
=========================
1. See Calendar
2. Add Assignment
3. See All Assignments
4. End Day
5. Quit
```

**Menu Options:**
- **Option 1 - See Calendar**: Displays all 12 months with all scheduled assignments
- **Option 2 - Add Assignment**: Create a new assignment by entering:
  - Assignment name
  - Due month (1-12)
  - Due day (1-31 depending on month)
  - Number of days needed to complete it
- **Option 3 - See All Assignments**: View all assignments in the year
- **Option 4 - End Day**: Progress to the next day
- **Option 5 - Quit**: Exit the program

---

## Technical Overview

### Architecture

The application is built using four core classes that work together:

#### 1. **App.java**
The main driver program that:
- Manages the main menu and user interaction loop
- Maintains an ArrayList of all 12 Calendar objects for the year
- Handles assignment creation and scheduling logic
- Uses a 2D array to track assignment capacity for each day
- Reads user input via Scanner

#### 2. **Calendar.java**
Represents a single calendar month with:
- Month name (January–December)
- Month number (1–12)
- ArrayList of Day objects (28–31 depending on the month)
- Proper day counts for each month (31 days for Jan, Mar, May, Jul, Aug, Oct, Dec; 30 days for Apr, Jun, Sep, Nov; 28 days for Feb)
- Methods to access individual days and display the month

#### 3. **Day.java**
Represents a single day with:
- Date identifier (format: "month/day")
- ArrayList of Assignment objects scheduled for that day
- Methods to add assignments and display all assignments for the day
- toString() method to display the day and its assignments

#### 4. **Assignment.java**
Represents an assignment with:
- Assignment name (String)
- Due day (int, 1-based)
- Due month (int, 1-12)
- Assignment length in days (int) – how long it takes to complete
- Complete getter and setter methods for all properties

### Key Data Structures

- **ArrayList<Calendar>**: Stores the 12 monthly calendars
- **ArrayList<Day>**: Each calendar contains a day list for all days in that month
- **ArrayList<Assignment>**: Each day contains an assignment list
- **2D Array (String[12][128])**: Used to track the month, day, and available slots for assignments

### Program Flow

1. User enters today's date
2. Program enters main menu loop
3. Based on menu selection:
   - Display calendars or assignments
   - Add a new assignment (which gets scheduled across multiple days if needed)
   - End the day to progress
4. Program continues until user quits

---

## Technical Requirements Met

✅ **Multiple interacting Java classes** - Four classes work together (App, Calendar, Day, Assignment)
✅ **Encapsulation** - Private fields with appropriate getters and setters
✅ **Arrays and ArrayLists** - Uses both 2D arrays and multiple ArrayLists
✅ **2D Array** - yearArray tracks assignment scheduling across months and days
✅ **Working driver program** - App.java contains main() method
✅ **Professional code organization** - Clear separation of concerns, descriptive method names

---

## Code Quality

- **Naming Conventions**: Follows Java standards (camelCase for variables/methods, PascalCase for classes)
- **Documentation**: JavaDoc comments on all classes and public methods
- **Encapsulation**: All fields are private with appropriate accessors
- **Readability**: Clear variable names and logical code organization

---

## Known Limitations & Future Improvements

### Current Limitations
- February is hardcoded as 28 days (does not account for leap years)
- Assignment scheduling algorithm could be optimized for better distribution
- No persistent storage; data is lost when the program exits
- No input validation for invalid dates or negative values
- Console-based interface only (no GUI)
- Maximum of 4 assignments per day per the implementation

### Potential Enhancements
- **File I/O**: Save and load assignments from a file
- **Leap Year Support**: Properly handle February in leap years
- **GUI Interface**: Create a graphical user interface using Swing or JavaFX
- **Input Validation**: Add error checking for invalid dates and values
- **Assignment Priority**: Allow assignments to be prioritized
- **Completion Tracking**: Mark assignments as complete and remove them from the calendar
- **Reminders**: Add notification system for upcoming due dates
- **Multiple Users**: Support multiple user profiles with separate assignment lists

---

## Testing Notes

The application has been tested with:
- Various assignment creation scenarios
- Navigation through multiple months
- Viewing calendars and assignment lists
- Day progression through the calendar

**How to Test:**
1. Add several assignments with different due dates
2. View the calendar to verify assignments appear correctly
3. Add a multi-day assignment and verify it spans multiple days
4. Progress through days and verify the system handles date changes

---
