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
public class ConstructorInvocationOrder {
    private static class Parent {

        private Parent() {
            System.out.println("Parent.<init>()");
        }
    }

    private static class Child extends Parent {

        private Child() {
            System.out.println("Child.<init>()");
        }
    }

    private static class Child2 {

        private Child2() {
            System.out.println("Child2.<init>()");
        }
    }

    public static void main(String[] args) {
        new Child2();
        new Child();
    }
}
