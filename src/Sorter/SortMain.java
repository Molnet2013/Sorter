package Sorter;

public class SortMain {
    public static void main(String[] args) {

        int[] intArgs = new int[args.length];
        Sorter sorter = new Sorter();

        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }

        int[] sortedList = sorter.sort(intArgs);

        System.out.println("Sorterad lista: ");
        for (int number : sortedList) {
            System.out.println("nummer: " + number);
        }
    }
}
