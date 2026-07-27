import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void welcomeMessage() {
        System.out.println("\n== Welcome to the Student Management System! ==");
        System.out.println("===============================================\n");
    }

    public static void mainMenu() {
        System.out.println("\n=== Main Menu ===");
        System.out.println("=================");
        System.out.println("1. Display Students.");
        System.out.println("2. Calculate Average Grade.");
        System.out.println("3. Find Highest Grade.");
        System.out.println("4. Search Student by ID.");
        System.out.println("5. Count passed students and failed students.");
        System.out.println("6. Sort Students by Grade.");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcomeMessage();

        int studentNum;

        do {
            System.out.print("Please Enter Number Of Students: ");
            studentNum = sc.nextInt();

            if(studentNum <= 0) {
                System.out.println("Invalid Number Of Students!");
            }

        } while (studentNum <= 0);


        Student[] students = new Student[studentNum];

        for(int i = 0; i < students.length; i++) {


            System.out.print("\n-> Please Enter Student " + (i + 1) + "'s Info");
            System.out.print("\n==================================\n");

            sc.nextLine();

            System.out.print("\n- Student Name: ");
            String studentName = sc.nextLine();

            double grade;

            do {
                System.out.print("\n- Student Grade: ");
                grade = sc.nextDouble();

                if(grade < 0 || grade > 100) {
                    System.out.println("\nInvalid Grade Range!");
                }

            } while(grade < 0 || grade > 100);

            System.out.print("\n====================================\n");

            students[i] = new Student(i + 1, studentName, grade);

        }

        while (true) {
            mainMenu();

            int option;

            System.out.print("\nPlease Enter Your Choice: ");

            if(sc.hasNextInt()) {
                option = sc.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("\nStudent's Info: ");
                        System.out.println("=================\n");

                        for (int i = 0; i < students.length; i++) {
                            students[i].display();
                        }

                        break;

                    case 2:

                        double averageGrade = 0;

                        for(int i = 0; i < students.length; i++) {
                            averageGrade += students[i].getGrade();
                        }

                        averageGrade /= students.length;

                        System.out.println("\nAverage Grade: " + averageGrade);
                        break;

                    case 3:

                        Student highestGrade = students[0];

                        for(int i = 1; i < students.length; i++) {

                            if(students[i].getGrade() > highestGrade.getGrade()) {
                                highestGrade = students[i];
                            }
                        }

                        highestGrade.display();
                        break;

                    case 4:

                        boolean found = false;

                        System.out.print("\nEnter Student ID you want to search: ");
                        int studentID = sc.nextInt();

                        if (studentID < 1 || studentID > students.length) {
                            System.out.println("\nInvalid Student ID!");
                        }

                        else {
                            for (int i = 0; i < students.length; i++) {
                                if (students[i].getStudentID() == studentID) {
                                    System.out.println();

                                    students[i].display();

                                    found = true;

                                    break;
                                }
                            }

                            if(!found) {
                                System.out.println("\nStudent Not Found!");
                            }
                        }

                        break;

                    case 5:

                        int countPass = 0, countFail = 0;

                        for (int i = 0; i < students.length; i++) {
                            if(students[i].getGrade() < 60) {
                                countFail++;
                            }

                            else {
                                countPass++;
                            }
                        }

                        System.out.println("\n- Total Pass: " + countPass);
                        System.out.println("- Total Fail: " + countFail);

                        break;

                    case 6:
                        System.out.println();
                        Arrays.sort(students, (s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()));

                        for (int i = 0; i < students.length; i++) {
                            students[i].display();
                        }

                        break;

                    case 0:

                        System.out.println("\nGoodbye:)");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\nInvalid Option!");
                }

            }

            else {
                System.out.println("\nInvalid Choice! Choice must be between 0 and 6.");
            }

            sc.nextLine();

        }
        
    }
}