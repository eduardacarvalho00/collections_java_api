package main.java.org.miawe.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    private List<Task> taskList;

    public ListTask() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> taskToRemove = new ArrayList<>();
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                taskToRemove.add(t);
            }
        }
        taskList.removeAll(taskToRemove);
    }

    public int getTotalNumberTasks(){
        return taskList.size();
    }

    public void getDescriptionTask(){
        System.out.println(taskList);
    }
}
