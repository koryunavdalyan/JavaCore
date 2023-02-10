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
}

