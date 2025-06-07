public class Main {
    public static void main(String[] args) {
        Members members = new Members();

        members.add(new Member("776-2323", "Bruce", "Bojongsoang", "platinum", 3));
        members.add(new Member("555-0123", "Jim", "Dayeuhkolot", "gold", 1));
        members.add(new Member("555-2222", "Bean", "Baleendah", "gold", 2));
        members.add(new Member("776-4444", "Carrey", "Citereup", "silver", 4));

        members.all();
        members.remove("Bean");
        members.all();

        members.find("Jim");
        members.find("Bean");

        members.filter(3);
    }
}
