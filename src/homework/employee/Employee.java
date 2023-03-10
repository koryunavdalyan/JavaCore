package homework.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private int employeeId;
    private double salary;
    private String company;
    private String position;
    private boolean active;
    private String date;


    public Employee(String name, String surname, int employeeId, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;

    }
    public  boolean getActive(){
        return active;
    }
    public void setActive(boolean active){
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeId, salary, company, position, active);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                '}';
    }
}

