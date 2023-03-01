package Model1;

import java.util.Date;

public class DoctorStorage {
    private Doctor[]doctor = new Doctor[10];
    private int size;
    public void add(Doctor value) {
        if (size == doctor.length){
            Doctor[] tmp = new Doctor[doctor.length+10];
            for (int i = 0; i < size; i++) {
                tmp[i] = doctor[i];
            }
            doctor = tmp;
        }
        doctor[size++] = value;
    }
    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = doctor[i];
            if (person instanceof Doctor) {
                System.out.println(doctor);
            }
        }
    }

    public void professionByDoctor(String profession) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (doctor[i].getProfession().equals(profession)){
                System.out.println(doctor[i]);
                count++;
            }
        }
        if (count == 0 ){
            System.out.println("invalid havai ban");
        }
    }
    public boolean isDoctorAvailable(Doctor doctor, Date registerDateTime) {
        for (int i = 0; i < size; i++) {
            Person person = person[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if(patient.getDoctor().equals(doctor) &&
                        patient.getRegisterDateTime().equals(registerDateTime)){
                    return false;
                }
            }
        }
        return true;
    }
}
