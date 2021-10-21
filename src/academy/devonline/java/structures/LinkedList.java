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
public class LinkedList extends BaseDataStructure {

    private Item first;
    private Item last;


    private static class Item {
        int value;
        Item next;

        public Item(int value) {
            this.value = value;
        }
    }

    @Override
    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = item;
            last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    @Override
    public void add(LinkedList secondList) {
        if (secondList.count > 0) {
            if (first == null) {
                first = secondList.first;
            } else {
                last.next = secondList.first;
            }
            last = secondList.last;
            count += secondList.count;
        }
    }
    @Override
    public int[] toArray() {
        int[] mass = new int[count];
        int i = 0;
        Item current = first;
        while (current != null) {
            mass[i++] = current.value;
            current = current.next;
        }
        return mass;
    }
    @Override
    public boolean contains(int i) {
        return findPair(i) != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder().append('[');
        Item current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }
        return builder.append(']').toString();
    }

    @Override
    public void clear() {
        super.clear();
        first = null;
        last = null;
    }

    @Override
    public boolean remove(int value) {
        Pair pair = findPair(value);
        if (pair != null) {
            if (pair.curent == first && pair.curent == last) {  // в списке только один элемент - обновляем список
                first = null;
                last = null;
            } else if (pair.curent == first) { // если первый - обновляем ссылку first
                first = pair.curent.next;
            } else {
                pair.previus.next = pair.curent.next; // если любой другой - запрашиваем эл. с предыдущей ссылки и обновляем
                if (pair.curent == last) {  // если равняется последним
                    last = pair.previus;
                }
            }
            count--;
            return true;
        }
        return false;
    }

    private Pair findPair(int value) {
        Item previus = first;
        Item curent = first;

        while (curent != null) {
            if (curent.value == value) {
                return new Pair(previus, curent);
            } else {
                previus = curent;
                curent = curent.next;
            }
        }
        return null;
    }


    private static class Pair {     // создаем доп класс
        private final Item previus;
        private final Item curent;

        private Pair(Item previus, Item current) {   // создаем конструктор
            this.previus = previus;
            this.curent = current;
        }
    }


    public int get(int index) {
        if (index < 0) {
            return -1;
        } else {
            int size = this.count;
            Item current = first;
            int counter = 0;
            while (counter <= size) {
                if (counter == index) {
                    return current.value;
                }
                counter++;
                current = current.next;
            }
            return -1;
        }
    }

    public void set(int index, int value) {
        if (index >= 0) {
            int size = this.count;
            Item current = first;
            int counter = 0;
            while (counter <= size) {
                if (counter == index) {
                    current.value = value;
                    return;
                }
                current = current.next;
                counter++;
            };
        }
    }


}
