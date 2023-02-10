package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static  EmployeeStorage employeeStorage = new EmployeeStorage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        employeeStorage.add(new Employee("goat","poxosyan", 77, 5.00,"bmw", "admin"));
        boolean run = true;
        while (run) {
            System.out.println("input 0 for exit");
            System.out.println("input 1 for add employee");
            System.out.println("input 2 for print all employee");
            System.out.println("input 3 for search employee by employee id");
            System.out.println("input 4 for search employee by company name");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command){
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
                default:
                    System.out.println("invalide command");

            }


        }

    }
    private static void addEmployee(){
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
        employeeStorage.add(empolyee);
        System.out.println("employee created");



    }

}
