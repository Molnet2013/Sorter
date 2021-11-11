package Sorter;

public class SortMain {
    public static void main(String[] args) throws Exception {

        int[] intArgs = new int[args.length];
        Sorter sorter = new Sorter();

        // for (int i : intArgs), skriver bara ut 0 0 0 0 0 0 0 76, skriver över med
        // sista värdet?
        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }

        sorter.sort(intArgs);

        // for (int i : intArgs) {
        // System.out.println(i);
        // }

        // Sorter sorter = new Sorter();
        // sorter.sort(args);

    }
}
