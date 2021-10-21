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

package academy.devonline.java.section000_searching;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class BinarySearchIterative {
    public static void main(String[] args) {
        int array[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int searchElement = 50;
        System.out.println(binarySearchIterative(array, searchElement));
    }

    private static int binarySearchIterative(int[] array, int searchElement) {
        int midleIndex = array.length/2;
        int middleValue = array[midleIndex];

        if (searchElement > middleValue){

        }else if ( searchElement < middleValue){

        } else return midleIndex;
        return -1;
    }


}
