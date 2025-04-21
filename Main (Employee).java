import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Employee newEmployee = null;

        //Add employee details option
        while (true) {
            System.out.println("Welcome to the Employee Management System");
            System.out.println("Which Operation would you like to perform");
            System.out.println("Press 1 to Add Employee details");
            System.out.println("Press 2 to View Employee details ");
            System.out.println("Press 3 to Search for an employee");
            System.out.println("Press 4 to update employee info");
            System.out.println("Press 5 to delete an employee record");
            System.out.println("Press 6 to Exit");


            int user = sc.nextInt();

            switch (user) {

                case 1:
                    System.out.println("Enter Employee ID: \n");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Employee name: \n");
                    String name = sc.nextLine();
                    //sc.nextLine();
                    System.out.println("Enter employee's Department: \n");
                    String dept = sc.nextLine();
                    //sc.nextLine();
                    System.out.println("Enter Employee's Salary: \n");
                    int salary = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Employee's Phone Number: \n");
                    String number = sc.nextLine();
                    //sc.nextLine();
                    newEmployee = new Employee(ID, name, dept, salary, number);
                    EmployeeList.add(newEmployee);
                    System.out.println("Employee record added successfully");
                    break;


                case 2:
                    System.out.println("You are welcome to view employee record");
                    if (newEmployee == null) {
                        System.out.println("No record to view");
                    } else {
                        System.out.println("Here is the Employee Record.");

                        for (Employee e : EmployeeList) {
                            System.out.println("Employee ID: " + e.getID());
                            System.out.println("Employee Name: " + e.getName());
                            System.out.println("Employee Department: " + e.getDept());
                            System.out.println("Employee Salary: " + e.getSalary());
                            System.out.println(("Employee Phone Number: " + e.getNumber()));
                            System.out.println("**************************************************");
                        }
                    }
                    break;


                case 3:
                    while (true) {
                        System.out.println("1. Search by ID");
                        System.out.println("2. Search by Name");
                        System.out.println("3. Search by Department");
                        System.out.println("4. Exit");


                        user = sc.nextInt();
                        //Employee e = new Employee();

                        if (user == 4) break;

                        switch (user) {
                            case 1:
                                System.out.println("Enter Employee ID: ");
                                int inputID = sc.nextInt();
                                boolean found = false;
                                for (Employee e : EmployeeList) {
                                    if (e.getID() == inputID) {
                                        System.out.println("Employee ID: " + e.getID());
                                        System.out.println("Employee Name: " + e.getName());
                                        System.out.println("Employee Department: " + e.getDept());
                                        System.out.println("Employee Salary: " + e.getSalary());
                                        System.out.println(("Employee Phone Number: " + e.getNumber()));
                                        System.out.println("**************************************************");
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Employee ID not Valid");
                                }

                                break;

                            case 2:

                                System.out.println("Enter Employee Name: ");
                                sc.nextLine();
                                String inputName = sc.nextLine();
                                found = false;
                                for (Employee e : EmployeeList) {
                                    if (e.getName().equals(inputName)) {
                                        System.out.println("Employee ID: " + e.getID());
                                        System.out.println("Employee Name: " + e.getName());
                                        System.out.println("Employee Department: " + e.getDept());
                                        System.out.println("Employee Salary: " + e.getSalary());
                                        System.out.println(("Employee Phone Number: " + e.getNumber()));
                                        System.out.println("**************************************************");
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Employee Name not Valid");
                                }
                                break;

                            case 3:

                                System.out.println("Enter Department Name QA, SD,BA, R&D, HR ");
                                sc.nextLine();
                                inputName = sc.nextLine();
                                found = false;
                                //Employee e = new Employee();
                                for (Employee e : EmployeeList) {
                                    if (e.getDept().equals(inputName)) {
                                        System.out.println("Employee ID: " + e.getID());
                                        System.out.println("Employee Name: " + e.getName());
                                        System.out.println("Employee Department: " + e.getDept());
                                        System.out.println("Employee Salary: " + e.getSalary());
                                        System.out.println(("Employee Phone Number: " + e.getNumber()));
                                        System.out.println("**************************************************");
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Employee record not found");
                                }
                                break;

                        }
                    }
                    break;


                case 4:
                    //To update employee information
                    System.out.println("Enter the ID of the Employee you wish to update:");
                    int inputID = sc.nextInt();
                    sc.nextLine(); // Clear the newline

                    boolean found = false;

                    for (Employee e : EmployeeList) {
                        if (e.getID() == inputID) {
                            System.out.println("Updating details for Employee ID: " + e.getID());

                            System.out.print("Update Employee Name: ");
                            e.setName(sc.nextLine());

                            System.out.print("Update Employee Department: ");
                            e.setDept(sc.nextLine());

                            System.out.print("Update Employee Salary: ");
                            e.setSalary(sc.nextInt());
                            sc.nextLine(); // Clear newline

                            System.out.print("Update Employee Phone Number: ");
                            e.setNumber(sc.nextLine());

                            System.out.println("Employee updated successfully!");
                            System.out.println("**************************************************");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee ID not found.");
                    }

                    break;

                case 5:
                    System.out.println("Enter the Employee ID you'll like to delete");
                    inputID = sc.nextInt();
                    sc.nextLine();
                    found = false;

                    for (Employee e : EmployeeList) {
                        if (e.getID() == inputID) {
                            EmployeeList.remove(e);

                            System.out.println("Employee Record successfully deleted");
                            found = true;
                            break;
                        }
                    }

                case 6:
                    System.out.println("Thank you for using the Employee Management System!");
                    System.exit(0);
            }

        }

    }
}
