package Utilities;

import Actor.Lecturer;

import java.util.Scanner;

public class LecturerMenu {
    public static void lecturerMenu() {
        Scanner scanner = new Scanner(System.in);
        int n;
        Lecturer lecturer=new Lecturer("S22EC1008","Hideo Nakamura");
        ClearScreen.clearScreen();
        System.out.println("******************************");
        System.out.println("            LECTURER");
        System.out.println("******************************\n");
        System.out.println("       ------------");
        System.out.println("           MENU");
        System.out.println("       ------------\n");
        System.out.println("  1. View Subject Details");
        System.out.println("  2. Choose Subject to Teach");
        System.out.println("  3. Drop Subject");
        System.out.println("  4. Subject Student List");
        System.out.println("  5. Back to Main Menu\n");
        System.out.print("   ENTER YOUR OPTION -> ");
        n = scanner.nextInt();
        switch (n) {
            case 1:
                lecturer.viewSubjectDetails();
                break;
            case 2:
                lecturer.chooseSubjectToTeach();
                break;
            case 3:
                lecturer.dropSubject();
                break;
            case 4:
                lecturer.subjectStudentList();
                break;
            case 5:
                MainMenu.menu();
                break;
            default:
                // System.out.println("\n\n\nWRONG OPTION!");
                lecturerMenu();
        }
        scanner.close();
    }
}
