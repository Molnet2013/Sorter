package Sorter;

public class SortMain {
    public static void main(String[] args) { // throws Exception framför {, om något inte skulle fungera

        int[] intArgs = new int[args.length];
        Sorter sorter = new Sorter();

        // for (int i : intArgs), skriver bara ut 0 0 0 0 0 0 0 76, skriver över med
        // sista värdet?
        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }

        int[] sortedList = sorter.sort(intArgs);

        System.out.println("Sorterad lista: "); // bara printning
        for (int number : sortedList) {
            System.out.println("nummer: " + number);
        }

        // for (int i : intArgs)
        // System.out.println(i);
        // }

        // Sorter sorter = new Sorter();
        // sorter.sort(args);

    }
}
