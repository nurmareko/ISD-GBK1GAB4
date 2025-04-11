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
        for (Member member : members) {
            if (member.getName().equals(name)) {
                members.remove(member);
                break;
            }
        }
    }

    public void find(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                System.out.println(member);
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void filter(int year) {
        for (Member member : members) {
            if (member.getYear() >= year) {
                System.out.println(member);
            }
        }
    }

    public void all() {
        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println();
    }
}
