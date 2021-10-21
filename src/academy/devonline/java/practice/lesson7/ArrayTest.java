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

package academy.devonline.java.practice.lesson7;


import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class ArrayTest {
    public static void main(String[] args) {
        //Add And Get Last
        ArrayStackAddandGetLast arrayAddandGetLast = new ArrayStackAddandGetLast(10);
        arrayAddandGetLast.push(1);
        arrayAddandGetLast.push(2);
        arrayAddandGetLast.push(3);
        arrayAddandGetLast.pop();

        System.out.println(arrayAddandGetLast.getClass().getSimpleName());
        System.out.println("Stack size - " + arrayAddandGetLast.size());
        System.out.println("print AddandGetLast Array - " + Arrays.toString(arrayAddandGetLast.getMass()));
        System.out.println("print AddandGetLast Stack - " + Arrays.toString(arrayAddandGetLast.printStackAddandGetLast(arrayAddandGetLast.getMass())));
        System.out.println("----------");

        //Add And Get First
        ArrayStackAddandGetFirst arrayAddandGetFirst = new ArrayStackAddandGetFirst(10);
        arrayAddandGetFirst.push(1);
        arrayAddandGetFirst.push(2);
        arrayAddandGetLast.push(3);

        arrayAddandGetFirst.pop();

        System.out.println(arrayAddandGetFirst.getClass().getSimpleName());
        System.out.println("Stack size - " + arrayAddandGetFirst.size());
        System.out.println("print AddandGetFirst Array - " + Arrays.toString(arrayAddandGetFirst.getMass()));
        System.out.println("print AddandGetFirst Stack - " + Arrays.toString(arrayAddandGetFirst.printStackAddandGetFirst(arrayAddandGetFirst.getMass())));
        System.out.println("----------");

        //Add First Get Last

        ArrayStackAddFirstGetLast arrayStackAddFirstGetLast = new ArrayStackAddFirstGetLast(10);
        arrayStackAddFirstGetLast.push(1);
        arrayStackAddFirstGetLast.push(2);
        arrayStackAddFirstGetLast.push(3);
        arrayStackAddFirstGetLast.pop();
        arrayStackAddFirstGetLast.pop();
        arrayStackAddFirstGetLast.push(7);
        arrayStackAddFirstGetLast.pop();

        System.out.println(arrayStackAddFirstGetLast.getClass().getSimpleName());
        System.out.println("Stack size - " + arrayStackAddFirstGetLast.size());
        System.out.println("print addFirstGetLast Array - " + Arrays.toString(arrayStackAddFirstGetLast.getMass()));
        System.out.println("print addFirstGetLast Stack - " + Arrays.toString(arrayStackAddFirstGetLast.printStackAddFirstGetLast(arrayStackAddFirstGetLast.getMass())));
        System.out.println("----------");

        ArrayStackAddLastGetFirst arrayStackAddLastGetFirst = new ArrayStackAddLastGetFirst(10);
        arrayStackAddLastGetFirst.push(1);
        arrayStackAddLastGetFirst.push(2);
        arrayStackAddLastGetFirst.push(3);
        arrayStackAddLastGetFirst.pop();
        arrayStackAddLastGetFirst.push(4);
        arrayStackAddLastGetFirst.push(5);
        arrayStackAddLastGetFirst.pop();

        System.out.println(arrayStackAddLastGetFirst.getClass().getSimpleName());
        System.out.println("Stack size - " + arrayStackAddLastGetFirst.size());
        System.out.println("print AddLastGetFirst Array - " + Arrays.toString(arrayStackAddLastGetFirst.getMass()));
        System.out.println("print AddLastGetFirst Stack - " + Arrays.toString(arrayStackAddLastGetFirst.printStackAddLastGetFirst(arrayStackAddLastGetFirst.getMass())));
        System.out.println("----------");
    }
}

