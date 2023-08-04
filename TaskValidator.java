package taskmanagementsystem;

public class TaskValidator {

    public static boolean validateTaskDetails(Task task) {
        // Check if the task title is not empty
        if (task.getTitle().isEmpty()) {
            return false;
        }

        // Check if the task description is not empty
        if (task.getDescription().isEmpty()) {
            return false;
        }

        // Check if the task due date is not empty
        if (task.getDueDate().isEmpty()) {
            return false;
        }

        // Check if the task priority is not empty
        if (task.getPriority().isEmpty()) {
            return false;
        }

        // Check if the task status is not empty
        if (task.getStatus().isEmpty()) {
            return false;
        }

        // All required fields are present and have valid values
        return true;
    }
}
