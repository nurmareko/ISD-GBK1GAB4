import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> verbs = new ArrayList<>();

        menu();
        String userInput;
        do {
            System.out.printf(">> ");
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    System.out.printf("new verb: ");
                    String newVerb = input.nextLine();
                    verbs.add(newVerb);
                    System.out.println("Successfully added!");
                    break;
                case "2":
                    System.out.printf("find: ");
                    String verb = input.nextLine();
                    System.out.println(verb + (verbs.contains(verb) ? " is" : " is not") + " an irregular verb.");
                    break;
                case "3":
                    System.out.println(verbs);
                    break;
                case "4":
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while (!isExit(userInput));
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("  [1] Input Irregular Verb");
        System.out.println("  [2] Find");
        System.out.println("  [3] See All");
        System.out.println("  [4] Exit");
        System.out.println();
    }

    public static boolean isExit(String input) {
        return input.equals("4");
    }
}
