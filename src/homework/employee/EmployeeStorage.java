package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            Employee[] temp = new Employee[array.length+10];
            for (int i = 0; i <size ; i++) {
                temp[i]=array[i];
            }
            array = temp;
        }
        array[size++] = value;
    }
    public void printAllEmployee(){
        for (int i = 0; i < size ; i++) {
            System.out.print(array[i]+ " ");
        }
    }

    public void searchEmployeeById(int index) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeId()==index){
                System.out.println(array[i]);
            }

        }
    }

    public void searchEmployeeByCompanyName(String company) {
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equals(company)){
                System.out.println(array[i]);
            }

        }
    }

    public void searchEmployeeBySalaryRange(double salary1, double salary2) {
        for (int i = 0; i < size; i++) {
            if (array[i].getSalary()>salary1 && array[i].getSalary()<salary2){
                System.out.println(array[i]);
            }

        }
    }

    public void forChangeEmployeePositionById(int id, String position) {
        for (int i = id; i < size; i++) {
            if (id == i){
                array[i].setPosition(position);
            }


        }

    }

    public void printnOnlyActiveEmployees() {
        for (int i = 0; i < size; i++) {
            if (array[i].getActive()){
                System.out.println(array[i]);
            }

        }
    }

    public void inactiveEmployeeById(int employeeId) {
        for (int i = employeeId; i < size; i++) {
            if (employeeId == i){
                array[i].setActive(false);
            }
        }
    }

    public void activeEmployeeById(int employeeId) {
        for (int i = employeeId; i < size; i++) {
            if (employeeId == i){
                array[i].setActive(true);

            }
        }
    }
}

