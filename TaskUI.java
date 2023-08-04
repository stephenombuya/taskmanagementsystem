package taskmanagementsystem;

import java.util.*;

public class TaskUI {

    private TaskManager taskManager;
    private Scanner scanner;

    public TaskUI() {
        taskManager = new TaskManager();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Task Management System");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Update a task");
        System.out.println("4. View task details");
        System.out.println("5. View all tasks");
        System.out.println("0. Exit");
    }

    public void handleUserInput() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    viewTaskDetails();
                    break;
                case 5:
                    viewAllTasks();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    private void addTask() {
        System.out.println("Add a Task");
        System.out.print("Enter task ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task due date: ");
        String dueDate = scanner.nextLine();

        System.out.print("Enter task priority: ");
        String priority = scanner.nextLine();

        System.out.print("Enter task status: ");
        String status = scanner.nextLine();

        Task task = new Task(id, title, description, dueDate, priority, status);

        if (TaskValidator.validateTaskDetails(task)) {
            taskManager.addTask(task);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Invalid task details. Task not added.");
        }
    }

    private void removeTask() {
        System.out.println("Remove a Task");
        System.out.print("Enter task ID: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (taskManager.removeTask(taskId)) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found. Unable to remove.");
        }
    }

    private void updateTask() {
        System.out.println("Update a Task");
        System.out.print("Enter task ID: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Task task = taskManager.getTaskById(taskId);

        if (task != null) {
            System.out.print("Enter updated task title: ");
            String title = scanner.nextLine();

            System.out.print("Enter updated task description: ");
            String description = scanner.nextLine();

            System.out.print("Enter updated task due date: ");
            String dueDate = scanner.nextLine();

            System.out.print("Enter updated task priority: ");
            String priority = scanner.nextLine();

            System.out.print("Enter updated task status: ");
            String status = scanner.nextLine();

            taskManager.updateTask(taskId, title, description, dueDate, priority, status);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Task not found. Unable to update.");
        }
    }

    private void viewTaskDetails() {
        System.out.println("View Task Details");
        System.out.print("Enter task ID: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Task task = taskManager.getTaskById(taskId);

        if (task != null) {
            System.out.println("Task Details:");
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }
    }

    private void viewAllTasks() {
        System.out.println("View All Tasks");
        List<Task> tasks = taskManager.getAllTasks();

        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Task List:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
