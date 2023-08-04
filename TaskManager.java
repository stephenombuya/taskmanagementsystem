package taskmanagementsystem;

import java.util.*;

public class TaskManager {

    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean removeTask(int taskId) {
        return tasks.removeIf(t -> t.getId() == taskId);
    }

    public void updateTask(int taskId, String title, String description, String dueDate, String priority, String status) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setTitle(title);
                task.setDescription(description);
                task.setDueDate(dueDate);
                task.setPriority(priority);
                task.setStatus(status);
                break;
            }
        }
    }

    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
