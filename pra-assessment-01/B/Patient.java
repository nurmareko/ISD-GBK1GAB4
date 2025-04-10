public class Patient {
    String ticket;
    String name;
    String doctor;
    String speciality;

    public Patient(String ticket, String name, String doctor, String speciality) {
        this.ticket = ticket;
        this.name = name;
        this.doctor = doctor;
        this.speciality = speciality;
    }

    public String getTicket() {
        return ticket;
    }

    public String getName() {
        return name;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getSpeciality() {
        return speciality;
    }
}
