package academy.devonline.java.section001_classes;

import academy.devonline.java.structures.DynaArray;

public class Solution {
    public static void main(String[] args) {
        int[] array = {-1, -2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3};

        DynaArray result = getPositiveNumbers(array);


        result.toString();
        System.out.println();
    }
   static DynaArray getPositiveNumbers(int[] array) {
        DynaArray dynaArray = new DynaArray();
        for (int value : array) {
            if (value > 0) {
                dynaArray.add(value);
            }
        }
        return dynaArray;
    }
}
