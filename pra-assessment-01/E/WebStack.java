import java.util.ArrayList;
import java.util.Stack;

public class WebStack {
    Stack<String> backStack;
    Stack<String> forwardStack;
    ArrayList<String> history;
    String current;

    public WebStack() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        history = new ArrayList<>();
        current = null;
    }

    public void addUrl(String url) {
        if (current != null) {
            backStack.push(current);
        }
        current = url;
        forwardStack.clear();
        history.add(url);
        System.out.println("Current: " + url);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Back stack is empty.");
            return;
        }

        forwardStack.push(current);
        current = backStack.pop();
        System.out.println("Back to: " + current);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Forward stack is empty.");
            return;
        }

        backStack.push(current);
        current = forwardStack.pop();
        System.out.println("Forward to: " + current);
    }

    public void history() {
        System.out.println("History:");
        for (String url : history) {
            System.out.println(url);
        }
    }
}
