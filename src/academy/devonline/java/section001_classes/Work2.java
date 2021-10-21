package academy.devonline.java.section001_classes;

import java.util.Arrays;

public class Work2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = trimArray(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] trimArray(int[] array) {
        int resultArraySize = array.length / 2;
        int [] resultArray = new int [resultArraySize ];
        System.arraycopy(array, 0, resultArray, 0, resultArraySize);
        return resultArray;
    }
}
