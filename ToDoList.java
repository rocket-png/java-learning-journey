import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    public static void addTask(ArrayList<String> task, Scanner sc) {
        System.out.print("Enter task you want to add: ");
        sc.nextLine(); // clear leftover newline
        String s = sc.nextLine();
        task.add(s);
        System.out.println("Task added successfully.");
    }

    public static void removeTask(ArrayList<String> task, Scanner sc) {
        if (task.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }
        viewTask(task); // show list before removing
        System.out.print("Enter the task number to remove: ");
        int idx = sc.nextInt();
        if (idx >= 1 && idx <= task.size()) {
            task.remove(idx - 1);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void viewTask(ArrayList<String> task) {
        if (task.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Your tasks:");
        for (int i = 0; i < task.size(); i++) {
            System.out.println((i + 1) + ". " + task.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to To-Do List");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> task = new ArrayList<>(); 

        while (true) {
            System.out.println("\nWhat do you want to perform?");
            System.out.println("1. Add a Task");
            System.out.println("2. View all Tasks");
            System.out.println("3. Remove a Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addTask(task, sc);
                    break;
                case 2:
                    viewTask(task);
                    break;
                case 3:
                    removeTask(task, sc);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Enter valid choice.");
            }
        }
    }
}
