package Test;

import Sorter.Sorter;

public class SortTest {
    public static void main(String[] args) throws Exception {

        Sorter sorter = new Sorter();
        boolean resultat = test1(sorter);
        System.out.println(resultat);
    }

    public static boolean test1(Sorter sorter) {
        int[] intArray = { 1, -3, 2 };
        int[] acctual = sorter.sort(intArray);
        int[] expected = { -3, 1, 2 };

        for (int i = 0; i < acctual.length; i++) {
            if (acctual[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }
}