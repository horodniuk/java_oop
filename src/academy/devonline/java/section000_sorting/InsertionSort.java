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
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {1, 12, 11, 13, 5, 6 };
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int workIndexValue = array[i]; // храним выбранное значение
            int prevIndex = i - 1;
            while (prevIndex >= 0 && array[prevIndex] > workIndexValue ){
                array[prevIndex + 1] = array[prevIndex];
                prevIndex = prevIndex - 1;
            }
            array[prevIndex + 1] = workIndexValue;
        }

        return array;
    }

}
