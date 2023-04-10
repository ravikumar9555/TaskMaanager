package com.taskmanger;

import java.util.List;
import java.util.Scanner;

import com.taskmanger.controller.Controller;
import com.taskmanger.entity.TaskEntity;

public class TaskManager {

	public static void main(String[] args) {
		Controller controller =  new Controller();
		Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("------------Task Manager----------- :");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Get Task");
            System.out.println("4. Get All Tasks");
            System.out.println("5. Update Task");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.println("Enter task details : ");
                    System.out.println("Enter task Id : ");
                    
                    
                    long taskID=scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter taskName : ");
                    String titleName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                   
                  
                    TaskEntity task = new TaskEntity(taskID,titleName,description);
                    controller.addTask(task);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.print("Enter task index to remove : ");
                    int index = scanner.nextInt();
                   controller.removeTask(index);
                    System.out.println("Task removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter task index: ");
                    index = scanner.nextInt();
                    TaskEntity getTask =controller.getTask(index);
                    System.out.println(getTask);
                    break;
                case 4:
                    List<TaskEntity> allTasks = controller.getAllTask();
//                    for (int i = 0; i < allTasks.size(); i++) {
//                        System.out.println(i + ": " + allTasks.get(i));
//                    }
                    System.out.println("All Task :" + allTasks);
                    break;
                case 5:
                    System.out.print("Enter task index to update: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter taskName : ");
                    String titleName1 = scanner.nextLine();
                    System.out.print("Enter updated task description: ");
                    description = scanner.nextLine();
                   controller.updateTask(index, titleName1, description);
                    System.out.println("Task updated successfully.");
                    break;
                case 6:
                    System.out.println("...Exiting Task Manager...");
                    break;
                default:
                    System.out.println("Invalid choice. Try Again!!!");
            }
        } while (choice != 6);
        
        scanner.close();
    

	}

}
