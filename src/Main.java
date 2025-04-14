//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student newStudent = null;

        //Student newStudent = new Student(Id, Name, D_O_B,  studentClass,  No_Of_Subjects,  Fee_Status);

        while(true){
        System.out.println("Welcome to the Student Record System");
        System.out.println("Which Opration would you like to perform");
        System.out.println("The follwoing are the set of operations available");
        System.out.println("Enter 1 to Add New Student.");
        System.out.println("Enter 2 to View Student Record.");
        System.out.println("Enter 3 to Update Student Record.");
        System.out.println("Enter any other number to exit the application.");

        int user_input = sc.nextInt();

        switch (user_input){
            case 1:
                System.out.println("Enter Student's ID");
                int Id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student's Full Name");
                String Name = sc.nextLine();
                System.out.println("Enter Student's Date of Birth");
                String D_O_B = sc.nextLine();
                System.out.println("Enter Student's Gender M/F:");
                char Gender = sc.next().charAt(0);
                sc.nextLine();
                System.out.println("Enter Student's Class");
                String studentClass = sc.nextLine();
                System.out.println("Enter Student's No of Subjects");
                int No_Of_Subjects = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student's Fee Status - Paid or Not Paid");
                String Fee_Status = sc.nextLine();
                newStudent = new Student(Id, Name, D_O_B,  studentClass,  No_Of_Subjects,  Fee_Status);
                System.out.print("Record Added successfully!\n");
                studentList.add(newStudent);
                newStudent.setGender(Gender);
                break;


            case 2:
                if(newStudent == null){
                    System.out.println("There's nothing to view. Student record is empty");
                }
                else {
                    System.out.println("Here are all student records:");
                    for (Student s : studentList) {
                        System.out.println("Student's ID: " + s.getId());
                        System.out.println("Student's Name: " + s.getName());
                        System.out.println("Student's DOB: " + s.getDOB());
                        System.out.println("Student's Gender: " + s.getGender());
                        System.out.println("Student's Class: " + s.getstudentClass());
                        System.out.println("Student's Subjects: " + s.getNoOfSubjects());
                        System.out.println("Student's Fee Status: " + s.getFeeStatus());
                        System.out.println("-------------------------------");
                    }
                }
                break;
            case 3:
                if(newStudent==null) {
                    System.out.print(" No Student record to update");
                }
                else {
                    System.out.println("Update name: Enter New Full Name!");
                    newStudent.setName(sc.nextLine());
                    System.out.println("Update Student's current Date of Birth");
                    newStudent.setDOB(sc.nextLine());
                    System.out.println("Update Student's Class");
                    newStudent.setstudentClass(sc.nextLine());
                    System.out.println("Update Student's current No of Subjects");
                    newStudent.setNoOfSubjects(sc.nextInt());
                    System.out.println("Update Student's Fee Status - Paid or Not Paid");
                    newStudent.setFeeStatus(sc.nextLine());
                }
                break;
            case 4:
                System.out.println("Exiting Application");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid input. Try again!");

            }

        }

    }
}