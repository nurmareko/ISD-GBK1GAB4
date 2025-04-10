public class Main {
    public static void main(String[] args) {
        Patients general = new Patients();
        Patients specialist = new Patients();

        general.in("G001", "Ernst Zimmerman", "Dr. Lev Aldrecht", "General");
        general.in("G002", "Anju Emma", "Dr. Henrietta Penrose", "General");
        general.in("G003", "Eugene Rantz", "Dr. Grethe Wenzel", "General");
        specialist.in("S001", "Daiya Irma", "Dr. Vladilena Milizé", "Dermatologist");

        general.call();
        specialist.call();
        specialist.in("S002", "Theoto Rikka", "Dr. Jerome Karlstahl", "ENT");
    }
}
