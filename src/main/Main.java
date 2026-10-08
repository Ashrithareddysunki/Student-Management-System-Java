package main;

import java.util.Scanner;

import service.StudentManager;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" Student Management System");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Statistics");
            System.out.println("7. Sort Students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    manager.addStudent(
                            id,
                            name,
                            age,
                            course,
                            email,
                            phone,
                            marks);

                    break;
                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.println("\n===== Search Menu =====");
                    System.out.println("1. Search by ID");
                    System.out.println("2. Search by Name");
                    System.out.println("3. Back");
                    System.out.print("Enter your choice: ");

                    int searchChoice = sc.nextInt();
                    sc.nextLine(); // consume newline

                    switch (searchChoice) {

                        case 1:
                            System.out.print("Enter Student ID: ");
                            int searchId = sc.nextInt();
                            manager.searchStudent(searchId);
                            break;

                        case 2:
                            System.out.print("Enter Student Name: ");
                            String searchName = sc.nextLine();
                            manager.searchStudentByName(searchName);
                            break;

                        case 3:
                            System.out.println("Returning to Main Menu...");
                            break;

                        default:
                            System.out.println("Invalid Choice!");
                    }

                    break;

                case 4:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();

                    manager.updateStudent(updateId, sc);

                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    manager.deleteStudent(deleteId, sc);
                    break;

                case 6:
                    manager.showDashboard();
                    break;

                case 7:

                    System.out.println("\n===== Sort Menu =====");
                    System.out.println("1. Sort by ID");
                    System.out.println("2. Sort by Name");
                    System.out.println("3. Sort by Marks");
                    System.out.println("4. Back");
                    System.out.print("Enter choice: ");

                    int sortChoice = sc.nextInt();

                    switch (sortChoice) {

                        case 1:
                            manager.sortById();
                            break;

                        case 2:
                            manager.sortByName();
                            break;

                        case 3:
                            manager.sortByMarks();
                            break;

                        case 4:
                            break;

                        default:
                            System.out.println("Invalid Choice!");
                    }

                    break;

                case 8:
                    System.out.println("Thank you for using Student Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 8);

        sc.close();
    }

}