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
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
