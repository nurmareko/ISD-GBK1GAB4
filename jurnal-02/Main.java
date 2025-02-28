import java.util.ArrayList;
import java.util.zip.Inflater;

public class Main {
    public static void main(final String[] args) {
        Electronic ele0 = new Electronic("E001", "electric guitar", "string", "$150", 4);
        Electronic ele1 = new Electronic("E002", "piano", "keyboard", "$70", 1);
        Electronic ele2 = new Electronic("E003", "drum", "percusion", "$440", 0);
        Electronic ele3 = new Electronic("E004", "bass", "string", "$200", 7);
        Electronic ele4 = new Electronic("E005", "accordion", "keyboard", "$200", 12);
        Traditional tra0 = new Traditional("T001", "clarinet", "woodwind", "$110", 2);
        Traditional tra1 = new Traditional("T002", "harp", "string", "$30", 8);
        Traditional tra2 = new Traditional("T003", "bongo", "percusion", "$15", 2);
        Traditional tra3 = new Traditional("T004", "violin", "string", "$410", 4);
        Traditional tra4 = new Traditional("T005", "classic guitar", "string", "$1100", 1);

        // list of electronic musical instrument
        Inventory<Electronic> electronics = new Inventory<Electronic>();
        // list of traditional musical instrument
        Inventory<Traditional> traditionals = new Inventory<Traditional>();

        // Input data demo
        System.out.printf("========== input data demo =========\n");
        electronics.add(ele0);
        electronics.add(ele1);
        electronics.add(ele2);
        electronics.add(ele3);
        electronics.add(ele4);
        electronics.display();
        System.out.println();
        traditionals.add(tra0);
        traditionals.add(tra1);
        traditionals.add(tra2);
        traditionals.add(tra3);
        traditionals.add(tra4);
        traditionals.display();
        System.out.printf("====================================\n");
    }
}
