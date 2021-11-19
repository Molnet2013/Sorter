package Test;

import Sorter.Sorter;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) throws Exception {
        // if (test1()) {
        // System.out.println("ok");
        // } else {
        // System.err.println("Error test1");
        // }
        // }

        Sorter sorter = new Sorter();
    }

    public static boolean test1(Sorter sorter) {
        int[] intArray = {1, 3, 2};
        int[] input = sorter.sort(intArray);
        int[] expected = { 1, 2, 3 };
            
        for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] != expected[i]) {
        return false;
        } else {
        return true;
        }
        // }
        // }
        // Bara positiva tal
        // Bara negativa tal
        // Blandat

    }
}
