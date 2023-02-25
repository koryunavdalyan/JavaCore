package medicalCenter;

import java.util.Objects;

public class Doctor {
    public static int length;
    private String name;
        private String surnamne;
        private String email;
        private String id;
        private String phoneNumber;
        private String professin;

        public Doctor(String name, String surnamne, String email, String id) {
            this.name = name;
            this.surnamne = surnamne;
            this.email = email;
            this.id = id;
            this.phoneNumber = phoneNumber;
            this.professin = professin;

        }

        public Doctor() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurnamne() {
            return surnamne;
        }

        public void setSurnamne(String surnamne) {
            this.surnamne = surnamne;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getProfessin() {
            return professin;
        }

        public void setProfessin(String professin) {
            this.professin = professin;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Doctor person = (Doctor) o;
            return Objects.equals(name, person.name) && Objects.equals(surnamne, person.surnamne) && Objects.equals(email, person.email) && Objects.equals(id, person.id) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(professin, person.professin);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surnamne, email, id, phoneNumber, professin);
        }

        @Override
        public String toString() {
            return "Doctor{" +
                    "name='" + name + '\'' +
                    ", surnamne='" + surnamne + '\'' +
                    ", email='" + email + '\'' +
                    ", id='" + id + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", professin='" + professin + '\'' +
                    '}';
        }

    public void setProfession(String newDate) {
    }
}

