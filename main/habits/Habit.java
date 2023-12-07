package main.habits;

public class Habit {
    private String name;
    private Boolean completed;
    
    public Habit(String name, Boolean completed) {
        setName(name);
        this.completed = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String printHabit() {
        return "| " + name + ": " + getCompletedString() + " ";
    }

    public String getCompletedString() {
        if (completed) {
            return "Done!";
        }
        return "Not Done";
    }

}
