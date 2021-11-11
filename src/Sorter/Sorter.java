package Sorter;

import java.util.Arrays;

public class Sorter {

    public static int[] sort(int[] unsorted) {

        Arrays.sort(unsorted); // sorterar listan

        // int[] sortedList = unsorted; //står return unsorted i uppgiften, fast listan
        // nu är sorterad
        return unsorted;
    }
}
