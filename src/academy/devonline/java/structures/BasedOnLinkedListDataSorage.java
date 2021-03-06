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
public abstract class BasedOnLinkedListDataSorage extends BaseDataStorege {
    protected Item first;




    @Override
    public final void add(int value){

        Item item = new Item(value);  // создаем новый элемент односвязного списка
        if (first == null){ // если нет ниодного элемента в нашем списке
            first = item; // записываем первый элемент

        } else {
            addNextElement(item);
        }
        size++;  // добавляем счетчик колличества

    }

    protected abstract void addNextElement(Item item);


    @Override
    public int get() {
        if (size > 0)  {
            int result =  first.value; //записываем первый элемент
            first = first.next;
            size--;

            return result;
        } else {
            return 0;
        }
    }



 protected static class Item {
      protected   int value;
      protected   Item next;

        protected Item(int value) {
            this.value = value;
        }
    }

}
