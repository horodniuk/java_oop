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

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class ArrayStackAddandGetLast implements Stack {
    private final int[] mass;
    private int countStackAddandGetLast;

    public ArrayStackAddandGetLast(int countMass) {
        mass = new int[countMass];
    }

    public int[] getMass() {
        return mass;
    }

    @Override
    public boolean push(final int value) {
        if (countStackAddandGetLast < mass.length) {
            mass[countStackAddandGetLast++] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (countStackAddandGetLast > 0){
            return mass[--countStackAddandGetLast];
        }
        return -1;
    }

    @Override
    public int size() {
        return countStackAddandGetLast;
    }

    public int [] printStackAddandGetLast(int [] mass){
        int stackSize = this.size();
        int [] stack = new int [stackSize];
        if (stack.length >= 0){
            System.arraycopy(mass, 0, stack, 0, stack.length);
        }
        return stack;
    }

}
