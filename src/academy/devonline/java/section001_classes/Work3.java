package academy.devonline.java.section001_classes;

import java.util.Arrays;

public class Work3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 5};
        int[] result = removeElementAndReturnNewArray(array, 2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeElementAndReturnNewArray(int[] array, int element) {
        int [] newArray = new int [array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element){
               newArray[count++] = array[i];
            }
        }
        return Arrays.copyOf(newArray, count);
    }
}
