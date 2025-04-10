import java.lang.Thread.State;
import java.util.LinkedList;
import java.util.Queue;

public class Patients {
    private Queue<Patient> patients;

    public Patients() {
        patients = new LinkedList<>();
    }

    public void in(String ticket, String name, String doctor, String speciality) {
        Patient newPatient = new Patient(ticket, name, doctor, speciality);
        patients.add(newPatient);

        String departement = ticket.charAt(0) == 'G' ? "general medicine" : "specialist";
        System.out.printf("You are %s patient", departement);

        int size = patients.size();
        if (size > 1) {
            System.out.printf(". You are waiting for %d more person.\n", size - 1);
        } else {
            System.out.printf(". You are first in line.\n");
        }
    }

    public void call() {

    }
}
