package academy.devonline.java.section001_classes;

import java.util.Arrays;

public class Work1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = extendArray(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] extendArray(int[] array) {
        int [] resultArray = new int [array.length * 2];
        System.arraycopy(array, 0, resultArray, 0, array.length);
        return resultArray;
    }
}
