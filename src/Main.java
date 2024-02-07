import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();

        while (true) {

            System.out.println("------------------------------------");
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.println("------------------------------------");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    todoList.viewTasks();
                    break;
                case 3:
                    System.out.println("Enter task index to mark as completed:");
                    int indexComplete = scanner.nextInt() - 1;
                    scanner.nextLine();
                    todoList.markTaskAsCompleted(indexComplete);
                    break;
                case 4:
                    System.out.println("Enter task index to delete:");
                    int indexDelete = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    todoList.deleteTask(indexDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
