public class Main {
    public static void main(String[] args) {
        HashSet table = new HashSet(3);

        table.add("date");
        table.add("aiba");
        table.add("mizuki");
        table.add("ryuki");
        table.add("ota");
        table.add("iris");
        table.add("tama");

        System.out.printf("All players\n");
        table.print();
        System.out.println();

        System.out.printf("Main player\n");
        table.printFirst();
        System.out.println();

        System.out.printf("Bench player\n");
        table.printRest();
    }
}
