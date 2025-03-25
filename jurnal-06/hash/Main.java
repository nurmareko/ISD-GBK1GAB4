public class Main {
    public static void main(String[] args) {
        HashSet table = new HashSet(5);

        table.add("Kiryu");
        table.add("Majima");
        table.add("Ichiban");
        table.add("Haruka");
        table.add("Saejima");
        table.add("Daigo");
        table.add("Akiyama");
        table.add("Nishikiyama");
        table.add("Kaoru");
        table.add("Kashiwagi");
        table.add("Haruto");
        table.add("Saeko");
        table.add("Eri");
        table.add("Aoki");

        System.out.printf("All players\n");
        table.print();
        System.out.println();

        System.out.printf("Main players\n");
        table.printFirst();
        System.out.println();

        System.out.printf("Bench players\n");
        table.printRest();
    }
}
