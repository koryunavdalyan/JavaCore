package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        employeeStorage.add(new Employee("goat", "poxosyan", 77, 5.00, "bmw", "admin"));
        boolean run = true;
        while (run) {
            System.out.println("input 0 for exit");
            System.out.println("input 1 for add employee");
            System.out.println("input 2 for print all employee");
            System.out.println("input 3 for search employee by employee id");
            System.out.println("input 4 for search employee by company name");
            System.out.println("input 5 for search employee by salary range");
            System.out.println("input 6 for change employee position by id");
            System.out.println("input 7 for print only active employees");
            System.out.println("input 8 for inactive employee by id");
            System.out.println("input 9 for active employee by id");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addEmployee();
                    break;
                case 2:
                    employeeStorage.printAllEmployee();
                    break;
                case 3:
                    System.out.println("input employee id");
                    int index = Integer.parseInt(scanner.nextLine());
                    employeeStorage.searchEmployeeById(index);
                    break;
                case 4:
                    System.out.println("input company name");
                    String company = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(company);
                    break;
                case 5:
                    System.out.println("input first number");
                    double salary1 = Double.parseDouble(scanner.nextLine());
                    System.out.println("input second number");
                    double salary2 = Double.parseDouble(scanner.nextLine());
                    employeeStorage.searchEmployeeBySalaryRange(salary1,salary2);
                    break;
                case 6:
                    employeeStorage.printAllEmployee();
                    System.out.println("input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("input position ADMIN or USER");
                    String position = scanner.nextLine();
                    employeeStorage.forChangeEmployeePositionById(id,position);
                    break;
                case 7:
                    employeeStorage.printnOnlyActiveEmployees();
                    break;
                case 8:
                    employeeStorage.printAllEmployee();
                    System.out.println("input id");
                    int employeeId = Integer.parseInt(scanner.nextLine());
                    employeeStorage.inactiveEmployeeById(employeeId);
                    break;
                case 9:
                    employeeStorage.printAllEmployee();
                    System.out.println("input id");
                    int employeeIdActive = Integer.parseInt(scanner.nextLine());
                    employeeStorage.activeEmployeeById(employeeIdActive);
                    break;
                default:
                    System.out.println("invalide command");


            }


        }

    }

    private static void addEmployee() {
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input surname");
        String surname = scanner.nextLine();
        System.out.println("input employeeId");
        int empolyeeId = Integer.parseInt(scanner.nextLine());
        System.out.println(" input salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("input company");
        String company = scanner.nextLine();
        System.out.println("input position");
        String position = scanner.nextLine();
        Employee empolyee = new Employee(name, surname, empolyeeId, salary, company, position);
        empolyee.setActive(true);
        employeeStorage.add(empolyee);
        System.out.println("employee created");


    }

}
