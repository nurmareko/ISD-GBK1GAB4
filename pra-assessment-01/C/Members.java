import java.util.LinkedList;

public class Members {
    private LinkedList<Member> members;

    public Members() {
        members = new LinkedList<>();
    }

    public void add(Member newMemeber) {
        members.addLast(newMemeber);
    }

    public void remove(String name) {

    }

    public void find(String name) {

    }

    public void filter(int year) {

    }

    public void all() {
        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println();
    }
}
