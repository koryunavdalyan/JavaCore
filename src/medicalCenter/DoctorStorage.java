package medicalCenter;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size = 0;

    public void add(Doctor doctor) {
        if (doctors.length == size) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(doctors[i] + " ");
        }
    }
}