public class Main {
    public static void main(String[] args) {
        WebStack webStack = new WebStack();

        webStack.addUrl("https://teachyourselfcs.com/");
        webStack.addUrl("https://graphics.stanford.edu/~seander/bithacks.html");
        webStack.addUrl("https://csdiy.wiki/en/");
        System.out.println();
        webStack.back();
        webStack.forward();
        System.out.println();
        webStack.history();
    }
}
