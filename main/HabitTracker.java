package main;

import java.util.ArrayList;

import main.habits.Habit;

public class HabitTracker {
    private ArrayList<Day> days;
    private ArrayList<Habit> currentListOfHabits;
    private int numOfDays;

    public HabitTracker(ArrayList<Day> days, ArrayList<Habit> currentListOfHabits) {
        setDays(days);
        setCurrentListOfHabits(currentListOfHabits);
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public ArrayList<Habit> getCurrentListOfHabits() {
        return currentListOfHabits;
    }

    public void setCurrentListOfHabits(ArrayList<Habit> currentListOfHabits) {
        this.currentListOfHabits = currentListOfHabits;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public String printHabitTracker() {
        ArrayList<String> returnString = new ArrayList<>();
        returnString.add("Habit Tracker: \n");
        for (Day day: days) {
            returnString.add(day.printDay());
        }
        return String.join(",", returnString);
    }
    
}
