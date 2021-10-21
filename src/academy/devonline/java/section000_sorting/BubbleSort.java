/*
 *  Copyright 2021 http://devonline.academy
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package academy.devonline.java.section000_sorting;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1 - i; j++) {
                int additionalVariable;
                if (array[j] > array[j+1]){
                    additionalVariable = array[j+1];
                    array[j+1] = array[j];
                    array[j] = additionalVariable;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return array;
    }
}
