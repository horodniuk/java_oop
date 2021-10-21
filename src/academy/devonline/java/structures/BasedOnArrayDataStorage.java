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

package academy.devonline.java.structures;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public abstract class BasedOnArrayDataStorage extends BaseDataStorege {
    protected static int[] mass;
    protected int size;


    public BasedOnArrayDataStorage(int size) {
        mass = new int[size];
    }

    public BasedOnArrayDataStorage() {
        this(5);
    }


    @Override
    final public void add(int value) {
        if (mass.length == size) {
            grow(mass.length == 0 ? 5 : mass.length * 2);
        }
        mass[size++] = value;
    }


    private void grow(int size) {
        int[] newArray = new int[size];
        System.arraycopy(mass, 0, newArray, 0, mass.length);
        mass = newArray;
    }

}
