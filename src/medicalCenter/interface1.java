package medicalCenter;

public interface interface1 {
    package medicalCenter;

    public class Interface {
        public interface Commands {

            String EXIT = "0";
            String ADD_DOCTOR = "1";
            String SEARCH_DOCTOR_BY_PROFESSION = "2";
            String PRINT_DELETEDOCTORBYID = "3";
            String CHANGE_DOCTOR_DATA_BY_ID = "4";
            String ADD_PATIENTS = "5";
            String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
            String PRINT_TODAYS_PATIENTS = "7";



            static void printCommands() {
                System.out.println("Please input "+EXIT+" for exit");
                System.out.println("Please input "+ADD_DOCTOR+" for add employee");
                System.out.println("Please input "+SEARCH_DOCTOR_BY_PROFESSION+" for add company");
                System.out.println("Please input "+PRINT_DELETEDOCTORBYID+" for print all employee");
                System.out.println("Please input "+CHANGE_DOCTOR_DATA_BY_ID+" for search employee by ID");
                System.out.println("Please input "+ADD_PATIENTS+" for search employee company by name");
                System.out.println("Please input "+PRINT_ALL_PATIENTS_BY_DOCTOR +" for search employee by salary range");
                System.out.println("Please input "+PRINT_TODAYS_PATIENTS+" for change employee position by id");

            }
        }
    }
}
