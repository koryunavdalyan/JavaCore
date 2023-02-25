package medicalCenter;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void add(Patient patient) {
        if (patients.length == size) {
            extend();
        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i] + " ");

        }
    }

    public void printAllPatientsByDoctor(boolean empty) {
    }

    public Patient getPatient(String patient) {
    }
}


