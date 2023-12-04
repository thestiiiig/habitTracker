package main;

import java.util.ArrayList;
import java.util.Date;

import main.habits.Habit;

public class Day {
    private ArrayList<Habit> habits;
    private Date date;

    public Day(ArrayList<Habit> habits, Date date) {
        this.habits = habits;
        this.date = date;
    }

    public ArrayList<Habit> getHabits() {
        return habits;
    }

    public void setHabits(ArrayList<Habit> habits) {
        this.habits = habits;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
