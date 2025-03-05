import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Singly<Recipe> recipes = new Singly<>("Recipes");
        recipes.insertHead(new Recipe("Burrito", "rice", "30 minutes"));
        recipes.insertHead(new Recipe("Taco", "tortilla", "15 minutes"));
        recipes.insertHead(new Recipe("quesadilla", "tortilla", "60 minutes"));

        menu();
        String userInput;
        do {
            System.out.printf(">> ");
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                case "2":
                    String[] parts;
                    boolean invalidUsage;
                    do {
                        System.out.printf("Usage: [name] [main component] [cooking time in minutes]\n>> ");
                        String inputStream = input.nextLine();
                        parts = inputStream.split(" ");

                        if (parts.length != 3) {
                            invalidUsage = true;
                        } else
                            invalidUsage = false;
                    } while (invalidUsage);

                    Recipe newRecipe = new Recipe(parts[0], parts[1], parts[2] + " minutes");
                    String message = "";
                    if (userInput.equals("1")) {
                        recipes.insertHead(newRecipe);
                        message = "front";
                    } else {
                        recipes.insertTail(newRecipe);
                        message = "back";
                    }
                    System.out.printf("%s added at %s.\n", parts[0], message);
                    break;
                case "3":
                    recipes.removeHead();
                    System.out.printf("Head recipe removed.\n");
                    break;
                case "4":
                    recipes.removeTail();
                    System.out.printf("Tail recipe removed.\n");
                    break;
                case "5":
                    recipes.printAll();
                    break;
                case "6":
                    System.out.printf("name: ");
                    String name = input.nextLine();
                    recipes.find(name);
                    break;
                case "e":
                case "E":
                    System.out.println("farewell :)\n");
                    break;
                default:
                    System.out.printf("invalid option: %s\n", userInput);
            }
        } while (!isExit(userInput));
    }

    public static void menu() {
        System.out.println("Recipe menu");
        System.out.println("  [1] Add (head)");
        System.out.println("  [2] Add (tail)");
        System.out.println("  [3] Remove (head)");
        System.out.println("  [4] Remove (tail)");
        System.out.println("  [5] Show all recipe");
        System.out.println("  [6] Find recipe");
        System.out.println("  [E] Exit");
    }

    public static boolean isExit(String userInput) {
        return userInput.equals("E") || userInput.equals("e");
    }
}
