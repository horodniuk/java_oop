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

package academy.devonline.java.section021_inheritance;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class ObjectMetodGetClass {


    public static void main(String[] args) {
        ObjectMetodGetClass object = new ObjectMetodGetClass();
        System.out.println(object.getClass().getName());
        System.out.println(object.getClass().getSimpleName());

        Object object2 = new Object();
        System.out.println(object2.getClass().getName());
        System.out.println(object2.getClass().getSimpleName());

        Class object3 = new ObjectMetodGetClass().getClass();

    }
}
